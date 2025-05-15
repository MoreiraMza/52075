import antlr4 from 'antlr4';
import analizadorVisitor from './generated/analizadorVisitor.js';

class CustomVisitor extends analizadorVisitor {
  constructor() {
    super();
    this.variables = {};
  }

  visitInstrucciones(ctx) {
    for (let i = 0; i < ctx.instruccion().length; i++) {
      this.visit(ctx.instruccion(i));
    }
  }

  visitInstruccion(ctx) {
    return this.visit(ctx.bucle());
  }

  visitBucle(ctx) {
    // Inicialización
    const varName = ctx.inicializacion().identificador().getText();
    const initialValue = parseInt(ctx.inicializacion().DIGITO(0).getText());
    this.variables[varName] = initialValue;

    // Condición
    const condVar = ctx.condicion().identificador().getText();
    const condOp = ctx.condicion().operador_relacional().getText();
    const condVal = parseInt(
      ctx.condicion().DIGITO().map(d => d.getText()).join('')
    ); // Ej: 1 0 → "10"

    // Actualización
    const updateVar = ctx.actualizacion().identificador().getText();
    const updateOp = ctx.actualizacion().operador_incremento().getText();

    let i = this.variables[condVar];

    while (this.evaluarCondicion(i, condOp, condVal)) {
      this.variables[condVar] = i; // Actualizar variable en memoria
      this.visit(ctx.sentencia());
      i = this.actualizarVariable(i, updateOp);
    }
  }

  evaluarCondicion(valor, operador, comparador) {
    switch (operador) {
      case '<': return valor < comparador;
      case '<=': return valor <= comparador;
      case '>': return valor > comparador;
      case '>=': return valor >= comparador;
      case '==': return valor === comparador;
      case '!=': return valor !== comparador;
      default: return false;
    }
  }

  actualizarVariable(valor, operador) {
    if (operador === '++') {
      return valor + 1;
    } else if (operador === '--') {
      return valor - 1;
    }
    return valor;
  }

  visitSentencia(ctx) {
    if (ctx.salida()) {
      return this.visitSalida(ctx.salida());
    }
    if (ctx.terminar()) {
      return this.visitTerminar(ctx.terminar());
    }
  }

  visitSalida(ctx) {
    const texto = this.obtenerTextoCadena(ctx.cadena().caracteres());
    console.log(texto);
  }

  obtenerTextoCadena(ctx) {
    if (!ctx) return '';
    if (ctx.caracter) {
      return ctx.caracter().getText();
    } else {
      return this.obtenerTextoCadena(ctx.caracteres()) + ctx.caracter().getText();
    }
  }

  visitTerminar(ctx) {
    console.log("break");
  }
}

export default CustomVisitor;

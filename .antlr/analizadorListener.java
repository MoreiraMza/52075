// Generated from c:/Users/faust/Downloads/52075/analizador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link analizadorParser}.
 */
public interface analizadorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link analizadorParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(analizadorParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(analizadorParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(analizadorParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(analizadorParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(analizadorParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(analizadorParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#bucle}.
	 * @param ctx the parse tree
	 */
	void enterBucle(analizadorParser.BucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#bucle}.
	 * @param ctx the parse tree
	 */
	void exitBucle(analizadorParser.BucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void enterInicializacion(analizadorParser.InicializacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void exitInicializacion(analizadorParser.InicializacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(analizadorParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(analizadorParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#actualizacion}.
	 * @param ctx the parse tree
	 */
	void enterActualizacion(analizadorParser.ActualizacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#actualizacion}.
	 * @param ctx the parse tree
	 */
	void exitActualizacion(analizadorParser.ActualizacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(analizadorParser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(analizadorParser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#operador_incremento}.
	 * @param ctx the parse tree
	 */
	void enterOperador_incremento(analizadorParser.Operador_incrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#operador_incremento}.
	 * @param ctx the parse tree
	 */
	void exitOperador_incremento(analizadorParser.Operador_incrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(analizadorParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(analizadorParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#salida}.
	 * @param ctx the parse tree
	 */
	void enterSalida(analizadorParser.SalidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#salida}.
	 * @param ctx the parse tree
	 */
	void exitSalida(analizadorParser.SalidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#terminar}.
	 * @param ctx the parse tree
	 */
	void enterTerminar(analizadorParser.TerminarContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#terminar}.
	 * @param ctx the parse tree
	 */
	void exitTerminar(analizadorParser.TerminarContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(analizadorParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(analizadorParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(analizadorParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(analizadorParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(analizadorParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(analizadorParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#caracteres}.
	 * @param ctx the parse tree
	 */
	void enterCaracteres(analizadorParser.CaracteresContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#caracteres}.
	 * @param ctx the parse tree
	 */
	void exitCaracteres(analizadorParser.CaracteresContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorParser#caracter}.
	 * @param ctx the parse tree
	 */
	void enterCaracter(analizadorParser.CaracterContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorParser#caracter}.
	 * @param ctx the parse tree
	 */
	void exitCaracter(analizadorParser.CaracterContext ctx);
}
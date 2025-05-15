import CustomVisitor from './CustomVisitor.js';
import antlr4 from 'antlr4';
import analizadorLexer from './generated/analizadorLexer.js';
import analizadorParser from './generated/analizadorParser.js';
import fs from 'fs';

// Leer archivo de entrada
const input = fs.readFileSync('./input.txt', 'utf8');
const chars = new antlr4.InputStream(input);

// Lexer
const lexer = new analizadorLexer(chars);
lexer.removeErrorListeners();
lexer.addErrorListener({
  syntaxError(recognizer, offendingSymbol, line, column, msg) {
    console.error(`🧨 Error léxico en línea ${line}, columna ${column}: ${msg}`);
  }
});

const tokens = new antlr4.CommonTokenStream(lexer);

// Parser
const parser = new analizadorParser(tokens);
parser.buildParseTrees = true;
parser.removeErrorListeners();
parser.addErrorListener({
  syntaxError(recognizer, offendingSymbol, line, column, msg) {
    console.error(`🚨 Error sintáctico en línea ${line}, columna ${column}: ${msg}`);
  }
});

// Árbol de derivación
const tree = parser.instrucciones();
console.log("🌳 Árbol de derivación:\n" + tree.toStringTree(parser.ruleNames));

// Tabla de tokens
console.log("📋 Tabla de Lexemas - Tokens:");
console.log("---------------------------------------");
console.log("|     Lexema     |       Token         |");
console.log("---------------------------------------");

tokens.fill();

tokens.tokens.forEach(token => {
  const typeIndex = token.type;
  const symbolicNames = lexer.constructor.symbolicNames;
  const typeName = symbolicNames?.[typeIndex] ?? `Token(${typeIndex})`;

  if (typeName !== 'WS' && token.text?.trim()) {
    console.log(`| ${token.text.padEnd(14)} | ${typeName.padEnd(20)} |`);
  }
});

console.log("---------------------------------------");

// Ejecutar código usando el visitor
const visitor = new CustomVisitor();
console.log("🚀 Resultado de la ejecución:\n");
visitor.visit(tree);

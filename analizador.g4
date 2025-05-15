grammar analizador;

instrucciones:
    instruccion
    | instrucciones instruccion
    ;

instruccion: bucle;

bucle:
    FOR PARENTESISI inicializacion DOS condicion DOS actualizacion PARENTESISD CORCHETEI sentencia CORCHETED
    ;

inicializacion:
    identificador IGUAL (DIGITO)+
    ;

condicion:
    identificador operador_relacional (DIGITO)+
    ;

actualizacion:
    identificador operador_incremento
    ;

operador_relacional:
    PACMANI
    | PACMANIIGUAL
    | PACMAND
    | PACMANDIGUAL
    | IGUALIGUAL
    | TRES
    ;

operador_incremento:
    MASMAS
    | GUIONGUION
    ;

sentencia:
    salida
    | salida sentencia
    | terminar
    ;

salida:
    IMPRIMIR PARENTESISI cadena PARENTESISD DOS
    ;

terminar:
    BO DOS
    ;

identificador:
    LETRA (LETRA | DIGITO)*
    ;

cadena:
    BACK caracteres BACK
    ;

caracteres:
    caracter
    | caracteres caracter
    ;

caracter:
    LETRA
    | DIGITO
    | SIMBOLO
    ;

// Palabras clave y símbolos
FOR: 'for';
PARENTESISI: '(';
PARENTESISD: ')';
DOS: ';';
CORCHETEI: '{';
CORCHETED: '}';
IGUAL: '=';
PACMANI: '<';
PACMANIIGUAL: '<=';
PACMAND: '>';
PACMANDIGUAL: '>=';
IGUALIGUAL: '==';
TRES: '!=';
MASMAS: '++';
GUIONGUION: '--';
IMPRIMIR: 'printf';
BO: 'break';
BACK: '\u0022';

// Tokens léxicos
LETRA: [a-zA-Z];
DIGITO: [0-9];
SIMBOLO: [!@#$%^&*_+|~`¡¿?];

WS: [ \t\r\n]+ -> skip;

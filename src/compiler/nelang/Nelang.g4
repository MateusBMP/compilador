grammar Nelang;

/*
 * Parser Rules
 */

nelang: label* EOF ;

label: SPACE* initLabel statement* endLabel ;

initLabel: INIT SPACE+ IDENTIFIER endLine+ ;
endLabel: END SPACE+ IDENTIFIER (endLine+ | EOF) ;

statement: SPACE* declaration endLine+
         | SPACE* expect endLine+
         | SPACE* export endLine+
         | SPACE* assignment endLine+
         | SPACE* sum endLine+
         | SPACE* minus endLine+
         | SPACE* multiply endLine+
         | SPACE* divide endLine+
         | SPACE* print endLine+ 
         | SPACE* goto endLine+ 
         | SPACE* if endLine+ 
         | SPACE* while endLine+ ;

endLine: SPACE* NEWLINE;

declaration: DECLARE (SPACE+ IDENTIFIER)+ ;
expect: EXPECT (SPACE+ IDENTIFIER)+ ;
export: EXPORT (SPACE+ IDENTIFIER)+ ;
assignment: ASSIGN SPACE+ IDENTIFIER SPACE+ valuePosition ;
sum: SUM SPACE+ IDENTIFIER SPACE+ valuePosition ;
minus: MINUS SPACE+ IDENTIFIER SPACE+ valuePosition ;
multiply: MULTIPLY SPACE+ IDENTIFIER SPACE+ valuePosition ;
divide: DIVIDE SPACE+ IDENTIFIER SPACE+ valuePosition ;
print: PRINT (SPACE+ IDENTIFIER)* ;
goto: GOTO SPACE+ IDENTIFIER ;
if: IF SPACE+ compare SPACE+ goto (SPACE+ else)? ;
else: ELSE SPACE+ goto ;
while: WHILE SPACE+ compare SPACE+ goto ;

compare: valuePosition SPACE+ OPERATOR SPACE+ valuePosition ;
valuePosition: identifierAsValue | integerAsValue ;

identifierAsValue: IDENTIFIER ;
integerAsValue: INTEGER ;

/*
 * Lexer Rules
 */

ASSIGN: 'ASSIGN' ;
GOTO: 'GOTO' ;
DECLARE: 'DECLARE' ;
DIVIDE: 'DIVIDE' ;
ELSE: 'ELSE' ;
END: 'END' ;
EXPECT: 'EXPECT' ;
EXPORT: 'EXPORT' ;
FI: 'FI' ;
IF: 'IF' ;
INIT: 'INIT' ;
MINUS: 'MINUS' ;
MULTIPLY: 'MULTIPLY' ;
PRINT: 'PRINT' ;
SUM: 'SUM' ;
WHILE: 'WHILE' ;

OPERATOR: 'EQ' | 'NE' | 'LT' | 'LE' | 'GT' | 'GE' ;
INTEGER: ('+' | '-')? [0-9]+ ;
IDENTIFIER: [a-z]+ ;
NEWLINE: '\r'? '\n' ;
SPACE: ' ' | '\t' ;

grammar Nelang;

/*
 * Parser Rules
 */

nelang: label* EOF ;

label: initLabel statement* endLabel ;

initLabel: INIT SPACE+ IDENTIFIER endLine ;
endLabel: END SPACE+ IDENTIFIER (endLine | EOF) ;

statement: declaration endLine
         | assignment endLine
         | sum endLine
         | minus endLine
         | multiply endLine
         | divide endLine
         | print endLine 
         | goto endLine 
         | if endLine ;

endLine: SPACE* NEWLINE;

declaration: DECLARE SPACE+ IDENTIFIER ;
assignment: ASSIGN SPACE+ IDENTIFIER SPACE+ valuePosition ;
sum: SUM SPACE+ IDENTIFIER SPACE+ valuePosition ;
minus: MINUS SPACE+ IDENTIFIER SPACE+ valuePosition ;
multiply: MULTIPLY SPACE+ IDENTIFIER SPACE+ valuePosition ;
divide: DIVIDE SPACE+ IDENTIFIER SPACE+ valuePosition ;
print: PRINT SPACE+ IDENTIFIER ;
goto: GOTO SPACE+ IDENTIFIER ;
if: IF SPACE+ compare SPACE+ goto (SPACE+ else)? ;
else: ELSE SPACE+ goto ;

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
FI: 'FI' ;
IF: 'IF' ;
INIT: 'INIT' ;
MINUS: 'MINUS' ;
MULTIPLY: 'MULTIPLY' ;
PRINT: 'PRINT' ;
SUM: 'SUM' ;

OPERATOR: 'EQ' | 'NE' | 'LT' | 'LE' | 'GT' | 'GE' ;
INTEGER: ('+' | '-')? [0-9]+ ;
IDENTIFIER: [a-z]+ ;
NEWLINE: '\r'? '\n' ;
SPACE: ' ' | '\t' ;

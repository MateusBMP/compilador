grammar Nelang;

/*
 * Parser Rules
 */

nelang: initNLG statement* endNLG ;

initNLG: 'INIT NLG' endStatement ;
endNLG: 'END NLG' (endStatement | EOF) ;

statement: declaration endStatement
         | assignment endStatement
         | sum endStatement
         | minus endStatement
         | multiply endStatement
         | divide endStatement
         | print endStatement ;

endStatement: SPACE* NEWLINE;

declaration: DECLARE SPACE+ IDENTIFIER ;
assignment: ASSIGN SPACE+ IDENTIFIER SPACE+ valuePosition ;
sum: SUM SPACE+ IDENTIFIER SPACE+ valuePosition ;
minus: MINUS SPACE+ IDENTIFIER SPACE+ valuePosition ;
multiply: MULTIPLY SPACE+ IDENTIFIER SPACE+ valuePosition ;
divide: DIVIDE SPACE+ IDENTIFIER SPACE+ valuePosition ;
print: PRINT SPACE+ IDENTIFIER ;

valuePosition: identifierAsValue | integerAsValue ;

identifierAsValue: IDENTIFIER ;
integerAsValue: INTEGER ;

/*
 * Lexer Rules
 */

DECLARE: 'DECLARE';
ASSIGN: 'ASSIGN';
SUM: 'SUM';
MINUS: 'MINUS';
MULTIPLY: 'MULTIPLY';
DIVIDE: 'DIVIDE';
PRINT: 'PRINT';

INTEGER: ('+' | '-')? [0-9]+;
IDENTIFIER: [a-z]+;
NEWLINE: '\r'? '\n';
SPACE: ' ' | '\t';

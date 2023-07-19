grammar Expr;

expr: expr '+' term 
    | expr '-' term 
    | term;

term: term '*' fact
    | term '/' fact
    | fact;

fact: DIGIT
    | '(' expr ')';

DIGIT: [0-9];
WS: [ \t\r\n]+ -> skip;

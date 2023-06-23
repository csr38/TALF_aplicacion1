grammar MyGrammar;
options {
  language = Java;
}

@header {
  package org.example;

  import java.util.Map;
  import java.util.HashMap;
}

ID : [a-zA-Z]+;
INT : [0-9]+;
NEWLINE : '\r'? '\n' ;
WS : [ \t]+ -> skip ;

program : statement+;

statement : comment
          | getInput
          | assignment
          | whileLoop
          | ifStatement
          | putOutput
          | expression;

comment : '//' expression NEWLINE
        | comment statement;

assignment : ID expression ';'
           | assignment NEWLINE
           | assignment statement;

whileLoop : 'while' '(' expression ')' '{' statement* '}'
            |'while' '(' expression ')' NEWLINE
            |'while' '(' expression ')' '{' NEWLINE
            |'{'
            | '}'
            | 'while'
            | '{' statement* '}' NEWLINE
            | whileLoop NEWLINE
            | whileLoop statement;

ifStatement : 'if' '(' expression ')' '{' statement* '}'
            |'if' '(' expression ')' NEWLINE '{' statement* '}'
            | 'else' '{' statement* '}'
            | 'else' NEWLINE '{' statement* '}'
            | ifStatement NEWLINE
            | ifStatement statement;

putOutput : 'put' expression ';'
            | putOutput NEWLINE
            | putOutput statement;

getInput : 'get' expression ';'
         | getInput NEWLINE
         | getInput statement;




expression :' '
           |ID
           | ID expression
           | INT
           | INT expression
           | expression ('/' | '*' | '+' | '-' |'==' | '!=' | '<=' | '>=' | '<' | '>' | '=') expression
           | '(' expression ')'
           | expression NEWLINE
           | expression statement;


grammar picalc;
program :
            'run' proc                          //Programs
        ;

proc
        :   val OUTPUT val                          // Output atom
        |   val INPUT abs                           // Input prefix
        |   val RINPUT abs                          // Replicated input prefix
        |   OP CP                                   // Empty process
        |   OP proc PC proc CP                      // Parallel composition
        |   OP dec proc CP                          // Local declaration
        |   'if' val 'then' proc 'else' proc        // Conditional
        ;

dec
        :   'new' ID CL type
        |   'def' ID abs ('and' ID abs)+
        |   'type' ID EQ type
        ;

pat
        :   ID otype
        |   OSB (label pat)+ CSB
        |   US otype
        //   ID otype '@' pat                    //Destroy it
        ;

otype
        :   (CL type)?
        ;

type
        :   PW type
        |   OSB (label type )* CSB
        |   ('Boolean' | 'Char' | 'Int' | 'String')
        ;

abs
        :   pat EQ proc
        ;

val
        :   path
        |   OSB (label val)+ CSB
        |   (BOOL | CHAR | INT | STRING)
        ;

path
        :   ID OB (DOT ID)* CB
        ;

label
        :   (ID EQ)?
        ;

OP : '(';
CP : ')';
OB: '{';
CB: '}';
OSB: '[';
CSB: ']';
EQ: '=';
DOT: '.';
PW: '^';
CL: ':';
US: '_';
PC: '|';
OUTPUT: '!';
INPUT: '?';
RINPUT: '?*';
BOOL : ('True' | 'False');
CHAR : '\''[a-zA-Z0-9_]'\'';                //fix
INT : [0-9]+;
STRING: '"'[a-zA-Z0-9 ]*'"';
ID : [a-zA-Z][a-zA-Z0-9_]*;
WS : [ \t\r\n]+ -> skip ;
grammar picalc;
program :
            'run' proc                          //Programs
        ;

proc
        :   (val | ID) OUTPUT (val | ID)            // Output atom
        |   (val | ID) INPUT (abs | ID)             // Input prefix
        |   (val | ID) RINPUT (abs | ID)            // Replicated input prefix
        |   OP CP                                   // Empty process
        |   OP proc PC proc CP                      // Parallel composition
        |   OP dec proc CP                          // Local declaration
        |   'if' val 'then' proc 'else' proc        // Conditional
        |   (val | ID) INPUT ID EQ 'print' OUTPUT STRING
        ;

dec
        :   'new' ID CL type
        |   'def' ID abs ('and' ID abs)*
        |   'type' ID EQ type
        ;

pat
        :   ID otype
        |   OSB (label pat)* CSB
        |   US otype                             // What is Under Score!?
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
        |   OSB (ID)* CSB
        ;

val
        :   path
        |   OSB ((label val)* | (ID)*) CSB
        |   (BOOL | CHAR | INT | STRING)
        ;

path
        :   ID (DOT ID)*
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
STRING: '"'~["\\\r\n]*'"';
ID : [a-zA-Z][a-zA-Z0-9_]*;
WS : [ \t\r\n]+ -> skip ;
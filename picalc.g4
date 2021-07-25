grammar picalc;
program :
            'run' proc                          //Programs
        ;

proc
        :   val '!' val                         // Output atom
        |   val '?' abs                         // Input prefix
        |   val '?*' abs                        // Replicated input prefix
        |   '(' ')'                             // Empty process
        |   '(' proc | proc ')'                 // Parallel composition
        |   '(' dec proc ')'                    // Local declaration
        |   'if' val 'then' proc 'else' proc    // Conditional
        ;

dec
        :   'new' ID ':' type
        |   'def' ID abs ('and' ID abs)+
        |   type ID '=' type
        ;

pat
        :   ID otype
        |   '[' (label pat)+ ']'
        |   '_' otype
        |   ID otype '@' pat                    //Destroy it
        ;

otype
        :   '[' (':' type)? ']'
        ;

type
        :   '^' type
        |   '[' (label type)+ ']'
        |   ('Boolean' | 'Char' | 'Int' | 'String')
        ;

abs
        :   pat '=' proc
        ;

val
        :   path
        |   '[' (label val)+ ']'
        |   (BOOL | CHAR | INT | STRING)
        ;

path
        :   ID '{' ('.' ID)* '}'
        ;

label
        :   '[' (ID '=')? ']'
        ;

BOOL : ('True' | 'False');
CHAR : [a-zA-Z];
INT : [0-9]+;
STRING: '"'[a-zA-Z0-9 ]*'"';
ID : CHAR+;
WS : [ \t\r\n]+ -> skip ;
grammar Decaf;

/*LEXER RULES*/

CLASS : 'class';
VOID : 'void';
INT : 'int';
BOOL : 'boolean';
IF : 'if';
ELSE : 'else';
FOR : 'for';
RETURN : 'return';
BREAK : 'break';
CONTINUE : 'continue';
CALLOUT : 'callout';

LSQUARE : '[';
RSQUARE : ']';
LCURLY : '{';
RCURLY : '}';
LROUND : '(';
RROUND : ')';
SEMI : ';';
COMMA : ',';
DOUBLEQUOTE : '"';
SINGLEQUOTE : '\'';

EQ : '=';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
MOD : '%';

GREATER : '>';
LESS : '<';
GREATEREQ : '>=';
LESSEQ : '<=';
EQTO : '==';
PLUSEQ : '+=';
MINUSEQ : '-=';
NOTEQ : '!=';
EXCLAMATION : '!';
AND : '&&';
OR : '||';
TRUE : 'true';
FALSE : 'false';
DBLSLASH : '//';

ID : ALPHA ALPHA_NUM*;
fragment ALPHA : [a-zA-Z_];
fragment ALPHA_NUM : ALPHA | DIGIT;
fragment DIGIT : [0-9];
fragment CHAR : [\u0020-\u007E];

INT_LITERAL : DECIMAL_LITERAL | HEX_LITERAL;
fragment DECIMAL_LITERAL : DIGIT DIGIT*;
fragment HEX_LITERAL : '0x' HEX_DIGIT HEX_DIGIT*; 
fragment HEX_DIGIT : DIGIT | [a-fA-F];
CHAR_LITERAL : SINGLEQUOTE CHAR SINGLEQUOTE;
STRING_LITERAL : DOUBLEQUOTE CHAR+ DOUBLEQUOTE;
BOOL_LITERAL : TRUE | FALSE;

COMMENT : DBLSLASH ~'\n'* '\n' -> skip;

// Remove whitespace
WS : [ \t\r\n]+ -> skip;

/*parser rules*/

program : CLASS ID LCURLY field_decl* method_decl* RCURLY EOF;

field_decl : data_type field_arg ( COMMA field_arg )* SEMI;

method_decl : (data_type | VOID) ID LROUND (method_arg (COMMA method_arg)*)? RROUND block;

method_arg: data_type ID;

field_arg: ID | ID LSQUARE INT_LITERAL RSQUARE;

data_type : INT | BOOL;

block : LCURLY var_decl* statement* RCURLY;

var_decl : data_type ID (COMMA ID)* SEMI;

statement : location assign_op expr SEMI
			| method_call SEMI
			| IF LROUND expr RROUND block ( ELSE block )?
			| FOR ID EQ expr COMMA expr block
			| RETURN ( expr )? SEMI
			| BREAK SEMI
			| CONTINUE SEMI
			| block;
			
location : ID | ID LSQUARE expr RSQUARE;

assign_op : EQ | PLUSEQ | MINUSEQ;

expr : location 
	   | method_call
	   | literal
	   | expr bin_op expr
	   | SUB expr
	   | EXCLAMATION expr
	   | LROUND expr RROUND;
	   
method_call : method_name LROUND ( expr (COMMA expr)* )? RROUND
			  | CALLOUT LROUND STRING_LITERAL ( COMMA callout_arg (COMMA callout_arg)* )? RROUND;
			  
literal : INT_LITERAL | BOOL_LITERAL | CHAR_LITERAL;

bin_op : arith_op | rel_op | eq_op | cond_op;

arith_op : ADD | SUB | MUL | DIV | MOD;

rel_op : GREATER | LESS | GREATEREQ | LESSEQ;

eq_op : EQTO | NOTEQ;

cond_op : AND | OR;

method_name : ID;

callout_arg : expr | LSQUARE expr RSQUARE;
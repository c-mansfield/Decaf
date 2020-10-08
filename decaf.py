import antlr4 as ant
from DecafLexer import DecafLexer

filein = open('test.dcf', 'r')
lexer = DecafLexer(ant.InputStream(filein.read()))

tokens = lexer.getAllTokens()

for token in tokens:
    print(lexer.symbolicNames[token.type])
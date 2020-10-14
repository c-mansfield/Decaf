import os

#Run antlr4 commands
os.system("antlr4 Decaf.g4")
os.system("javac *.java")

#Get list of all files in parser tests
parserFiles = os.listdir("C:/Users/Cole/Documents/Uni/ProgrammingLanguages/Compilers/Coursework/testdata/parser/")

#Throw error in console for parse tree
for p in parserFiles:

    print(p,':')
    tmp = os.system("cls")
    os.system("grun Decaf program testdata/parser/" + p)
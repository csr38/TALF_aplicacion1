package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFile = "C:\\Users\\cesar\\IdeaProjects\\TALF_aplicacion1\\input.txt";
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);

        ANTLRInputStream inputStream = new ANTLRInputStream(is);
        // Crear el lexer
        MyGrammarLexer lexer = new MyGrammarLexer(inputStream);

        // Crear el stream de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crear el parser
        MyGrammarParser parser = new MyGrammarParser(tokens);

        // Obtener el árbol de análisis
        ParseTree tree = parser.program();


        // Crear el listener
        MyListener listener = new MyListener();

        listener.visit(tree);


        // Obtener las variables declaradas y no utilizadas
        Set<String> unusedVariables = listener.getUnusedVariables();

        // Imprimir las variables no utilizadas
        System.out.println("Variables no utilizadas:");
        for (String variable : unusedVariables) {
            System.out.println(variable);
        }
    }

    public static class MyListener extends MyGrammarBaseVisitor {
        private Set<String> declaredVariables;
        private Set<String> usedVariables;

        public MyListener() {
            declaredVariables = new HashSet<>();

            usedVariables = new HashSet<>();
        }

        @Override
        public Object visitComment(MyGrammarParser.CommentContext ctx) {
            String value = ctx.getText();
            String[] val = value.split("\n");
            String[] cadena;
            for(String o: val){
                cadena = o.split(" ");
                String s = cadena[0];
                for(String p: cadena){

                    if(p.length()==1) {

                        char c = p.charAt(0);
                        if(c >= 'a' && c <= 'z' || (c>='A' && c <= 'Z') ){

                            if(declaredVariables.contains(String.valueOf(c))) {
                                usedVariables.add(String.valueOf(c));
                            }else {
                                declaredVariables.add(String.valueOf(c));
                            }
                        }
                    }
                }
            }
            return 0;
        }



        public Set<String> getUnusedVariables() {
            Set<String> unusedVariables = new HashSet<>(declaredVariables);
            unusedVariables.removeAll(usedVariables);
            return unusedVariables;
        }
    }
}
// 1 - Escreva qual a funcionalidade de 5 métodos da Interface List. Faça um programa Java que demonstre o funcionamento dos 5 métodos que foram escolhidos.

import java.util.ArrayList;
import java.util.List;

public class Teste {

       public static void main(String [] args) {
             List<String> nomes = new ArrayList<String>();
             nomes.add("Grazielle");
             nomes.add("Erick");
             nomes.add("João");
             nomes.add("Maria");
            
             System.out.println("\n"+nomes);

             nomes.remove("Maria");
            
             // using remove() method
             System.out.print("\nNomes após remoção manual\n");
             System.out.println(nomes);
             
             // using size() method
             System.out.println("\nNúmero de elementos: " + nomes.size());
             }
       }

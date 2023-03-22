/* Escreva qual é a funcionalidade da classe Collections. Em qual versão da
linguagem Java foi incluída a classe Collections. Faça um programa Java que
demonstre o funcionamento da classe Collections. */

/*Para atender a essas necessidades, a partir de Java 1.2, foi criado um conjunto de interfaces e classes denominado Collections Framework, que faz parte do pacote java.util. */


import java.util.*;

public class Exe2 {

  public static void main(String[] args) {
    List<String> lista = new ArrayList<String>();
    lista.add("Erick ");
    lista.add("Grazielle");
    lista.add("Rosa");
    System.out.println(lista);
  }

}



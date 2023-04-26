/*Faça um programa que leia uma frase e informe o número de palavras não repetidas da frase,
utilize uma coleção HashSet. */

package Lista 6 de Exercicios;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Exe2 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> palavras = new HashSet<>();

        System.out.println ("\nDigite uma Frase: ");
        String frase = scanner.nextLine();
        String[] palavrasFrase = frase.split(" ");

        for (String palavra : palavrasFrase) {
            palavras.add(palavra);
        }
        System.out.println ("\nNúmero de palavras que não são repetidas na frase: "+ palavras.size());
    }
}

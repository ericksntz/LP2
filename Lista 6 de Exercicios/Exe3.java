/*Faça um programa que leia várias frases e informe o número de ocorrências de cada palavra da
frase, utilize Map para fazer essa contagem. O usuário pode digitar uma ou várias frases. */

package Lista 6 de Exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exe3 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);
        Map<String, Integer> contadorPalavras = new HashMap<>();

        System.in.println ("Digite Frases (ou aperte Enter para encerrar): ");
        String cidade = scanner.nextLine();
    }
}

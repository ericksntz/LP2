/*Lista de Exercícios – Linguagem de Programação 2

1 – Escreva um programa Java com uma função principal main que execute as seguintes ações:
• que solicite nomes de cidades ao usuário;
• o programa pode cadastrar diversos nomes de cidades;
• criar um mapa para armazenar chaves como String e valores como Integer;
• armazenar no mapa o nome da cidade como chave e a quantidade de letras do nome da
cidade como valor;
• após o usuário realizar os cadastros o programa deve apresentar todas informações
armazenadas no mapa*/

package Lista 6 de Exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exe1 {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> mapaCidades = new HashMap<>();

    System.out.println ("\nDigite o nome de uma Cidade (ou aperte Enter para encerrar): ");
    String cidade = scan.nextLine();

    while (!cidade.equals("")) {
        int tamanhoCidade = cidade.length();
        mapaCidades.put (cidade, tamanhoCidade);

        System.out.println ("\nDigite o nome de uma cidade (ou aperte Enter para encerrar): ");   
        cidade = scan.nextLine();
    }

    System.out.println ("\nCidades cadastradas e o seu tamanho:\n");
    for (Map.Entry<String,Integer> entry : mapaCidades.entrySet()) {
     System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

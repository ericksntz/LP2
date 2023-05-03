/*Exercícios IO Java – Linguagem de Programação 2

1. Escreva o código fonte de um programa Java que solicite ao usuário o nome do
arquivo de leitura, utilizando o tratamento de exceções para arquivos que não
existem, caso o arquivo não exista o programa deve solicitar novamente ao
usuário o nome do arquivo de leitura. O programa deve solicitar o nome do
arquivo de leitura até receber um nome de arquivo que existe. Quando o
programa receber um nome de arquivo que existe, deve imprimir na tela do
computador os números inteiros que representam os bytes armazenados no
arquivo.*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExercicioIO1 { 
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        boolean condition = true;
    do {
    
        try {
        System.out.println ("Digite o nome do Arquivo: ");
        String arquivo = sc.nextLine();
        FileInputStream in = new FileInputStream( arquivo );
        condition = false;
            
        }
        catch(IOException e) {
            System.out.println("ARQUIVO NÃO ENCONTRADO OU INEXISTENTE!");
        }
    }
    while (condition); 
        System.out.println ("Arquivo Encontrado.");
    }
}

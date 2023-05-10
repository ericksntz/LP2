/*Escreva o código fonte de um programa Java que crie 10 números aleatórios
entre 1 e 100, ordene os valores de forma crescente, e grave os valores pares no
arquivo “pares.txt” e os número impares no arquivo “impares.txt”.*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class Exe3 {

    public static void main (String[]args) {
Random random = new Random();
ArrayList <Integer> lista = new ArrayList<Integer>();

for( int a = 0; a < 10; a++)
lista.add (random.nextInt(100));

Collections.sort (lista );

FileOutputStream saida1 = null;
FileOutputStream saida2 = null;

try {
saida1 = new FileOutputStream ("pares.txt");
saida2 = new FileOutputStream ("impares.txt");
    for (Integer x: lista)
        if ( x % 2 == 0) {
        saida1.write (x);
}
        else
        saida2.write(x);
    }
catch  (IOException e) {
    e.printStackTrace();
        }
    }
}
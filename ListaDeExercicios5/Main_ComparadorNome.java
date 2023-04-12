package ListaDeExercicios5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main_ComparadorNome {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Erick"));
        usuarios.add(new Usuario("Grazielle"));
        usuarios.add(new Usuario("Domingos"));

        System.out.println("Lista de usuários antes da ordenação:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

        Comparator<Usuario> comparatorNome = new ComparatorNome();
        Collections.sort(usuarios, comparatorNome);
        
        System.out.println("\nLista de usuários após a ordenação pelo nome:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}

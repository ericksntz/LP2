package ListaDeExercicios5;

import java.util.Comparator;

public class ComparatorNome implements Comparator<Usuario> {

    public int compare(Usuario usuario1, Usuario usuario2) {
        return usuario1.getNome().compareTo(usuario2.getNome());
    }
}

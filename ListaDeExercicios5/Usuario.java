package ListaDeExercicios5;
import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
    private String nome;
    private ArrayList<Post> lista;

        public Usuario(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<>();
    }

        public Usuario(String nome, ArrayList<Post> lista) {
        this.nome = nome;
        this.lista = lista;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Post> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Post> lista) {
        this.lista = lista;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(getNome(), usuario.getNome()) &&
                Objects.equals(getLista(), usuario.getLista());
    }

    public int hashCode() {
        return Objects.hash(getNome(), getLista());
    }

    public String toString() {
        return "Usuario{" + "nome='" + nome + '\'' + ", lista=" + lista + '}';
    }
}

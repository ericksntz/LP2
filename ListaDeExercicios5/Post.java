package ListaDeExercicios5;
import java.time.LocalDateTime;
import java.util.Objects;

public class Post implements Comparable<Post> {
    private LocalDateTime dataHorario;
    private String textoPost;

    public Post(LocalDateTime dataHorario, String textoPost) {
        this.dataHorario = dataHorario;
        this.textoPost = textoPost;
    }

    public LocalDateTime getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(LocalDateTime dataHorario) {
        this.dataHorario = dataHorario;
    }

    public String getTextoPost() {
        return textoPost;
    }

    public void setTextoPost(String textoPost) {
        this.textoPost = textoPost;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post)) return false;
        Post Post = (Post) o;
        return Objects.equals(getDataHorario(), Post.getDataHorario()) &&
                Objects.equals(getTextoPost(), Post.getTextoPost());
    }

    public int hashCode() {
        return Objects.hash(getDataHorario(), getTextoPost());
    }

    public String toString() {
        return "Post{" + "dataHorario=" + dataHorario + ", textoPost='" + textoPost + '\'' + '}';
    }

    public int compareTo(Post o) {
        return this.dataHorario.compareTo(o.dataHorario);
    }
}
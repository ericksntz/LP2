package ListaDeExercicios5;
import java.util.Collections;
import java.time.LocalDateTime;

public class Post3 {
    public static void main(String[] args) {
    Usuario usuario = new Usuario("Erick");

    Post post1 = new Post(LocalDateTime.of(2022, 1, 3, 10, 30), "Primeiro post");
    Post post2 = new Post(LocalDateTime.of(2022, 1, 5, 15, 45), "Segundo post");
    Post post3 = new Post(LocalDateTime.of(2022, 1, 7, 20, 15), "Terceiro post");

    usuario.getLista().add(post1);
    usuario.getLista().add(post2);
    usuario.getLista().add(post3);

    System.out.println("\nLista de Posts do Usuário em formato decrescente:\n");
    Collections.sort(usuario.getLista(), Collections.reverseOrder());
    for (Post post : usuario.getLista()) {
        System.out.println(post);
        }
    }
}
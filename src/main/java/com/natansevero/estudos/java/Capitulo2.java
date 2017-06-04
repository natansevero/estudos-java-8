

package com.natansevero.estudos.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author natan
 */
public class Capitulo2 {
    public static void main(String ... args) {
        Usuario user1 = new Usuario("Natan Severo", 400);
        Usuario user2 = new Usuario("Rodrigo Bento", 300);
        Usuario user3 = new Usuario("Rudan Lucena", 500);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        // Primeira Forma
        for(Usuario u : usuarios) System.out.println(u.getNome());

        // Segunda Forma. Usando forEach que recebe um Consumer
        usuarios.forEach(new Consumer<Usuario>() {
            @Override
            public void accept(Usuario u){
                System.out.println(u.getNome());
            }
        });

        // Terceira Forma. Lambdas!
        usuarios.forEach(u -> System.out.println(u.getNome()));

    }
}


package com.natansevero.estudos.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author natan
 */
public class Capitulo4 {
    public static void main(String... args) {
        Usuario user1 = new Usuario("OPa", 45);
        Usuario user2 = new Usuario("OPa1", 445);
        Usuario user3 = new Usuario("OPa2", 435);
        
        // Lista imutavel
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
        
        // 4.2 
        Consumer<Usuario> mostraMensagem = u -> System.out.println("Essa é a mensagem a ser mostrada antes de cada interação");
        
        Consumer<Usuario> imprimeNomes = u -> System.out.println(u.getNome());
        
        usuarios.forEach(mostraMensagem.andThen(imprimeNomes)); 
        
        // 4.3 -> Método removeIf
        // Forma 1
        Predicate<Usuario> predicado = new Predicate<Usuario>() {
            @Override
            public boolean test(Usuario u){
                return u.getPontos() > 100;
            }
        };
        
        // Forma 2
        List<Usuario> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        
        users.removeIf(u -> u.getPontos() > 100 );
        users.forEach(u -> System.out.println(u.getNome()));
        
        
        
    }
}

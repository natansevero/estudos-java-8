/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natansevero.estudos.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 * @author natan
 */
public class Capitulo6 {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Natan Severo", 150);
	Usuario user2 = new Usuario("Rudan Lucena", 120);
	Usuario user3 = new Usuario("Juan Pablo", 190);

	List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
        
        // Forma 1
        Consumer<Usuario> consumidor = (u) -> u.tornaModerador();
        usuarios.forEach(consumidor);
        
        // Forma 2
        usuarios.forEach(Usuario::tornaModerador);
        
        // 6.2
        // Forma 1
        Function<Usuario, String> byName = Usuario::getNome;
        usuarios.sort(Comparator.comparing(byName));
        
        // Forma 2
        usuarios.sort(Comparator.comparing(Usuario::getNome));
        
        // 6.3
        // Forma 1
        usuarios.sort(Comparator.comparingInt(Usuario::getPontos));
        
        // Forma 2 - Comparando pelos pontos. Se empate, compare pelo nome .thenComparing
        usuarios.sort(Comparator.comparingInt(Usuario::getPontos)
                                .thenComparing(Usuario::getNome));
        
        // 6.4 - Referencia para metodos de instancia
        Usuario natan = new Usuario("Natan S", 78);
        Runnable bloco = natan::tornaModerador;
        bloco.run();
        
        // 6.5
        usuarios.forEach(System.out::println);
        
        
    }
}

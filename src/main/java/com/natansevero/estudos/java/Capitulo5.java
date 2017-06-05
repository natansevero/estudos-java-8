/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natansevero.estudos.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author natan
 */
public class Capitulo5 {
    
    public static void main(String[] args) {
        Usuario user1 = new Usuario("APa", 45);
        Usuario user2 = new Usuario("ZPa1", 445);
        Usuario user3 = new Usuario("BPa2", 435);
        
        // Lista imutavel
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
        
        //5.1 
        // Forma 1
        Comparator<Usuario> comparador = new Comparator<Usuario>() {
            @Override
            public int compare(Usuario u1, Usuario u2){
                return u1.getNome().compareTo(u2.getNome());
            }   
        };
        
        Collections.sort(usuarios, comparador);
        
        // Forma 2
        Comparator<Usuario> comparador2 = (u1, u2) -> u1.getNome().compareTo(u2.getNome());
        Collections.sort(usuarios, comparador2);
        
        // Forma 3
        Collections.sort(usuarios, (u1, u2) -> u1.getNome().compareTo(u2.getNome()));
        
        // 5.3
        // Forma 1
        Comparator<Usuario> comparador3 = Comparator.comparing(u -> u.getNome());
        usuarios.sort(comparador3);
        
        //Forma 2
        usuarios.sort(Comparator.comparing(u -> u.getNome()));
        
        
        // Ordenando em ordem natural
        List<String> nomes = Arrays.asList("Natan", "Rudan", "Alexa");
        nomes.sort(Comparator.naturalOrder());
        
        //  
        
        
        
        
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natansevero.estudos.java;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
        
/**
 *
 * @author natan
 */
public class Capitulo3 {
    public static void main(String ... args) {
        
        // Primeria forma
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i <= 100; i++) System.out.println(i);
            }
        };
        new Thread(r1).start();
        
        // Segunda forma
        Runnable r2 = () -> {
            // Código
        };
        new Thread(r2).start();
        
        // Terceira Forma
        new Thread(() -> System.out.println("Codigo")).start();
        
        
        //3.1
        Button button = new Button();
        
        // Primeira Forma
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // codigo
            }
        });
        
        // Segunda Forma
        button.addActionListener(event -> System.out.println(event.toString()));
            
        //3.2
        
        // Primeria forma
        Validator<String> validatorCEP = new Validator<String>() {
            @Override
            public boolean valida(String valor) {
                return valor.matches("");
            }
        };
        
        // Segunda Forma
        Validator<String> validator = valor -> valor.matches("");
    }
}

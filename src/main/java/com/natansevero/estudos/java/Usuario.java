/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.natansevero.estudos.java;

/**
 *
 * @author natan
 */
class Usuario {
    private String nome;
    private int pontos;
    private boolean moderador;

    public Usuario(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
        this.moderador = false;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void tornaModerador() {
        this.moderador = true;
    }
    
    public boolean isModerador() {
        return moderador;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", pontos=" + pontos + ", moderador=" + moderador + '}';
    }
  
}

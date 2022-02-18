/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

/**
 *
 * @author PhillipeSilva
 */
public class Usuario {
    
     int Id;
     private String nome;

    public Usuario() {
    }

    public Usuario(int Id, String nome) {
        this.Id = Id;
        this.nome = nome;
    }

    public int getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
     
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade_Exercicio_3;

/**
 *
 * @author Henrique
 */
public class Entidade_Exercicio_3 {
    
    private String nome;
    private String email;
    private int numeroQuarto;

    public Entidade_Exercicio_3(String nome, String email, int numeroQuarto) {
        this.nome = nome;
        this.email = email;
        this.numeroQuarto = numeroQuarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }   
    
    public String toString() {
        return numeroQuarto
            + ", "   
            + nome
            + ", "
            + email;            
    }
}

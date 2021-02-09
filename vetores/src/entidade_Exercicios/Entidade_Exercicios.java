/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade_Exercicios;

/**
 *
 * @author Henrique
 */
public class Entidade_Exercicios {
    
    private String nome;
    private double preco;
    
    public Entidade_Exercicios(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

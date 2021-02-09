/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_2;

import entidade_Exercicios.Entidade_Exercicios;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Exercicios_2 {
    
    public static void main(String[] args) {
     
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        Entidade_Exercicios[] vetor = new Entidade_Exercicios[n];
        
        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            
            vetor[i] = new Entidade_Exercicios(nome, preco);
        }
        
        double soma = 0.0;
        
        for (int i = 0; i < vetor.length; i++) {
            //para mostrar o valor da soma
            soma += vetor[i].getPreco();
        }
        
        double avg = soma / vetor.length;
        
        System.out.printf("Preço = %.2f\n", avg);
        
        sc.close();
    }
}

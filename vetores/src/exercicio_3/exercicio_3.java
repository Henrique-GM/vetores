/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_3;

import entidade_Exercicio_3.Entidade_Exercicio_3;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class exercicio_3 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas vagas deseja alugar? ");
        int quartos = sc.nextInt();
        
        Entidade_Exercicio_3[] vetor = new Entidade_Exercicio_3[quartos];
        
        for (int i = 0; i < vetor.length; i++) {            
            System.out.print("vaga #" + (i + 1));
            System.out.println();
            
            sc.nextLine();
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Digite seu e-mail: ");
            String email = sc.nextLine();
            
            System.out.print("Qual quaro gostaria? ");
            int numeroQuarto = sc.nextInt();
            
            System.out.println();
            
            vetor[i] = new Entidade_Exercicio_3(nome, email, numeroQuarto);         
        }
            
        for (int i = 0; i < vetor.length; i++) {         
            if (vetor[i] != null) {
                System.out.println("dados obtidos: " + vetor[i].toString());
            }
        }
        
        sc.close();
    }
}

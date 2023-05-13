/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCTE2;

import java.util.Scanner;

/**
 *
 * @author 296775
 */
public class Dono {
private String nome;
private int idade;

public void entraDados(){
    Scanner sc = new Scanner (System.in);
    System.out.println("Digite seu nome: ");
    nome=sc.nextLine();
    System.out.println("Digite Sua idade :");
    idade=sc.nextInt();
    
    
}
public void mostraDados(){
    System.out.println("Nome do Dono: "+nome);
    System.out.println("Idade do Dono: "+idade);
}

    public String getNome() {
        return nome;
    }

       public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getIdade() {
        return idade;
    }

    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}

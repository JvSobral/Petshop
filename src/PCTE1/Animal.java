/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCTE1;

import PCTE2.Dono;
import java.text.DecimalFormat;
import java.util.Scanner;



/**
 *
 * @author 296775
 */
public class Animal {
Scanner sc = new Scanner (System.in);
private String nome;
private double peso;
private double preco;
protected String especie;
public Dono dono = new Dono() ;

public void entraDados(){
    System.out.println("Digite nome do animal : ");
    nome=sc.nextLine();
    System.out.println("Digite o peso do animal: ");
    peso=sc.nextDouble();
    System.out.println("Digite a especie do animal"
            + "\n[1]Cachorro \n[2]Peixe \n[3]outros");
    int nEspecie = sc.nextInt();
    calculaPreco (nEspecie);
}

public double calculaPreco(int nEspecie){
    
    switch (nEspecie){
        case 1: 
            preco = 2000;
            especie = "cachorro";
            break;
        case 2:
            preco = 1000;
            especie = "Peixe";
            break;
        case 3:
            preco = 500;
            especie = "Outros";
            break;
        default:
    }
    
    return 0;
   
    
}
public void mostraDados (){
   DecimalFormat df = new DecimalFormat("R$ #,##0.00");
   DecimalFormat df2 = new DecimalFormat (",##00.00 KG");
     System.out.println("Nome do Animal: "+nome);
    System.out.println("Peso do animal: "+ df2.format(peso));
    System.out.println("Especie do Animal: "+especie);
    System.out.println("Preço do atendimento do Animal: "+df.format(preco));
}
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public double getPeso() {
        return peso;
    }

    
    public void setPeso(double peso) {
        this.peso = peso;
    }

   
    public double getPreco() {
        return preco;
    }

   
    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    public String getEspecie() {
        return especie;
    }

    
    public void setEspecie(String especie) {
        this.especie = especie;
    }



    
}
   


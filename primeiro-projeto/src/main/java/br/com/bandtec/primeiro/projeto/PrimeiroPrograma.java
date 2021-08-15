/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.primeiro.projeto;

import java.util.Scanner;

/**
 *
 * @author franciscone
 */
public class PrimeiroPrograma {
    
    
// Ponto de entrada
    // Permite que a classe se torne executável
    public static void main(String[] args) {
        
        // O tipo STRING sempre será utilizado para alfanuméricos
        String nome = "Matheus";
        
        // O comando "println" permite impirmir informações no console
        System.out.println("Hello World!");
        System.out.println(nome);
        
        String sobrenome = "Franciscone";   
        
        System.out.println(sobrenome);
        
        // No Java também é possível concatenar textos
        System.out.println(nome +" "+ sobrenome);
        
        // int = tipo primitivo
        // Integer = classe wrapper
        
        // Para números inteiros, iremos usar o integer
        Integer numeroInteiro = 42;
        
        System.out.println("Número: " + numeroInteiro);
        System.out.println(numeroInteiro);
        
        Integer soma = numeroInteiro + 20;
        
        System.out.println(soma);
        
        // Para números com ponto flutuante, utilizaremos o Double
        Double salario = 20000.0;
        System.out.println("Salário: R$ " + salario);
        
        Boolean mundial = true;
        
        System.out.println("Palmeiras tem mundial?");
        
        if (mundial == true) {
            System.out.println("R.: SIM!");
        } else {
            System.out.println("R.: NÃO!");
        }
        
        Scanner leitorIdade = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        Integer idade = leitorIdade.nextInt();
        System.out.println("Idade é: " + idade);
        
        Scanner leitorCor = new Scanner(System.in);
        System.out.println("Escreva uma cor: ");
        String cor = leitorCor.nextLine();
        System.out.println("Cor: " + cor);
        
//        System.out.println("Digite seu salário: ");
//        Double seuSalario = leitor.nextDouble();
//        System.out.println("Salário: " + seuSalario);
    }

}

package br.com.bandtec.exercicios.lista2;

public class NumerosPares {
    public static void main(String[] args) {
        
        Integer numero = 0;
        while (numero <= 40) {            
            
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}

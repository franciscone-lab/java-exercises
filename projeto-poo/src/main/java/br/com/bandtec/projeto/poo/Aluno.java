package br.com.bandtec.projeto.poo;

public class Aluno {

    String ra = "0000000";
    String nome = "";
    Double nota1 = 0.0;
    Double nota2 = 0.0;
    Double media = 0.0;
    Boolean aprovado = false;

    void calcularMedia() {
        media = (nota1 + nota2) / 2;

//        if (media >= 6) {
//            aprovado = true;
//        } else {
//            aprovado = false;
//        }
        
        aprovado = media >= 6;

    }
}

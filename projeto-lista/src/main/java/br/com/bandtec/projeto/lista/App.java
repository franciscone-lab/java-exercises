package br.com.bandtec.projeto.lista;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        //Tipo Object
//        List listaLoca = new ArrayList();
//        
//        listaLoca.add(12);
//        listaLoca.add("Matheus");
//        listaLoca.add(true);
        List<Integer> inteiros = new ArrayList();

        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(4);

        inteiros.remove(1);
        inteiros.set(0, 2);
        inteiros.add(3, 10);
        System.out.println(inteiros);

        //For clássico
        for (int i = 0; i < inteiros.size(); i++) {
            System.out.println(inteiros.get(i));
            Integer x = inteiros.get(i);
            System.out.println(x);
        }

        // For aprimorado
        for (Integer x : inteiros) {
            System.out.println(x);
        }
        
        //
        
        List<Musica> musicas = new ArrayList();
        
        musicas.forEach(musica -> {
            System.out.println(musica.getNome());
            System.out.println(musica.getGenero());
        });
        
        musicas.stream().forEach(System.out::print);
    }
}

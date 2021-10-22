package br.com.bandtec.projeto.lista;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String nome;
    private List<Musica> musicas;

    public Album(String nome, List<Musica> musicas) {
        this.nome = nome;
        this.musicas = new ArrayList();
    }

    public void cadastrarMusica(Musica musica) {
        this.musicas.add(musica);
    }
    
    public void atualizarNomeMusica(String nomeAntigo, String novoNome){
        for (Musica musica : musicas) {
            if (musica.getNome().equalsIgnoreCase(nomeAntigo)){
                musica.setNome(novoNome);
            }
        }
    }
}

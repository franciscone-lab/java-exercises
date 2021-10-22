package com.bandtec.projeto.lista.desafio;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        this.inteiros = new ArrayList<>();
    }

    public Integer count() {
        return inteiros.size();
    }

    public void add(Integer inteiro) {
        if (Objects.nonNull(inteiro)) {
            inteiros.add(inteiro);
        }
    }

    public void remove(Integer inteiro) {
        if (Objects.nonNull(inteiro)) {
            inteiros.remove(inteiro);
        }
    }

    public Integer countPares() {
        if (inteiros.size() == 0) {
            int qtdPares = 0;
            for (int i = 0; i < inteiros.size(); i++) {
                if (inteiros.indexOf(i) % 2 == 0) {
                    qtdPares++;
                }
            }
            return qtdPares;
        } else {
            return 0;
        }
    }

    public Integer countImpares() {
        if (inteiros.size() == 0) {
            int qtdPares = 0;
            for (int i = 0; i < inteiros.size(); i++) {
                if (inteiros.indexOf(i) % 2 == 1) {
                    qtdPares++;
                }
            }
            return qtdPares;
        } else {
            return 0;
        }
    }

    public Integer somar() {
//        return null;
        if (inteiros.size() == 0) {
          
        } else {
            return 0;
        }
    }

    public Integer getMaior() {
        return null;
    }

    public Integer getMenor() {
        return null;
    }

    public Boolean hasDuplicidade() {
        return null;
    }
}

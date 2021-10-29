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
        if (inteiros.isEmpty()) {
            return 0;
        } else {
            int qtdPares = 0;
            for (int i = 0; i < inteiros.size(); i++) {
                if (inteiros.get(i) % 2 == 0) {
                    qtdPares++;
                }
            }
            return qtdPares;
        }
    }

    public Integer countImpares() {
        if (inteiros.isEmpty()) {
            return 0;
        } else {
            int qtdPares = 0;
            for (int i = 0; i < inteiros.size(); i++) {
                if (inteiros.get(i) % 2 != 0) {
                    qtdPares++;
                }
            }
            return qtdPares;
        }
    }

    public Integer somar() {
//        return null;
        if (inteiros.isEmpty()) {
            return 0;
        } else {
            int totalValores = 0;
            for (int i = 0; i < inteiros.size(); i++) {
                totalValores += inteiros.get(i);
            }
            return totalValores;
        }
    }

    public Integer getMaior() {
        if (inteiros.isEmpty()) {
            return 0;
        } else {
            int maiorValor = 0;
            for (int i = 0; i < inteiros.size(); i++) {
                if (inteiros.get(i) > maiorValor) {
                    maiorValor = inteiros.get(i);
                }
            }
            return maiorValor;
        }
    }

    public Integer getMenor() {
        if (inteiros.isEmpty()) {
            return 0;
        } else {
            int menorValor = 10000;
            for (int i = 0; i < inteiros.size(); i++) {
                if (inteiros.get(i) < menorValor) {
                    menorValor = inteiros.get(i);
                }
            }
            return menorValor;
        }
    }

    public Boolean hasDuplicidade() {
        boolean temDuplicidade = false;
        for (int i = 0; i < inteiros.size(); i++) {
            for (int j = 0; j < inteiros.size(); j++) {
                if (i != j) {
                    if (inteiros.get(i).equals(inteiros.get(j))) {
                        temDuplicidade = true;
                    }
                }
            }
        }
        return temDuplicidade;
    }
}

package br.com.bandtec.projeto.enums;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        String localidade = "SUL";
        dizerLocalidade(LocalizacaoEnum.CENTRO);
        System.out.println(LocalizacaoEnum.valueOf(localidade));
        System.out.println(Arrays.toString(LocalizacaoEnum.values()));
    }

    public static void dizerLocalidade(LocalizacaoEnum localizacao) {
        if (null == localizacao) {
            System.out.println("Você não está em nenhum lugar!");
        } else switch (localizacao) {
            case CENTRO:
                System.out.println("Você está no Centro!");
                break;
            case NORDESTE:
                System.out.println("Você está no Nordeste!");
                break;
            case NORTE:
                System.out.println("Você está no Norte!");
                break;
            case SUDESTE:
                System.out.println("Você está no Sudeste!");
                break;
            case SUL:
                System.out.println("Você está no Sul!");
                break;
            default:
                System.out.println("Você não está em nenhum lugar!");
                break;
        }
    }
}

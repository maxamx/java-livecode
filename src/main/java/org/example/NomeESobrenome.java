package org.example;

import org.example.dto.NomeESobrenomeDTO;

import java.util.ArrayList;
import java.util.List;

public class NomeESobrenome {
    public static List<String> separaPorVirgula(List<String> listNomeESobreNome) {
        List<String> resultado = new ArrayList<>();
        for (String nomeESobrenome:listNomeESobreNome) {
            String sobrenome="";
            int inicioDaPalavra =0,fimDaPalavra=0;
            Character letra=' ';
            while (letra != ' '){
                letra = nomeESobrenome.charAt(fimDaPalavra++);
            }
            String nome = nomeESobrenome.substring(inicioDaPalavra,fimDaPalavra);
            /*
            TODO metodo para separar palavra
            sobrenome
             */
            letra=' ';
            inicioDaPalavra = fimDaPalavra+1;
            fimDaPalavra=inicioDaPalavra;
            try {
                while (letra != ',') {
                    letra = nomeESobrenome.charAt(fimDaPalavra++);
                }
                sobrenome = nomeESobrenome.substring(inicioDaPalavra, fimDaPalavra);
            }catch (IndexOutOfBoundsException e){

            }
            resultado.add(sobrenome+", "+nome);
        }
        return resultado;
    }
}

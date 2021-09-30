package org.example;

import org.example.dto.NomeESobrenomeDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestLiveCode {

    List<String> nomeESobreNome = List.of( "Aline zenon", "walter Azevedo", "lucas suzuki", "tatiana" );

    @Test
    public void retorneNomeESobrenomeSeparadosPorVirgula(){
        List<String> saida = List.of( "zenon, Aline", "Azevedo, walter", "suzuki, lucas", "tatiana" );
       List<String> resultado = NomeESobrenome.separaPorVirgula(nomeESobreNome);
        Assertions.assertLinesMatch(saida,resultado);



    }
}

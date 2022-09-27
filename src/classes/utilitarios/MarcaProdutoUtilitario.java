package classes.utilitarios;

import classes.MarcaProduto;
import classes.nivelQualidade;

import java.util.List;

public class MarcaProdutoUtilitario {
    public void agrupaMarcaNivelQualidade(List<MarcaProduto> lista){
        for (int i = 0; i< 5; i ++){
            System.out.println("Nivel de qualidade " + nivelQualidade.values()[i].toString());
            int finalI = i;
            lista.forEach(marca -> {
                if (marca.getNivelQualidade().ordinal() == finalI){
                    System.out.println(marca.getNome()  + "\n");
                }
            });
        }
    }
    public void listaMarcas(List<MarcaProduto> lista){
        lista.forEach(marca ->{
            System.out.println("Marca: " + marca.getNome());
        });
    }
}

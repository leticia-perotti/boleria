import classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MarcaProduto[] marcas = new MarcaProduto[8];

        marcas[0] = new MarcaProduto("Tirol", nivelQualidade.alto);
        marcas[1] = new MarcaProduto("Nestle", nivelQualidade.altissimo);
        marcas[2] = new MarcaProduto("Norcau", nivelQualidade.altissimo);
        marcas[3] = new MarcaProduto("Garoto", nivelQualidade.alto);
        marcas[4] = new MarcaProduto("TiaMinas", nivelQualidade.baixo);
        marcas[5] = new MarcaProduto("Mumu", nivelQualidade.baixissimo);
        marcas[6] = new MarcaProduto("Naranja", nivelQualidade.medio);
        marcas[7] = new MarcaProduto("AmoraCampo", nivelQualidade.medio);

        marcas[0].setNivelQualidade(nivelQualidade.altissimo);
        System.out.println(marcas[0].getNivelQualidade());

        MarcaProdutoUtilitario marcaUtilitario = new MarcaProdutoUtilitario();

        marcaUtilitario.listaMarcas(List.of(marcas));
        marcaUtilitario.agrupaMarcaNivelQualidade(List.of(marcas));

        Ingrediente[] ingredientes = new Ingrediente[6];

        ingredientes[0] = new Ingrediente("Leite condensado", marcas[0]);
        ingredientes[1] = new Ingrediente("Chocolate ao leite",marcas[3]);
        ingredientes[2] = new Ingrediente("Chantilly", marcas[2]);
        ingredientes[3] = new Ingrediente("Ovo", marcas[6]);
        ingredientes[4] = new Ingrediente("Frutas vermelhas", marcas[7]);
        ingredientes[5] = new Ingrediente("Doce de leite", marcas[5]);

        ingredientes[0].retornaMarcaNivelQualidade();

        Sabor[] sabores = new Sabor[3];

        sabores[0] = new Sabor("Frutas vermelhas");
        sabores[1] = new Sabor("Chocolate");
        sabores[2] = new Sabor("Limão");

        Textura[] texturas = new Textura[3];

        texturas[0] = new Textura("Crocante");
        texturas[1] = new Textura("Aveludado");
        texturas[2] = new Textura("Cremoso");

        Cobertura[] coberturas = new Cobertura[2];

        List<Ingrediente>  ingredienteCobertuta = new ArrayList<Ingrediente>(1);
        ingredienteCobertuta.add(ingredientes[2]);
        List<Ingrediente>  ingredienteCobertuta2 = new ArrayList<Ingrediente>(2);
        ingredienteCobertuta2.add(ingredientes[1]);
        ingredienteCobertuta2.add(ingredientes[2]);

        coberturas[0] = new Cobertura("Chantilly", sabores[2], texturas[1], "Decoração", ingredienteCobertuta);
        coberturas[1] = new Cobertura("Ganache de chocolate", sabores[1], texturas[2], "Espelhado", ingredienteCobertuta2);

        coberturas[0].listaIngredintes();
        coberturas[0].listaIngredintes();
        coberturas[0].adicionaIngrediente(ingredientes[1]);
        coberturas[0].listaIngredintes();
        coberturas[0].removeIngrediente(ingredientes[1]);
        coberturas[0].retornaCobertura();

        



    }
}
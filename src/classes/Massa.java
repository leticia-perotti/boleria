package classes;

import java.util.ArrayList;
import java.util.List;

public class Massa extends Abstract{
    public Massa(String nome, Sabor sabor, Textura textura, String tipo, List<Ingrediente> ingredientes) {
        super(nome, sabor, textura, tipo, ingredientes);
    }

    public void retornaMassa(){
        System.out.println("Massa: \n");
        System.out.println("Sabor: " + this.getSabor().getDescricao() + "\n");
        System.out.println("Textura: " + this.getTextura().getDescricao() + "\n");
        System.out.println("Tipo: " + this.getTipo() + "\n");
        this.listaIngredintes();
    }
}

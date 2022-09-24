package classes;

import java.util.List;

abstract class Abstract {
    private String nome;
    private Sabor sabor;
    private Textura textura;
    private String tipo;
    private List<Ingrediente> ingredientes;

    public void adicionaIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

    public void removeIngrediente(Ingrediente ingrediente){
        ingredientes.remove(ingrediente);
    }

    public void listaIngredintes(){
        System.out.println("Nome: " + this.nome + " - ingredientes");
        this.ingredientes.forEach( ingrediente -> {
            System.out.println("* " + ingrediente.getNome() + "\n");
        });
    }
    
}

package classes;

import java.util.ArrayList;
import java.util.List;

abstract class Abstract {
    private String nome;
    private Sabor sabor;
    private Textura textura;
    private String tipo;
    private List<Ingrediente> ingredientes;

    public void adicionaIngrediente(Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
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

    public void listaIngredintesMarca(){
        System.out.println("Nome: " + this.nome + " - ingredientes");
        this.ingredientes.forEach( ingrediente -> {
            System.out.println("* " + ingrediente.getNome() + "-" + ingrediente.getMarca().getNome() + "\n");
        });
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public Textura getTextura() {
        return textura;
    }

    public void setTextura(Textura textura) {
        this.textura = textura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Abstract(String nome, Sabor sabor, Textura textura, String tipo, List<Ingrediente> ingredientes) {
        this.nome = nome;
        this.sabor = sabor;
        this.textura = textura;
        this.tipo = tipo;
        this.ingredientes = ingredientes;
    }
}

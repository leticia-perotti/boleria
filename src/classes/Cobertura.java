package classes;

import java.util.List;

public class Cobertura {
    private String nome;
    private Sabor sabor;
    private Textura textura;
    private String tipo;
    private List<Ingrediente> ingredientes;


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

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Cobertura(String nome, Sabor sabor, Textura textura, String tipo, List<Ingrediente> ingredientes) {
        this.nome = nome;
        this.sabor = sabor;
        this.textura = textura;
        this.tipo = tipo;
        this.ingredientes = ingredientes;
    }

    public void listaIngredientes(){

    }

    public void listaIngredientesMarca(){

    }

    public void agrupaPorTextura(){

    }

    public void agrupaPorSabor(){

    }

    public void retornaCobertura(){

    }

    public void adicionarIngrediente(Ingrediente ingrediente){

    }

    public void removeIngrediente(Ingrediente ingrediente){

    }
}

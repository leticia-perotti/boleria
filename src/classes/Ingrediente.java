package classes;

public class Ingrediente {
    private String nome;
    private MarcaProduto marca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public MarcaProduto getMarca() {
        return marca;
    }

    public void setMarca(MarcaProduto marca) {
        this.marca = marca;
    }

    public Ingrediente(String nome, MarcaProduto marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public void retornaMarca(){
        System.out.println(this.marca.getNome());
    }

    public void retornaMarcaNivelQualidade(){
        System.out.println("Marca: " + this.marca.getNome() + " - nivel qualidade: " + this.marca.getNivelQualidade());
    }

}

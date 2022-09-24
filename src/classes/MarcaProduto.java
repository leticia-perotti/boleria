package classes;

import java.util.List;

public class MarcaProduto {
    private String nome;
    private nivelQualidade nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public nivelQualidade getNivelQualidade() {
        return this.nivel;
    }

    public MarcaProduto(String nome, nivelQualidade nivelQualidade) {
        this.nome = nome;
        this.nivel = nivelQualidade;
    }

    public void setNivelQualidade(nivelQualidade nivel) {
        this.nivel = nivel;
    }


}

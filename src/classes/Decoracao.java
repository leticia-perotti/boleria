package classes;

public class Decoracao {
    private String cor;
    private String tema;
    private boolean brilho;
    private boolean velas;
    private boolean lacoDecorativo;
    private boolean placaParabens;
    private boolean balaoDecorativo;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public boolean isBrilho() {
        return brilho;
    }

    public void setBrilho(boolean brilho) {
        this.brilho = brilho;
    }

    public boolean isVelas() {
        return velas;
    }

    public void setVelas(boolean velas) {
        this.velas = velas;
    }

    public boolean isLacoDecorativo() {
        return lacoDecorativo;
    }

    public void setLacoDecorativo(boolean lacoDecorativo) {
        this.lacoDecorativo = lacoDecorativo;
    }

    public boolean isPlacaParabens() {
        return placaParabens;
    }

    public void setPlacaParabens(boolean placaParabens) {
        this.placaParabens = placaParabens;
    }

    public boolean isBalaoDecorativo() {
        return balaoDecorativo;
    }

    public void setBalaoDecorativo(boolean balaoDecorativo) {
        this.balaoDecorativo = balaoDecorativo;
    }

    public Decoracao(String cor, String tema) {
        this.cor = cor;
        this.tema = tema;
    }

    public void retornaDecoracao(){
        System.out.println("Decoração \n");
        System.out.println("Cor:" + this.cor + "\n");
        System.out.println("Tema:" + this.tema + "\n");
        if (brilho) { System.out.println("Com brilho"); };
        if (velas) { System.out.println("Com velas"); };
        if (lacoDecorativo) { System.out.println("Com laço decorativo"); };
        if (placaParabens) { System.out.println("Com placa de parabéns"); };
        if (balaoDecorativo) { System.out.println("Com balão decorativo"); };
    }
}

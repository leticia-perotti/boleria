package classes;

import java.util.List;

public class Bolo {
    private String nome;
    private List<Cobertura> coberturas;
    private List<Recheio> recheios;
    private List<Massa> massas;

    public Bolo(List<Cobertura> coberturas, List<Recheio> recheios, List<Massa> massas, String nome) {
        this.coberturas = coberturas;
        this.recheios = recheios;
        this.massas = massas;
        this.nome = nome;
    }

    public List<Cobertura> getCoberturas() {
        return coberturas;
    }

    public void setCoberturas(List<Cobertura> coberturas) {
        this.coberturas = coberturas;
    }

    public List<Recheio> getRecheios() {
        return recheios;
    }

    public void setRecheios(List<Recheio> recheios) {
        this.recheios = recheios;
    }

    public List<Massa> getMassas() {
        return massas;
    }

    public void setMassas(List<Massa> massas) {
        this.massas = massas;
    }

    public void calculaValorMedio(){
        double valor = this.recheios.size() * 15;
        valor = valor + this.massas.size() * 7;
        valor = valor + this.coberturas.size()  *18;
        System.out.println("O valor do bolo é de " + valor);
    }

    public void adicionaRecheio(Recheio recheio){
        this.recheios.add(recheio);
    }

    public void removeRecheio(Recheio recheio){
        this.recheios.remove(recheio);
    }

    public void adicionaMassa(Massa massa){
        this.massas.add(massa);
    }

    public void removeMassa(Massa massa){
        this.massas.remove(massa);
    }

    public void adicionaCobertura(Cobertura cobertura){
        this.coberturas.add(cobertura);
    }

    public void removeCobertura(Cobertura cobertura){
        this.coberturas.remove(cobertura);
    }

    public void retornaBolo(){
        System.out.println("Bolo; \n");
        System.out.println("Recheios \n");
        this.recheios.forEach(recheio ->{
            System.out.println("* " + recheio.getNome() + "\n");
        });
        System.out.println("Massas \n");
        this.massas.forEach(massa ->{
            System.out.println("*" + massa.getNome() + "\n");
        });
        System.out.println("Coberturas \n");
        this.coberturas.forEach(cobertura -> {
            System.out.println("*" + cobertura.getNome() + "\n");
        });
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

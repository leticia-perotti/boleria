package classes;

import java.util.List;

public class Bolo {
    private List<Cobertura> coberturas;
    private List<Recheio> recheios;
    private List<Massa> massas;

    public Bolo(List<Cobertura> coberturas, List<Recheio> recheios, List<Massa> massas) {
        this.coberturas = coberturas;
        this.recheios = recheios;
        this.massas = massas;
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

    }

    public void adicionaRecheio(Recheio recheio){

    }

    public void removeRecheio(Recheio recheio){

    }

    public void adicionaMassa(Massa massa){

    }

    public void removeMassa(Massa massa){

    }

    public void adicionaCobertura(Cobertura cobertura){

    }

    public void removeCobertura(Cobertura cobertura){

    }

    public void listaBolos(){

    }

    public void retornaBolo(){

    }

    public void listaBolosPorRecheio(){

    }

    public void listaBolosPorMassa(){

    }
    public void listaBolosPorCobertura(){

    }
}

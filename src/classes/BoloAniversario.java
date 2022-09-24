package classes;

import java.util.List;

public class BoloAniversario extends Bolo{
    private Decoracao decoracao;

    public Decoracao getDecoracao() {
        return decoracao;
    }

    public void setDecoracao(Decoracao decoracao) {
        this.decoracao = decoracao;
    }

    public BoloAniversario(List<Cobertura> coberturas, List<Recheio> recheios, List<Massa> massas, Decoracao decoracao) {
        super(coberturas, recheios, massas);
        this.decoracao = decoracao;
    }

    @Override
    public void calculaValorMedio(){

    }

    @Override
    public void retornaBolo(){

    }
}

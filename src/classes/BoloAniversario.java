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
        double valor = 30;
        valor = this.getCoberturas().size() * 30;
        valor = this.getMassas().size() * 11;
        valor = this.getRecheios().size() * 17;
        System.out.println("O valor do bolo de aniversário é " + valor);
    }

    @Override
    public void retornaBolo(){
        System.out.println("Bolo; \n");
        System.out.println("Recheios \n");
        this.getRecheios().forEach(recheio ->{
            System.out.println("* " + recheio.getNome() + "\n");
        });
        System.out.println("Massas \n");
        this.getMassas().forEach(massa ->{
            System.out.println("*" + massa.getNome() + "\n");
        });
        System.out.println("Coberturas \n");
        this.getCoberturas().forEach(cobertura -> {
            System.out.println("*" + cobertura.getNome() + "\n");
        });
        System.out.println("Decoração");
        this.decoracao.retornaDecoracao();
    }
}

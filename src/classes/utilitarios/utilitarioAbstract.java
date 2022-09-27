package classes.utilitarios;

import classes.Cobertura;
import classes.Massa;
import classes.Recheio;

import java.util.List;

public class utilitarioAbstract {

    public void retornaOpcoesMontagemBolo(List<Massa> massas, List<Recheio> recheios, List<Cobertura> coberturas){
        System.out.println("Massas: \n");
        massas.forEach(massa -> {
            System.out.println("*" + massa.getNome() + "\n");
        });
        recheios.forEach(recheio ->{
            System.out.println("*" + recheio.getNome() + "\n");
        });
        coberturas.forEach(cobertura -> {
            System.out.println("*" + cobertura.getNome() + "\n");
        });
    }
}

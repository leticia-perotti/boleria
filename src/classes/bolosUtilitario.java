package classes;

import java.util.List;

public class bolosUtilitario {

    public void listaBolos(List<Bolo> bolos){
        System.out.println("Bolos disponiveis\n");
        bolos.forEach(bolo -> {
            bolo.retornaBolo();
        });
    }
}

package classes;

import java.util.ArrayList;
import java.util.List;

public class BolosUtilitario {

    public void listaBolos(List<Bolo> bolos){
        System.out.println("Bolos disponiveis\n");
        bolos.forEach(bolo -> {
            bolo.retornaBolo();
        });
    }

    public void listaBolosPorRecheio(List<Bolo> bolos){
        List<Recheio> recheios = new ArrayList<Recheio>(1);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Lista bolo por recheio  \n");
        bolos.forEach(bolo -> {
            bolo.getRecheios().forEach(bolo1 -> {
                if (!recheios.contains(bolo1)){
                    recheios.add(bolo1);
                }
            });
        });

        for (int i = 0; i< recheios.size(); i ++){
            System.out.println("\nRecheio " + recheios.get(i).getNome());
            int finalI = i;
            bolos.forEach(recheio -> {
                recheio.getRecheios().forEach(recheioBolo ->{
                    if (recheioBolo == recheios.get(finalI)){
                        System.out.println(recheio.getNome());
                    }
                });
            });
        }

    }

    public void listaBolosPorMassa(List<Bolo> bolos){
        List<Massa> massas = new ArrayList<Massa>(1);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Lista bolo por massa  \n");
        bolos.forEach(bolo -> {
            bolo.getMassas().forEach(bolo1 -> {
                if (!massas.contains(bolo1)){
                    massas.add(bolo1);
                }
            });
        });

        for (int i = 0; i< massas.size(); i ++){
            System.out.println("\nMassa " + massas.get(i).getNome());
            int finalI = i;
            bolos.forEach(massa -> {
                massa.getMassas().forEach(massaBolo ->{
                    if (massaBolo == massas.get(finalI)){
                        System.out.println(massa.getNome());
                    }
                });
            });
        }
    }

    public void listaBolosPorCobertura(List<Bolo> bolos){
        List<Cobertura> coberturas = new ArrayList<Cobertura>(1);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Lista bolo por cobertura  \n");
        bolos.forEach(bolo -> {
            bolo.getCoberturas().forEach(bolo1 -> {
                if (!coberturas.contains(bolo1)){
                    coberturas.add(bolo1);
                }
            });
        });

        for (int i = 0; i< coberturas.size(); i ++){
            System.out.println("\nCoberturas " + coberturas.get(i).getNome());
            int finalI = i;
            bolos.forEach(cobertura -> {
                cobertura.getCoberturas().forEach(coberturaBolo ->{
                    if (coberturaBolo == coberturas.get(finalI)){
                        System.out.println(cobertura.getNome());
                    }
                });
            });
        }
    }
}

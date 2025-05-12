package ejercicioCoches;

import java.util.*;

public class GestorCoches {
    private Set<Coche> coches;
    
    public void setCoches(Set<Coche> coches) {
        this.coches = coches;
    }

    public boolean addCoche(Coche coche) {
        return coches.add(coche);
    }

    public Set<Coche> getCoches() {
        return coches;
    }

    public List<Coche> getCochesOrdenadosPorMarca() {
        List<Coche> lista = new ArrayList<>(coches);
        lista.sort(new ComparadorPorMarca());
        return lista;
    }
}

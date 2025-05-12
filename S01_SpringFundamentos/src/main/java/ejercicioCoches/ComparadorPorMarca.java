package ejercicioCoches;

import java.util.Comparator;

public class ComparadorPorMarca implements Comparator<Coche> {
    @Override
    public int compare(Coche c1, Coche c2) {
        return c1.getMarca().compareToIgnoreCase(c2.getMarca());
    }
}

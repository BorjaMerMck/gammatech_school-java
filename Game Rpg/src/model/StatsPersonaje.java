package model;
import enums.Arma;
import enums.Raza;
import model.Personaje;
public class StatsPersonaje {

    public static Personaje crearPersonajePorRaza(Raza raza) {
        switch (raza) {
            case humanos:
                return new Personaje(0, 100, Arma.Espada, raza, 50, false);
            case orcos:
                return new Personaje(0, 120, Arma.Hacha, raza, 30, false);
            case elfos:
                return new Personaje(0, 90, Arma.Arco, raza, 60, false);
            case muertosVivientes:
                return new Personaje(0, 110, Arma.Daga, raza, 20, true);
            default:
                throw new IllegalArgumentException("Raza no reconocida: " + raza);
        }
    }

}

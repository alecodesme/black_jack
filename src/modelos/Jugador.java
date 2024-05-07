package modelos;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

    private int puntaje;

    private String nombreJugador;

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    List<Carta> cartasAsignadas = new ArrayList<>();

    public void recibirCartas(List<Carta> cartas) {
        cartasAsignadas.addAll(cartas);
    }

    public List<Carta> cartas() {
        return cartasAsignadas;
    }

    public void mostrarCartas() {
        for (int i = 0; i < this.cartas().toArray().length; i++) {
            Carta carta = this.cartas().get(i);
            System.out.println("Jugador: "+ this.getNombreJugador()+" tiene: "+carta.mostrarCarta());
        }
    }
}

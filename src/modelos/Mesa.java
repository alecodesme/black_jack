package modelos;

import java.util.ArrayList;
import java.util.List;

public class Mesa {

    private static final int NUM_CARTAS_MANO = 2;
    private static final int LIMITE_PUNTAJE_DEALER = 17;
    private static final int LIMITE_PUNTAJE_JUGADORES = 21;

    final private Baraja baraja;
    final private List<Carta> cartasEnMano = new ArrayList<>();

    public Mesa(){
        baraja = new Baraja();
    }

    public void barajear(){
        this.baraja.cambiarOrden();
    }

    public List<Carta> repartirCartas() {
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < NUM_CARTAS_MANO; i++) {
            mano.add(this.baraja.cartas().remove(0)); // Remueve la carta del principio de la lista (baraja)
        }
        return mano;
    }

    public void tomarCartas(List<Carta> cartas) {
        cartasEnMano.addAll(cartas);
    }

    public void mostrarCartasDeLaCasa(){
        for (int i = 0; i < this.cartasEnMano.toArray().length; i++) {
            Carta carta = this.cartasEnMano.get(i);
            System.out.println("Dealer tiene: "+carta.mostrarCarta());
        }
    }
}


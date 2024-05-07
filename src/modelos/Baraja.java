package modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private List<Carta> cartas = new ArrayList<>();

    public Baraja() {
        rellenarBaraja();
    }

    public List<Carta> cartas(){
        return cartas;
    }

    public void cambiarOrden() {
        Collections.shuffle(cartas);
    }

    private void rellenarBaraja(){
         cartas.add(new Carta(0, "A", TipoCarta.AsCorazon));
         cartas.add(new Carta(0, "A", TipoCarta.AsRombo));
         cartas.add(new Carta(0, "A", TipoCarta.AsTrebol));
         cartas.add(new Carta(0, "A", TipoCarta.AsPica));

         cartas.add(new Carta(10, "K", TipoCarta.K));
         cartas.add(new Carta(10, "J", TipoCarta.J));
         cartas.add(new Carta(10, "Q", TipoCarta.Q));
         cartas.add(new Carta(10, "Rombo", TipoCarta.Rombo));
         cartas.add(new Carta(10, "Trebol", TipoCarta.Trebol));
         cartas.add(new Carta(10, "Corazon", TipoCarta.Corazon));
         cartas.add(new Carta(10, "Picas", TipoCarta.Picas));

         cartas.add(new Carta(2, "Rombo", TipoCarta.Rombo));
         cartas.add(new Carta(2, "Trebol", TipoCarta.Trebol));
         cartas.add(new Carta(2, "Corazon", TipoCarta.Corazon));
         cartas.add(new Carta(2, "Picas", TipoCarta.Picas));

         cartas.add(new Carta(3, "Rombo", TipoCarta.Rombo));
         cartas.add(new Carta(3, "Trebol", TipoCarta.Trebol));
         cartas.add(new Carta(3, "Corazon", TipoCarta.Corazon));
         cartas.add(new Carta(3, "Picas", TipoCarta.Picas));

         cartas.add(new Carta(4, "Rombo", TipoCarta.Rombo));
         cartas.add(new Carta(4, "Trebol", TipoCarta.Trebol));
         cartas.add(new Carta(4, "Corazon", TipoCarta.Corazon));
         cartas.add(new Carta(4, "Picas", TipoCarta.Picas));

         cartas.add(new Carta(5, "Rombo", TipoCarta.Rombo));
         cartas.add(new Carta(5, "Trebol", TipoCarta.Trebol));
         cartas.add(new Carta(5, "Corazon", TipoCarta.Corazon));
         cartas.add(new Carta(5, "Picas", TipoCarta.Picas));

        cartas.add(new Carta(6, "Rombo", TipoCarta.Rombo));
        cartas.add(new Carta(6, "Trebol", TipoCarta.Trebol));
        cartas.add(new Carta(6, "Corazon", TipoCarta.Corazon));
        cartas.add(new Carta(6, "Picas", TipoCarta.Picas));

        cartas.add(new Carta(7, "Rombo", TipoCarta.Rombo));
        cartas.add(new Carta(7, "Trebol", TipoCarta.Trebol));
        cartas.add(new Carta(7, "Corazon", TipoCarta.Corazon));
        cartas.add(new Carta(7, "Picas", TipoCarta.Picas));

        cartas.add(new Carta(8, "Rombo", TipoCarta.Rombo));
        cartas.add(new Carta(8, "Trebol", TipoCarta.Trebol));
        cartas.add(new Carta(8, "Corazon", TipoCarta.Corazon));
        cartas.add(new Carta(8, "Picas", TipoCarta.Picas));

        cartas.add(new Carta(9, "Rombo", TipoCarta.Rombo));
        cartas.add(new Carta(9, "Trebol", TipoCarta.Trebol));
        cartas.add(new Carta(9, "Corazon", TipoCarta.Corazon));
        cartas.add(new Carta(9, "Picas", TipoCarta.Picas));
    }
}

import modelos.Baraja;
import modelos.Carta;
import modelos.Jugador;
import modelos.Mesa;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jugador jugador1 = new Jugador();
        System.out.print("Ingrese el nombre del primer jugador: ");

        jugador1.setNombreJugador(scanner.nextLine());

        Jugador jugador2 = new Jugador();
        System.out.print("Ingrese el nombre del segundo jugador: ");
        jugador2.setNombreJugador(scanner.nextLine());


        Mesa mesaDeJuego = new Mesa();
        mesaDeJuego.barajear();

        mesaDeJuego.tomarCartas( mesaDeJuego.repartirCartas() );
        jugador1.recibirCartas( mesaDeJuego.repartirCartas() );
        jugador2.recibirCartas( mesaDeJuego.repartirCartas() );

        jugador1.mostrarCartas();
        jugador2.mostrarCartas();
        mesaDeJuego.mostrarCartasDeLaCasa();

        while (  )


    }
}
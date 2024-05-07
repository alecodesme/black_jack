package modelos;

import java.util.Random;

enum TipoCarta { AsCorazon, AsRombo, AsTrebol, AsPica, Rombo, Trebol, Picas, Corazon, Q, J, K }
public class Carta {

    int valor;
    String titulo;
    TipoCarta tipo;
    String color;
    Boolean visible;

    Carta(int valorAsignar, String tituloAsignar, TipoCarta tipoAsignar){
        this.valor = valorAsignar;
        this.titulo = tituloAsignar;
        this.tipo = tipoAsignar;
        this.color = asignarColor();
    }

    public void asignarValor(int valorNuevo){
    }

    private String asignarColor(){
        Random random = new Random();
        String [] colores = {"Rojo", "Negro"};
        return colores[random.nextInt(colores.length)];
    }

    public String mostrarCarta() {
        return valor+" de tipo: " + mostrarTipoCarta();
    }

    private String mostrarTipoCarta() {
        return switch (tipo) {
            case AsCorazon -> "As de corazón";
            case AsRombo -> "As de rombo";
            case AsTrebol -> "As de trebol";
            case AsPica -> "As de pica";
            case Rombo -> "Rombo";
            case Trebol -> "Trebol";
            case Picas -> "Picas";
            case Corazon -> "Corazón";
            case J -> "Sirviente - J";
            case Q -> "Reina - Q";
            case K -> "Rey - K";
            default -> "Tipo de carta sin titulo";
        };
    }
}

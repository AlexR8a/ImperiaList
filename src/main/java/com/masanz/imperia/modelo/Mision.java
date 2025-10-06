package com.masanz.imperia.modelo;

public abstract class Mision {
    Jugador jugador;
    public boolean setJugador(Jugador jugador) {
        this.jugador = jugador;
        return true;
    }

    public abstract boolean estaCumplida();

    public abstract String toString();
}

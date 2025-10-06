package com.masanz.imperia.modelo;

import com.masanz.imperia.terminal.Juego;

import java.util.Random;

public class MisionDestruirJugador extends Mision {
    private Jugador jugadorQueHayQueDestruir;
    public MisionDestruirJugador(Jugador jugador) {
            this.jugadorQueHayQueDestruir = jugador;
    }

    public boolean setJugador(Jugador jugador){
        super.setJugador(jugador);
        if (jugador.equals(jugadorQueHayQueDestruir)){
            return false;
        }
        return true;
    }

    @Override
    public boolean estaCumplida() {

        return Mundo.getListaTerritoriosDelJugador(jugadorQueHayQueDestruir.getId()).isEmpty();
    }

    @Override
    public String toString() {
        return "Tienes que destruir al jugador: " + jugadorQueHayQueDestruir;
    }
}

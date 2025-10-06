package com.masanz.imperia.modelo;

public class MisionConquistar24Territorios extends Mision {
    public MisionConquistar24Territorios (){


    }

    @Override
    public boolean estaCumplida() {
        return Mundo.getListaTerritoriosDelJugador(jugador.getId()).size() >= 24;
    }

    @Override
    public String toString() {
        return "Tienes que conquistar 24 territorios";
    }
}

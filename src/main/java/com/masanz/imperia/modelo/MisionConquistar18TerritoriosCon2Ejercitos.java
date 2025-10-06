package com.masanz.imperia.modelo;

public class MisionConquistar18TerritoriosCon2Ejercitos extends Mision {
    public MisionConquistar18TerritoriosCon2Ejercitos() {

    }

    @Override
    public boolean estaCumplida() {
        int n = 0;
        for (int i = 0; i < Mundo.getListaTerritoriosDelJugador(jugador.getId()).size(); i++) {
            if (Mundo.getListaTerritoriosDelJugador(jugador.getId()).get(i).getEjercitos() >= 2){
                n++;
            }
        }
        if (n >= 18){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "tienes que conquistar almenos 18 territorios y tener por lo menos 2 ejercitos en cada uno";
    }
}

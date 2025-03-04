package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RuletaRusa {
    private List<Integer> tambor;
    private int bala, posicionActual;
    private Random random;

    public RuletaRusa() {
        random = new Random();
        reiniciarJuego();
    }

    public boolean disparar() {
        boolean disparo = (posicionActual == bala);
        posicionActual = (posicionActual + 1) % 6;
        return disparo;
    }

    public void reiniciarJuego() {
        tambor = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5));
        bala = random.nextInt(6);
        posicionActual = 0;
    }

    public int getPosicionBala() {
        return bala;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public List<Integer> getTambor() {
        return tambor;
    }

    public void setBala(int bala) {
        this.bala = bala;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setTambor(List<Integer> tambor) {
        this.tambor = tambor;
    }
}

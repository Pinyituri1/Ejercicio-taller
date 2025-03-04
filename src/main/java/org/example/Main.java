package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RuletaRusa juego = new RuletaRusa();
        List<String> jugadores = new ArrayList<>();
        boolean juegoActivo = true;
        int opcion;

        // Ingresar nombres de los jugadores
        System.out.println("Ingrese los nombres de los 6 jugadores:");
        for (int i = 1; i <= 6; i++) {
            System.out.print("Jugador " + i + ": ");
            jugadores.add(scanner.nextLine());
        }

        while (juegoActivo) {
            System.out.println("\n1. Jugar");
            System.out.println("2. Reiniciar");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    //Un bucle for-each que recorre la lista jugadores.
                    //En cada iteración, la variable jugador toma el nombre de un jugador de la lista.
                    for (String jugador : jugadores) {
                        System.out.println("\n" + jugador + " dispara...");
                        System.out.println("Presiona ENTER para disparar...");
                        scanner.nextLine();

                        System.out.println("Posición actual: " + juego.getPosicionActual() +
                                " | Posición de la bala: " + juego.getPosicionBala());

                        if (juego.disparar()) {
                            System.out.println(jugador + " ha perdido.");
                            juegoActivo = false;
                            break;
                        }
                        System.out.println(jugador + " sobrevive.");
                    }
                    break;
                case 2:
                    juego.reiniciarJuego();
                    System.out.println("Juego reiniciado.");
                    break;
                case 3:
                    juegoActivo = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        scanner.close();
    }
}

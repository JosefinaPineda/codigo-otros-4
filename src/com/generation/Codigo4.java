package com.generation;

import java.util.Scanner; // Se importa

/*
 * El programa nos permite recrear el juego de piedras, papel o tijeras
 * 
 * Datos de entrada:
 * String de jugador 1: debe ser piedra, papel o tijeras.
 * String de jugador 2: debe ser piedra, papel o tijeras.
 * 
 * Datos de salida:
 * Mensaje por consola mostrando qué jugador ganó.
 */

public class Codigo4 {

    public static void main(String[] args) { // Se agrega
        Scanner s = new Scanner(System.in); // Se instancia correctamente

        while (true) { // Se agrega
            System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
            String j1 = s.nextLine();

            System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Se corrige a 2
            String j2 = s.nextLine();

            if (j1.equals(j2)) {
                System.out.println("Empate");
            } else {
                int g = 2;
                switch (j1) {
                    case "piedra":
                        if (j2.equals("tijeras")) { // Se usa equals para comparar correctamente String
                            g = 1;
                        }
                        break; // Se agrega

                    case "papel":
                        if (j2.equals("piedra")) { // Se usa equals para comparar correctamente String
                            g = 1;
                        }
                        break; // Se agrega

                    case "tijeras": // Se corrige a tijeras
                        if (j2.equals("papel")) { // Se usa equals para comparar correctamente String
                            g = 1;
                        }
                        break; // Se agrega

                    default:
                        System.out.println("Entrada inválida"); // Se agrega un caso para manejar entradas inválidas.
                        continue;
                }
                System.out.println("Gana el jugador " + g);
            }

            System.out.print("¿Desea continuar jugando? (si/no): ");  // Se añadepara permitir múltiples rondas de juego.
            String respuesta = s.nextLine();

            if (respuesta.equalsIgnoreCase("no")) { // Se añade una opción para terminar el juego.
                System.out.println("El juego ha terminado.");
                break;
            }
        }

        s.close(); // Se agrega
    }
}

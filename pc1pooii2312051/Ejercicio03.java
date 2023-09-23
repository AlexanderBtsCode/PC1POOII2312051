
package com.mycompany.pc1pooii2312051;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número final para los kilómetros por hora mayor a 60KPH: ");
            int finalKPH = scanner.nextInt();

            if (finalKPH <= 60 || finalKPH % 10 != 0) {
                System.out.println("Programa finalizado, usted debe ingresar un valor múltiplo de 10 mayor a 60KPH");
                System.exit(0);
            }

            System.out.println("KPH\t\tMPH");
            System.out.println("-------------------");

            for (int kph = 60; kph <= finalKPH; kph += 10) {
                double mph = kph * 0.6214;
                System.out.printf("%d\t\t%.1f\n", kph, mph);
            }
        } catch (Exception e) {
            System.out.println("Error: Ingrese un valor válido.");
        }
    }
}
package ar.edu.unju.edm.tpn2.points;

import java.util.Scanner;

public class Point11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el numero del mes: ");
        int month = scanner.nextInt();

        switch (month) {

            case 1:
                System.out.println("Enero");
                break;

            case 2:
                System.out.println("Febrero");
                break;

            case 3:
                System.out.println("Marzo");
                break;

            case 4:
                System.out.println("Abril");
                break;

            case 5:
                System.out.println("Mayo");
                break;

            case 6:
                System.out.println("Junio");
                break;

            case 7:
                System.out.println("Julio");
                break;

            case 8:
                System.out.println("Agosto");
                break;

            case 9:
                System.out.println("Septiembre");
                break;

            case 10:
                System.out.println("Octubre");
                break;

            case 11:
                System.out.println("Noviembre");
                break;

            case 12:
                System.out.println("Diciembre");
                break;

            default:
                System.out.println("No existe ese mes");
        }
        scanner.close();
    }
}

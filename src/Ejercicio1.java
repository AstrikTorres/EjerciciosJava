import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {

        /*
        Debe diseñar un programa que reciba 3 números por consola y
        determine cual de los 3 números es el mayor.
        Plus: Imprimir los números ordenados de mayor a menor.
        Plus: Imprimir los números ordenados de menor a mayor.
        */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su primer número");
        float a = leer.nextInt();
        System.out.println("Ingrese su segundo número");
        float b = leer.nextInt();
        System.out.println("Ingrese su tercer número");
        float c = leer.nextInt();

        System.out.println("Su numero mayor es:");
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else if (c > a && c > b) {
            System.out.println(c);
        }

        System.out.println("Números ordenados de mayor a menor:");
        if (a > b && a > c) {
            System.out.println(a);
            if (c > b) {
                System.out.println(c);
                System.out.println(b);
            }
            else{
                System.out.println(b);
                System.out.println(c);
            }
        }
        else if (b > a && b > c) {
            System.out.println(b);
            if (c > a) {
                System.out.println(c);
                System.out.println(a);
            }
            else{
                System.out.println(a);
                System.out.println(c);
            }
        }
        else {
            System.out.println(c);
            if (a > b) {
                System.out.println(a);
                System.out.println(b);
            }
            else {
                System.out.println(b);
                System.out.println(a);
            }
        }

    }

}
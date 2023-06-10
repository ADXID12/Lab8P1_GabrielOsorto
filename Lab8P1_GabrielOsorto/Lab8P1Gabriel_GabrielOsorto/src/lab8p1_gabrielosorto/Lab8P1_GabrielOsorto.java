package lab8p1_gabrielosorto;

import java.util.Scanner;
import java.util.Arrays;

public class Lab8P1_GabrielOsorto {

    static Scanner sc = new Scanner(System.in);
    static String[][] TituloLb;
    static String[][] AutorLb;
    static int[][] LanzaLb;

    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir) {
            System.out.println("-----Menuuu-----");
            System.out.println("1.Agregar Libro");
            System.out.println("2.Cambiar libro");
            System.out.println("3.Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1: {
                    var metlib = llenarLibrero();
                    System.out.println(Arrays.toString(metlib));

                }
                break;
                case 2: {

                }
                break;
                case 3: {
                    seguir = false;
                    System.out.println("Gracias por usar :3");
                }
                break;
                default: {
                    System.out.println("Opcion no valida");
                }
                break;
            }
        }

    }//fin Main

    public static Libro[][] llenarLibrero() {
        
        System.out.print("Ingrese el numero de filas:");
        int fil = sc.nextInt();
        System.out.print("Ingrese el numero de columnas");
        int col = sc.nextInt();
        Libro[][] mat = new Libro[fil][col];

        for (int i = 1; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length+1; j++) {
                System.out.print("Ingrese el titulo del Libro:");
                String titulo = sc.nextLine();
                TituloLb[i][j] = titulo;
                System.out.println(" ");
                System.out.print("Ingrese el Escritor:");
                String autor = sc.nextLine();
                AutorLb[i][j] = autor;
                System.out.println(" ");
                System.out.print("Ingrese la fecha de lanzamiento:");
                int lanza = sc.nextInt();
                LanzaLb[i][j] = lanza;
                System.out.println(" ");
                System.out.println("El libro fue ingresado Exitosamente");
                System.out.println(" ");
            }//fin for interno

        }//fin for externo
        return mat;
    }//fin static Libro

    public static void ImprimirMatriz(Libro[][] librero) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

            }
        }

    }
}

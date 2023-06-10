package lab8p1_gabrielosorto;

import java.util.Scanner;

public class Libro {

    Scanner sc = new Scanner(System.in);

    public Libro() {

    }
    String[][] titulo1;
    String[][] autor1;
    int[][] lanza1;

    public Libro(String[][] titulo, String[][] autor, int[][] lanza) {
        this.titulo1 = titulo;
        this.autor1 = autor;
        this.lanza1 = lanza;
    }

    public String[][] getTitulo1() {
        return titulo1;
    }

    public void setTitulo1(String[][] titulo1) {
        this.titulo1 = titulo1;
    }

    public String[][] getAutor1() {
        return autor1;
    }

    public void setAutor1(String[][] autor1) {
        this.autor1 = autor1;
    }

    public int[][] getLanza1() {
        return lanza1;
    }

    public void setLanza1(int[][] lanza1) {
        this.lanza1 = lanza1;
    }

}

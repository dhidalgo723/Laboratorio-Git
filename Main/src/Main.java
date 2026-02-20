import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Main {
    public static int mitjana = 0, m = 0, i = 0;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de alumno:");
        Alumno a = new Alumno(sc.next());
        boolean close = false;
        while (close == false) {

            System.out.println("""
                    Elija la operacion:
                    1- Agregar nota
                    2-Calcular media
                    3-Mostrar si está aprobado
                    """);
            int r = sc.nextInt();
            switch (r) {
                case 1:
                    System.out.println("Introduce la nueva nota");
                    int n = sc.nextInt();
                    System.out.println("""
                            Introduce la asignatura:
                            1-Entornos de desarrollo
                            2-Programacion
                            3-Bases de datos
                            4-Lenguaje de marcas
                            5-Sistemas
                            """);
                    int assi = sc.nextInt() - 1;
                    afegirnNota(assi, n, a);
                    break;
                case 2:
                    m = CalcularMitjanas(a.getNotas());
                    System.out.println("TU NOTA MEDIA ES DE: " + m);
                    break;
                case 3:
                    mostrar_resultat(m);
                    close = true;
                    break;

                default:
                    break;
            }
        }
        System.out.println("Bienvenido al Calculador de Notas");
    }

    public static void afegirnNota(int assignatura, int notaNova, Alumno a) {
        a.setNotas(assignatura, notaNova);
    }

    public static int CalcularMitjanas(int[] notas) {
        for (int i = 0; i < notas.length; i++) {
            mitjana += notas[i];
        }
        mitjana = mitjana / notas.length;
        return mitjana;
    }

    public static void mostrar_resultat(double notaMitjana) {
        // si ha aprovat
        if (notaMitjana >= 5) {
            System.out.println("Enhorabona, has aprovat!");
        } else {
            System.out.println("Ho sento, has suspès.");
        }
    }
}

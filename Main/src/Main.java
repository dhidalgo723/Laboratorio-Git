import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        CalcularMitjana m;
        System.out.println("Introduce el nombre de alumno:");
        Alumno a = new Alumno(sc.next());
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
                m = new CalcularMitjana(a.getNotas());
                m.mitjana();
                break;
                case 3:
                    
                    break;

            default:
                break;
        }

        System.out.println("Bienvenido al Calculador de Notas");
    }

    public static void afegirnNota(int assignatura, int notaNova, Alumno a) {
        a.setNotas(assignatura, notaNova);
    }
}

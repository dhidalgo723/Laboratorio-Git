
public class Main {

    protected static String[] alumnos = new String[5];
    protected static int[] notas;

    public static int CalcularMitjana(String nom, int assignatura, int novaNota, int mitjana) {
        int i = 0;
        for (i = 0; i < notas.length; i++) {
            mitjana += notas[i];
        }
        mitjana = mitjana / i;
        return mitjana;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al Calculador de Notas");
    }
}

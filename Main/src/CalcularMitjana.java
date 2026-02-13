
public class CalcularMitjana {

    protected static String[] alumnos = new String[5];
    protected static int[] notas = new int[5];
    protected static int mitjana;

    public CalcularMitjana(int[] notas) {
        this.notas = notas;
    }

    public static int mitjana(int mitjana) {
        int i = 0;
        for (i = 0; i < notas.length; i++) {
            mitjana += notas[i];
        }
        mitjana = mitjana / i;
        return mitjana;
    }

    public static int getMitjana() {
        return mitjana;
    }

    public void setMitjana(int mitjana) {
        CalcularMitjana.mitjana = mitjana;
    }
}

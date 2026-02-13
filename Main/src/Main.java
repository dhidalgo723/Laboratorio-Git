

public class Main {
public static String[] alumnos = new String[5];
public static int[] notas =new int[5];
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al Calculador de Notas");
    }

    public static void afegirnNota(int assignatura, int notaNova, Alumno a){
            a.setNotas(assignatura, notaNova);
        }
    }




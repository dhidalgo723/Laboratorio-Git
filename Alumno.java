import java.util.Arrays;

public class Alumno {
    private String nombre;
    int[] notas;
    public Alumno(String nombre){
        notas = new int[5];
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int[] getNotas(){
        return Arrays.copyOf(notas, notas.length);
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setNotas(int posicion, int nuevaNota){
        this.notas[posicion] = nuevaNota;
    }
}
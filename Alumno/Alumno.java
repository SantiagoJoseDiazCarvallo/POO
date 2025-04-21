public class Alumno implements IAlumno{
    private String nombre;
    private int[] notas;
    private int contadorNotas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new int[10]; // máximo 10 notas
        this.contadorNotas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getNota() {
        return notas;
    }

    public boolean incluirNota(int nota) {
        if (contadorNotas < 10 && nota >= 0 && nota <= 10) {
            notas[contadorNotas] = nota;
            contadorNotas++;
            return true;
        }
        return false;
    }

    public int numNota() {
        return contadorNotas;
    }

    public double getNotaMedia() {
        if (contadorNotas == 0) return 0;
        int suma = 0;
        for (int i = 0; i < contadorNotas; i++) {
            suma += notas[i];
        }
        return (double) suma / contadorNotas;
    }

    public int getNumeroAprobado() {
        int aprobados = 0;
        for (int i = 0; i < contadorNotas; i++) {
            if (notas[i] >= 3) {
                aprobados++;
            }
        }
        return aprobados;
    }

    public void borrarNotas() {
        contadorNotas = 0;
    }
}

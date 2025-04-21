public interface IAlumno {
    public String getNombre();

    public int[] getNota();

    public boolean incluirNota(int nota);

    public int numNota();

    public double getNotaMedia();

    public int getNumeroAprobado();

    public void borrarNotas();
}

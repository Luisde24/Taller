package modelo;

public class Curso {

    private String codigoDelCurso;
    private String nombreCurso;
    private int creditos;
    private double nota;

    public Curso(String cod, String nom, int cre)
    {

    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int nuevosCreditos) {
        this.creditos = nuevosCreditos;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nuevaNota) {
        this.nota = nuevaNota;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }
    public String getDescripcion()
    {
       return "";
    }

    public String getCodigoDelCurso() {
        return codigoDelCurso;
    }


    public boolean EstaCalificado()
    {

        return true;
    }

}

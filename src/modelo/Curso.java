package modelo;

public class Curso {

    private String codigoDelCurso;
    private String nombreCurso;
    private int creditos;
    private double nota;

    public Curso(String cod, String nom, int cre)
    {
        this.codigoDelCurso = cod;
        this.nombreCurso = nom;
        this.creditos = cre;
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
       return String.format("Nombre: {0} Código: {1} Créditos: {2}", nombreCurso, codigoDelCurso, creditos);
    }

    public String getCodigoDelCurso() {
        return codigoDelCurso;
    }


    public boolean EstaCalificado()
    {
        if (nota == 0.0)
        {
            return false;
        }
        else
        {
            return true;
        }

    }

}

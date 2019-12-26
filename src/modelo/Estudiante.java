package modelo;
import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.Scanner;
public class Estudiante  {

    private String nombre;
    private String apellido;
    private int codigo;
    private Curso[] cursos;



    public Estudiante(String nombre, String apellido, int codigo)
    {

    }

    public boolean asignarCurso(Curso curso)
    {

        return true;
    }

    public double CalcularPromedio()//me calcula el promedio de la materia
    {
        return 0;
    }
    public boolean pensumIncluyeCurso(String codigoCurso)
    {
        return true;
    }
    public boolean EstudianteEstaPrueba()
    {
    return true;
    }

    public boolean tieneCursosCompletos(String codigoCurso)
    {
        return true;
    }

    public Curso BuscarCurso(String codigoCurso)
    {

        return null;
    }

}

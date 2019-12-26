package modelo;
import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.Scanner;
public class Estudiante  {

    //atributos encapsulado
    private String nombre;
    private String apellido;
    private int codigo;
    private Curso Curso1;
    private Curso Curso2;
    private Curso Curso3;
    private Curso Curso4;
    private Curso Curso5;

   private Curso[] cursos;



    public Estudiante(String nombre, String apellido, int codigo)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        cursos = new Curso[5];
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public Curso getCurso1() {
        return Curso1;
    }

    public Curso getCurso2() {
        return Curso2;
    }

    public Curso getCurso3() {
        return Curso3;
    }

    public Curso getCurso4() {
        return Curso4;
    }

    public Curso getCurso5() {
        return Curso5;
    }


    public boolean asignarCurso(Curso curso)
    {


        for(int i=0; i< cursos.length; i++){

            if(cursos[i] == null){

                cursos[i] = curso;

                return true;
            }

        }
        return false;
    }

    public double CalcularPromedio()//me calcula el promedio de la materia
    {


      return 0.0;
    }
    public boolean pensumIncluyeCurso(String codigoCurso)
    {
        if (BuscarCurso(codigoCurso) != null)
        {
            return true;
        }
        else
        {
            return false;
        }

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

        for (int i = 0; i < cursos.length; ++i)
        {
            if (cursos[i] != null && cursos[i].getCodigoDelCurso().equals(codigoCurso))
            {
                System.out.println("El curso ha sido tomado");
                return cursos[i];
            }
        }
        return null;

    }



}

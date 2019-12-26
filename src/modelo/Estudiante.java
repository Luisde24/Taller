package modelo;
import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

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
        double promedioMaterias = 0.0;
        int totalCreditos = 0;

        for (int i = 0; i < cursos.length; ++i)
        {
            if (cursos[i] != null)
            {
                if (cursos[i].getNota() != 0.0)
                {
                    totalCreditos = totalCreditos + cursos[i].getCreditos();
                    promedioMaterias = promedioMaterias + cursos[i].getNota() * cursos[i].getCreditos();
                }
            }
        }

        if (totalCreditos != 0)
        {
            return (promedioMaterias / totalCreditos);
        }
        else
        {
            return promedioMaterias;
        }

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

        if (CalcularPromedio() < 3.5)
        {
            return true;
        }
        else
        {
            return false;
        }

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

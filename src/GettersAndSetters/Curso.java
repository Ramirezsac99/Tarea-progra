package GettersAndSetters;

public class Curso {

    private String nombreCurso;
    private double nota1;
    private double nota2;
    private double nota3;

    public Curso(String nombreCurso, double nota1, double nota2, double nota3) {
        this.nombreCurso = nombreCurso;
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
    }

    // Getters
    public String getNombreCurso() {
        return nombreCurso;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    // Setters con validación de rango 0-100
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setNota1(double nota1) {
        if (nota1 < 0 || nota1 > 100) {
            System.out.println("Error: nota1 debe estar entre 0 y 100.");
        } else {
            this.nota1 = nota1;
        }
    }

    public void setNota2(double nota2) {
        if (nota2 < 0 || nota2 > 100) {
            System.out.println("Error: nota2 debe estar entre 0 y 100.");
        } else {
            this.nota2 = nota2;
        }
    }

    public void setNota3(double nota3) {
        if (nota3 < 0 || nota3 > 100) {
            System.out.println("Error: nota3 debe estar entre 0 y 100.");
        } else {
            this.nota3 = nota3;
        }
    }

    // Calcula el promedio de las tres notas
    public double promedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Retorna el estado según el promedio
    public String estado() {
        if (promedio() >= 61) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public void mostrar() {
        System.out.printf("Curso: %s | Notas: %.1f, %.1f, %.1f | Promedio: %.2f -> %s%n",
                nombreCurso, nota1, nota2, nota3, promedio(), estado());
    }
}
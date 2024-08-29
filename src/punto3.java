import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class punto3 extends Persona {

    private String matricula;

    public punto3(String nombre, int edad, String genero, String matricula) {
        super(nombre, edad, genero);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", genero='" + getGenero() + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    public static void main(String[] args) {
        punto3 est1 = new punto3("Carlos", 20, "Masculino", "MAT123");
        punto3 est2 = new punto3("Ana", 22, "Femenino", "MAT456");
        punto3 est3 = new punto3("Juan", 21, "Masculino", "MAT789");

        // Crear un mapa que asocie la matrícula con el Estudiante
        Map<String, punto3> mapaEstudiantes = new HashMap<>();
        mapaEstudiantes.put(est1.getMatricula(), est1);
        mapaEstudiantes.put(est2.getMatricula(), est2);
        mapaEstudiantes.put(est3.getMatricula(), est3);

        // Mostrar los estudiantes a partir de su matrícula
        String matriculaBuscada = JOptionPane.showInputDialog("Ingrese la matrícula del estudiante a buscar:");
        punto3 estudianteEncontrado = mapaEstudiantes.get(matriculaBuscada);

        if (estudianteEncontrado != null) {
            System.out.println("Estudiante encontrado: " + estudianteEncontrado);
        } else {
            System.out.println("No se encontró ningún estudiante con la matrícula: " + matriculaBuscada);
        }
    }

}








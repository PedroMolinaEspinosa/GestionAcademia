package controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import modelo.DTO.Alumno;
import modelo.DTO.Profesor;

public class GeneradorAleatorio {

	public static void main(String[] args) {
		// List<Alumno> generados = generarAlumno(20);
		// System.out.println(generados.toString());
		// generarTelefono();
		// generarDNI();
		generarAlumno(5);

	}

	private static int generarTelefono() {

		int telefono = (int) (Math.random() * 100000000 + 600000000);

		return telefono;

	}

	private static String generarDNI() {
		int numero = (int) (Math.random() * 100000000 + 10000000);
		String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
		int modulo = numero % 23;
		char letra = juegoCaracteres.charAt(modulo);
		String dni = numero + "" + letra;

		return dni;

	}

	public static List<Alumno> generarAlumno(int i) {

		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		List<Alumno> listaAlumnosGenerados = new ArrayList<Alumno>();

		String nombre;
		String apellido;
		int telefono;
		String dni;

		try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/NombresYApellidos.csv"));) {

			String line = br.readLine();
			while (line != null) {

				String[] campo = line.split(",");

				nombre = campo[0];
				apellido = campo[1];
				Alumno alumno = new Alumno(nombre, apellido, 0, "");

				listaAlumnos.add(alumno);
				// System.out.println(alumno.toString());
				line = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int j = 0; j < i; j++) {
			Random random = new Random();
			Random random1 = new Random();
			int generarNombre = random.nextInt(100);
			int generarApellido = random1.nextInt(100);

			Alumno alumnoPreProcesoNombre = listaAlumnos.get(generarNombre);
			nombre = alumnoPreProcesoNombre.getNombre();
			Alumno alumnoPreProcesoApellido = listaAlumnos.get(generarApellido);
			apellido = alumnoPreProcesoApellido.getApellidos();
			telefono = generarTelefono();
			dni = generarDNI();
			Alumno alumno = new Alumno(nombre, apellido, telefono, dni);
			System.out.println(alumno.toString());
			listaAlumnosGenerados.add(alumno);
			// System.out.println(alumno);

			// FALLA LA VISIBILIDAD DEL MÉTODO DE INSERTAR DEL DAO
			// System.out.println("intentando insertar");
			// AlumnoDAO alumnoDAO = new AlumnoDAO();
			// alumnoDAO.insertarAlumno(alumno);
			// insertarAlumno(alumno);
			// insertarListaPersonas(listaAlumnosGenerados);

		}

		return listaAlumnosGenerados;
	}

	public static List<Profesor> generarProfesor(int i) {

		List<Profesor> listaProfesores = new ArrayList<Profesor>();
		List<Profesor> listaProfesoresGenerados = new ArrayList<Profesor>();

		String nombre;
		String apellido;
		int telefono;
		String dni;

		try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/NombresYApellidos.csv"));) {

			String line = br.readLine();
			while (line != null) {

				String[] campo = line.split(",");

				nombre = campo[0];
				apellido = campo[1];
				Profesor profesor = new Profesor(nombre, apellido, 0, "");

				listaProfesores.add(profesor);
				// System.out.println(alumno.toString());
				line = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int j = 0; j < i; j++) {
			Random random = new Random();
			Random random1 = new Random();
			int generarNombre = random.nextInt(100);
			int generarApellido = random1.nextInt(100);

			Profesor profesorPreProcesoNombre = listaProfesores.get(generarNombre);
			nombre = profesorPreProcesoNombre.getNombre();
			Profesor profesorPreProcesoApellido = listaProfesores.get(generarApellido);
			apellido = profesorPreProcesoApellido.getApellidos();
			telefono = generarTelefono();
			dni = generarDNI();
			Profesor profesor = new Profesor(nombre, apellido, telefono, dni);
			System.out.println(profesor.toString());
			listaProfesoresGenerados.add(profesor);

			// INSERCION DE PROFESORES EN EL DAO CREANDO UN OBJETO TIPO PROFESORDAO

		}

		return listaProfesoresGenerados;
	}

}

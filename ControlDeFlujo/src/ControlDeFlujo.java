import java.util.Scanner;
public class ControlDeFlujo { 
	
	public static void main(String[]  args) {
		//TODO Auto-generated method stub
	
	/*
	 * if(condicion)si se cumple{
		 * codigo
		 * codigo
		 * codigo
	 * }
	 * else if (condicion) se cumple se ejecuta el else if {
	 * codigo
	 * codigo
	 * codigo
	 * }
	 * else (condicion) no se cumple el if {
	 * codigo
	 * codigo
	 * codigo
	 * }
	 */
		Scanner leerEdad = new Scanner (System.in);
		System.out.println("ingresa tu edad");
		int edad = leerEdad.nextInt();
		
		String mensaje = votar(edad);
		System.out.println(mensaje);
		
		Scanner leerNombre = new Scanner (System.in);
		System.out.println("ingresa tu nombre");
		String nombre = leerNombre.next();
		
		String mensaje2 = acceso(edad,nombre);
		System.out.println(mensaje2); 
		
				
		
	}
	
	public static String votar(int edad) {
		String mensaje = "";
		if (edad >=18) {
			mensaje = "Felicidades, puedes voar";			
		}
		else {
			mensaje = "No puedes votar";
		}
		return mensaje;
	}
	
	/*
	 * Escribir un programa que pida el nombre y la edad de un participante
		 si la edad es mayor o igual a 18 y menor o igual a 29, mostrar un
		 mensaje que diga "Felicidades + nombreIngresado, estas aceptado en
		 el programa de generation Java Full Stack".
		 En caso de no cumplirse la condición, mostrar un mensaje que diga
		 "No cumples lo requisitos para el bootcamp Java Full Stack"

	 */
	
	public static String acceso(int edad ,String nombre ) {
		String mensaje2 = "";
		if (edad>=18 & edad<29) {
			mensaje2 = "Felicidades, " + nombre + "estas aceptado en Generation";				
		}
		else {
			mensaje2 = "No cumples lo requisitos para el bootcamp Java Full Stack";				
		}
		return mensaje2;		
	}
	

}

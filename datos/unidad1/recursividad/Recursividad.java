package datos.unidad1.recursividad;

public class Recursividad{
		
	public static void Recursividad(int total, String nombre) {
		if(total <= 0) //condición Base
			return;

		else { //condición recursiva o repetitiva
		System.out.println("Hola " + nombre);
		Recursividad(total-1, nombre);
	
		}
	}


	public static void main(String[] args) {
		Recursividad(10, "Nahum");
	}

}
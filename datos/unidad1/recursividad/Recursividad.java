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
	
	public static void cuentaRegresiva(int n) {
		if(n < 1){ //condicion Base
			return;
		
		} else {
			System.out.print(n + " ");
			cuentaRegresiva(n-1);
		}
	}

	public static void main(String[] args) {
		//Recursividad(10, "Nahum");
		cuentaRegresiva(10);
	}

}


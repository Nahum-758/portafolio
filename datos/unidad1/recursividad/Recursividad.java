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

	public static int sumaRecursiva(int[] datos, int longitud){
		
		if (longitud < 0){
			return 0;

		} else{
			return datos[longitud] + sumaRecursiva(datos, longitud -1);
		}

	}

	public static void main(String[] args) {
		//Recursividad(100, "Nahum");
		//cuentaRegresiva(100);
		int[] arreglos = {2,4,6,7,9,10,11};
		int total = sumaRecursiva(arreglos, arreglos.length - 1);
		System.out.println("La suma es: " + total);

	}

}


package datos.unidad1.recursividad;

public class Recursividad{
		
	public static void Recursividad(int total) {
		if(total <= 0) //condición Base
			return;

	else { //condición recursiva o repetitiva
		System.out.println("Hola");
		saludo(total-1);
	
	}
}


public static void main(String[] args) {
	saludo(10);
}
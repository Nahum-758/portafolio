public class operaciones {

	public static double sumarDosNumeros(double a, double b) {
		return a + b;
}

	public static int sumar(int[] datos, int longitud){
		
		if (longitud < 0){
			return 0;

		} else{
			return datos[longitud] + sumar(datos, longitud -1);
		}

	}

	public static void main(String[] args) {
		double resultadoSimple = sumarDosNumeros(12.5, 7.5);
		int[] arreglos = {2,4,6,7,9,10,11};
		int total = sumar(arreglos, arreglos.length - 1);
		System.out.println("La suma es: " + total);

	}

}
/**
 *Programa de demostración.
 *Paso de parámetros por valor y por referencia.
 
 *@author Kevin Antonio Gómez Cobos
 *@version 1.0 18/11/2021
 *@see String
 *@see System
 */
public class ValRef{
    /**
     *Método Main
     *@param args son los argumentos para el metodo main
     */
    public static void main(String[] args){
		String a = "Hola";
		String b = "Gente";
		String c = "Bonita";
		//Se crea el método pero sin asignar valores
		unionValor(a,b,c);
		//Aquí ya se le asigna el valor a la variable, por lo que 
		//será lo que regrese el método, en este caso Hola Gente Bonita.
		a = unionValor(a,b,c);
		System.out.println(a);
		
		
		//Se crea el arreglo que nos servirá de referencia.
		int[] arreglo = new int [5];
		for(int i = 0; i < arreglo.length; i++){
	    	arreglo [i] = i;
		}
		
		
		/**Aquí la diferencia radica en que modifica directamente el valor 
		*del arreglo mediante la referencia de su memoria, por lo que sus 
		*elementos alteran su valor y no es necesario ir asignándolo uno a uno.
		*/
		multiRef(arreglo);
		for(int i = 0; i < arreglo.length; i++){
	    	System.out.println(arreglo[i]);
		}
    }

    /**
     *Método para unir tres Strings en un sólo String con un espacio entre ellos
     *@param a - String uno 
     *@param b - String dos
	 *@param c - String tres
     *@return String - Regresa el String resultante de unir a los Strings a, b y c
     */
	 
    //Método que recibe tres parámetros por valor, en este caso tres Strings.
    public static String unionValor(String a, String b, String c){
		//Se crea el String vacío.
		String frase;
		//Aquí se unen los tres Strings en el vacío.
		frase = a+" "+b+" "+c;
		//Regresa el String que ahora contiene a los Strings unidos para poder ser asignado a otra variable.
		return frase;
    }

    /**
     *Método que multiplica por 5 todos los elementos de un arreglo de números enteros
     *@param arreglo - Arreglo de números enteros
     */
	 
    //Método que recibe la referencia de un arreglo de enteros
    public static void multiRef(int[] arreglo){
		//Recorre el arreglo
		for(int i = 0; i < arreglo.length; i++){
	    	//Va multiplicar por 5 cada elemento del arreglo y le asigna el
			//resultado de la multiplicación al elemento que le corresponde.
	    	arreglo[i] = arreglo[i]*5;

	    	/*No es necesario el return, ya que estamos 
	    	 *modificando el valor de los elementos del 
			 *arreglo mediante su referencia en la memoria.
	     	*/		
		}
    }
}
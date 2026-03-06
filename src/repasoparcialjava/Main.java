package repasoparcialjava;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sumaNumerosEntre4();
		factorialNumero();
		leerCantidad();
		promedioNumeros();
		sumaDigitos();

	}
// /////////////////////////////////////////////////////////////////////////////////////////
// PARTE 1 CICLOS
	
	//ejercicio 1
	
	// Escriba un programa que lea un número n 
	//y muestre la suma de todos los números divisibles 
	//entre 4 desde 1 hasta n.
	
	static void sumaNumerosEntre4(){
		Scanner sc = new Scanner(System.in);
		int num; 
		int suma=0;
		
		System.out.println("Escriba un numero entero");
		num = sc.nextInt();
		
		for (int i =1; i<=num;i++) {
			if(i%4==0) {
				suma= suma+i;
			}
		}
		System.out.println("La suma de los numeros divisibles entre cuatro hasta "+num + " es: "+ suma);
	}
	
	// ejercicio 2: 
	
	// Escriba un programa que lea un número n 
	// y muestre el factorial de n (n!).
	static void factorialNumero() {
		Scanner sc = new Scanner(System.in);
		int num;
		int factorial= 1;
		System.out.println("Ingrese un numero entero: ");
		num = sc.nextInt();
		//operador OR
		if(num==0 || num==1 ) {
			System.out.println("El factorial del numero es 1");}
		else {
			for(int i= 1;i<=num;i++){
			factorial= factorial* i;}
		}
		System.out.println("El factorial del numero "+ num +" es: "+ factorial);
		}
	
	//Ejercicio 3:
	
	//Escriba un programa que lea una cantidad n y luego n números.
	//Debe mostrar:
	//- Cuántos son positivos
	//- Cuántos son negativos
	//- Cuántos son cero
	public static void leerCantidad() {
		Scanner sc = new Scanner(System.in);
		int n;
		int cantidad;
		int positivos=0;
		int negativos=0;
		int ceros=0;
		
		System.out.println("Ingrese la cantidad de numeros: ");
		n= sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Ingrese el numero: "+ i + " : ");
			cantidad = sc.nextInt();
			if(cantidad>0) {
				positivos++;
			}else if(cantidad<0) {
				negativos++;
			}else {
				ceros++;
			}
			
			
		}
		System.out.println("Positivos: "+ positivos);
		System.out.println("Negativos: "+ negativos);
		System.out.println("Ceros: "+ ceros);
		
	}
	//ejercicio 4
	
	// Escriba un programa que lea un número n y
	//muestre el promedio de los números pares entre 1 y n
	public static void promedioNumeros() {
		Scanner sc = new Scanner(System.in);
		//validacion try-catch
		double promedio;
		int suma =0;
		int contador= 0;
		try {
            System.out.print("Ingrese un número: ");
            int num = Integer.parseInt(sc.nextLine());
            for(int i=1;i<=num;i++) {
            	if(i%2==0) {
            		suma=suma+i;//verifica si es par y va sumandolo en la variable suma
            		contador++;
            	}
    			
    		}
            if(contador>0) {
            	promedio=suma/contador;
            	System.out.println("El promedio de los numeros pares entre 1 y "+num+" es: "+promedio);
            }else {
            	System.out.println("No hay numeros pares entre 1 y "+num);
            }
           
        } catch (Exception e) {
            System.out.println("Error: Debe ingresar un número válido.");
        }
		
	}
	
	//ejercicio 5
	
	// Escriba un programa que lea un número n 
	//y muestre la suma de sus dígitos.
	public static void sumaDigitos() {
		Scanner sc = new Scanner(System.in);
		int suma=0;
		try {
			System.out.println("Imgrese un numero: ");
		    int num = sc.nextInt();
		    while (num != 0) {

	            int digito = num % 10; // obtiene el último dígito
	            suma = suma + digito;  // suma el dígito

	            num = num / 10; // elimina el último dígito
	        }
		    System.out.println("La suma de los digitos es: "+suma);

		} catch (Exception e) {
		    System.out.println("Error al ingresar el número");
		}
	}
	
	
	
// /////////////////////////////////////////////////////////////////////////////////////////
}

package repasoparcialjava;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Primera parte");
		System.out.println("2. Segunda parte");
		System.out.println("3. Tercera parte");
		System.out.println("4. Cuarta parte");
		System.out.println("5. Quinta parte");
		
		System.out.println("Ingrese un numero");
		int opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			sumaNumerosEntre4();
			factorialNumero();
			leerCantidad();
			promedioNumeros();
			sumaDigitos();
		break;
		case 2:
			multiplosDe7y11();
			leernumero();
			leerHora();
			break;
		case 3:
			numeroRomano();
			leerOpcion();
			break;
		case 4:
			mayorMenor();
			tablaDivision();
			digitosPares();
			numerotriangular();
			promedionegativos();
			break;
		case 5:
			multiplosDe6();
			potenciaDe2();
			numeroInvertido();
			sumaParImpar();
			gradosfahrenheit();
			break;
		}
		

	}
// /////////////////////////////////////////////////////////////////////////////////////////
// PARTE 1 CICLOS
	
	//ejercicio 1 Ciclos y Operaciones Numericas
	
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
	
	//Parte 2 Condiciones y Divisibilidad
	
	//ejercicio 6
	//Escriba un programa que lea un número n 
	//y determine si es múltiplo de 7 o de 11.
	
	static void multiplosDe7y11() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Escriba un numero: ");
		num=sc.nextInt();
		
		if(num%7==0) {
			System.out.println("El numero es multiplo de 7.");
		}else if(num%11==0){
			System.out.println("El numero es multiplo de 11. ");
			//operador OR verdadero si al menos una condicion es verdadera
		}else if(num%7 !=0 || num%11 !=0){
			System.out.println("El numero no es multiplo de 7 ni de 11.");
		}else {
			System.out.println("Escriba un numero valido.");
		}
	}
	
	//ejercicio 7
	
	//Escriba un programa que lea un número `n` 
	//y muestre los números entre 1 y `n` que sean:
	//- Divisibles entre 3
	//- Pero **no** divisibles entre 2
	
	static void leernumero() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Ingrese un numero: ");
		num = sc.nextInt();
		for(int i=1;i<=num;i++) {
		if(i%3==0 && i%2 !=0) {
			System.out.println("Los numeros divisibles entre 3 pero no entre 2 son:"+i);
		}
		}
	}
	
	//ejercicio 8
	
	//Escriba un programa que lea una hora en formato 24 horas (`0–23`) y muestre:
	//- `"Mañana"`
	//- `"Tarde"`
	//- `"Noche"`
	
	static void leerHora() {
		Scanner sc = new Scanner(System.in);
		int hora;
		System.out.println("Ingrese una hora en formato de 0-23");
		hora =sc.nextInt();
		
		if(hora >= 0 && hora < 12) {//operador AND, verdadero si todas las condiciones son verdaderas
			System.out.println("Mañana. ");
		}else if(hora<=18) {
			System.out.println("Tarde. ");
		}else if(hora<=23) {
			System.out.println("Noche. ");
		}else {
			System.out.println("Formato de hora incorrecto");
		}
		
	}
	// Parte 3 Uso switch
	
	//ejercicio 9
	//Escriba un programa que use switch para convertir un número 
	//del 1 al 5 en número romano:
	
	static void numeroRomano() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Ingrese un numero del 1 al 5");
		num = sc.nextInt();
		
		switch(num) {
		case 1: 
			System.out.println("El numero 1 en romano es: I ");
			break;
		case 2:
			System.out.println("El numero 2 en romano es: II ");
			break;
		case 3: 
			System.out.println("El numero 1 en romano es: III ");
			break;
		case 4:
			System.out.println("El numero 2 en romano es: IV ");
			break;	
		case 5: 
			System.out.println("El numero 1 en romano es: V ");
			break;
		default:
			System.out.println("Numero fuera del rango");
			break;
		}
	}
	
	//ejercicio 10
	
	//Escriba un programa que lea una opción (1–3) y dos números.
	//- Si `opcion = 1` → Sumar
	//- Si `opcion = 2` → Restar
	//- Si `opcion = 3` → Multiplicar
	
	static void leerOpcion() {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int opcion;
		int sumar = 0;
		int restar =0;
		int multiplicar = 0;
		System.out.println("Ingrese el primer numero: ");
		num1 = sc.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		num2 = sc.nextInt();
		System.out.println("Elija una opcion: ");
		System.out.println("1. sumar: ");
		System.out.println("2. restar: ");
		System.out.println("3. multiplicar: ");
		opcion=sc.nextInt();
		switch(opcion) {
		case 1:
			sumar= num1+num2;
			System.out.println("La suma de "+num1 +" mas "+num2+" es: "+sumar);
			break;
		case 2:
			restar= num1-num2;
			System.out.println("La resta de "+num1 +" mas "+num2+" es: "+restar);
			break;
		case 3:
			multiplicar= num1*num2;
			System.out.println("La multiplicacion de "+num1 +" mas "+num2+" es: "+multiplicar);
			break;
		default:
			System.out.println("Opcion incorrecta.");
		}
	}
	
	//Parte 4 Analisis Numerico
	
	//ejercicio 11
	
	//Escriba un programa que lea dos números `a` y `b` y muestre:
	//- El mayor
	//- El menor
	//- La diferencia absoluta entre ambos
	
	static void mayorMenor() {
		Scanner sc = new Scanner(System.in);
		int a;
		int b; 
		System.out.println("Ingrese el primer numero: ");
		a = sc.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		b = sc.nextInt();
		double diferencia = Math.abs(a-b);//metodo para calcular el valor absoluto 
		if(a>b) {
			System.out.println("El numero mayor es: "+ a);
		}else {
			System.out.println("El numero mayor es: "+ b);
		}
		
		System.out.println("La diferencia absoluta entre "+a +" y "+b +" es: "+ diferencia);
		
	}
	
	//ejercicio 12
	
	// Escriba un programa que lea un número n 
	// y muestre su tabla de división del 1 al 10,
	// evitando división entre cero
	
	static void tablaDivision() {
		Scanner sc = new Scanner(System.in);
		int num;
		double division=0;
		System.out.println("Ingrese un numero: ");
		num =sc.nextInt();
		if (num!=0) {
			for(int i=1;i<=10;i++) {
				division= (double)num/i;//para que la operacion muestre los decimales
				System.out.println(+num +"/"+ i+" : " + division);
			}
		}else {
			System.out.println("No se puede dividir entre 0.");
		}
		
	}
	
	//ejercicio 13
	
	 //Escriba un programa que lea un número n y muestre
	 //la cantidad de dígitos pares que contiene.
	
	static void digitosPares() {
		Scanner sc = new Scanner(System.in);
		int num;
		int contador =0;
		System.out.println("Ingrese un numero: ");
		num= sc.nextInt();
		while (num != 0) {
	        int digito = num % 10;// obtiene el ultimo digito
	        if (digito % 2 == 0) {
	            contador++;
	        }
	        num = num / 10;// elimina el ultimo digito
	    }

	    System.out.println("Cantidad de digitos pares: " + contador);
	
	}
	
	//ejercicio 14
	 
	//Escriba un programa que lea un número `n` 
	//y determine si es **triangular**
	//(Existe un `k` tal que `1 + 2 + ... + k = n`).
	
	static void numerotriangular() {
		Scanner sc = new Scanner(System.in);
		int num;
		int suma=0;
		
		System.out.println("Ingrese un numero: ");
		num=sc.nextInt();
		for(int i=1;suma<num;i++) {
			suma= suma+i;
			if(suma==num) {
				System.out.println("El numero es triangular");
				return;
			}
		}
		
		System.out.println("El numero no es triangular");
		
	}
	
	//ejercicio 15
	
	//Escriba un programa que lea `n` y luego `n` números.
	//Debe mostrar el **promedio de los números negativos**.
	//Si no hay negativos, indicar: `"No hay negativos"`.
	
	static void promedionegativos() {
		Scanner sc = new Scanner(System.in);
		int n;
		int num;
		int sumanegativos=0;
		int contador=0;
		
		System.out.println("Ingrese la cantidad de numero: ");
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Ingrese un numero");
			num =sc.nextInt();
			
			if (num<0) {
				sumanegativos= sumanegativos+num;
				contador++;
				}
			}
			if (contador>0) {
				double promedio= (double)sumanegativos/contador;
				System.out.println("El Promedio de la suma de negativos es: "+ promedio);
			}else {
				System.out.println("No hay negativos:");
			}
	}
	
	//Parte 5 Patrones y Transformaciones
	
	//ejercicio 16
	//Escriba un programa que lea un número n 
	//y muestre los primeros n múltiplos de 6.
	
	static void multiplosDe6(){
	Scanner sc = new Scanner(System.in);
	int n;
	int num=0;
	System.out.println("Ingrese un numero");
	n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		num=6*i;
		System.out.println(i+" * " + n);
		System.out.println(num);
	}
	
	}
	
	//ejercicio 17
	
	//Escriba un programa que lea un número n 
	//y determine si es potencia de 2.
	
	static void potenciaDe2() {
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Ingrese un numero: ");
	n=sc.nextInt();

    while(n % 2 == 0) {
        n = n / 2;// si el mod es 0 entonces divide n entre 2 y si n = 1 entonces el numero es potencia de dos
    }

    if(n == 1) {
        System.out.println("Es potencia de 2");
    } else {
        System.out.println("No es potencia de 2");
    }
		
		
	}
	
	//ejercicio 18
	
	//Escriba un programa que lea un número `n` 
	//y muestre el **número invertido**.
	//Ejemplo:
	//`1234 → 4321`
	
	static void numeroInvertido() {
	Scanner sc = new Scanner(System.in);
	int n;
	int invertido=0;
	System.out.println("Ingrese un numero: ");
	n=sc.nextInt();
	while(n!=0) {
		int digito=n%10;//saca el ultimo digito
		invertido=invertido*10+digito;//construye el numero invertido
		n=n/10;
	}
	System.out.println("Numero invertido: "+invertido);
	}
	
	//ejercicio 19
	
	// Escriba un programa que lea un número n y determine si 
	//la suma de los números del 1 al n es par o impar.
	
	static void sumaParImpar() {
	Scanner sc = new Scanner(System.in);
	int n;
	int suma=0;
	System.out.println("Ingrese un numero: ");
	n=sc.nextInt();
	
	if(n!=0) {
		for(int i=1;i<=n;i++) {
			suma= suma+i;
		}if(suma%2==0) {
			System.out.println("La suma de los numeros es Par ");
		}else {
			System.out.println("La suma de los numeros es Impar");
		}
	}
	}
	
	//ejercicio 20
	
	//Escriba un programa que lea una temperatura 
	//en grados Celsius y la convierta a Fahrenheit.
	
	static void gradosfahrenheit() {
	Scanner sc = new Scanner(System.in);
	double grados;
	System.out.println("Ingrese los grados celsius");
	grados=sc.nextDouble();
	double fahrenheit=(double) (grados * 9 / 5) + 32;//formula para convertir a grados Fahrenheit
	System.out.println("Los grados celsius a fahrenheit son: "+ fahrenheit);
	
	}
	
// /////////////////////////////////////////////////////////////////////////////////////////
}

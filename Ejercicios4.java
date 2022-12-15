package ejercicios4;

public class Ejercicios4 {
	public static void main(String[] args) {
		
//En este ejercicio practicarás las estructuras de control, para ello deberás crear:
//Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
//Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
int numeroIf = 3;
if(numeroIf <0) {
	System.out.println("el numero es negativo");
}else{if(numeroIf >0){
		System.out.println("el numero es positivo");
	}else{
	System.out.println("el numero es cero");
	}
}

//Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
//Incrementar el valor de la variable en uno cada vez que se ejecute.
//Mostrarlo por pantalla cada vez que se ejecute.
int numeroWhile =-3;
while(numeroWhile < 3){
	numeroWhile++;
	System.out.println(numeroWhile);
}

//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
int numeroDoWhile = -3;
do {
	numeroDoWhile++;
	System.out.println(numeroDoWhile);
	
}while(numeroDoWhile < 3);


//Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.


for(int numeroFor = 0; numeroFor <=3; numeroFor++){
		System.out.println(numeroFor);
	} 

//Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
String estacion = "Verano";
switch(estacion){
	case "Verano":
		System.out.println("Verano");
		break;
	case "Invierno":
		System.out.println("Invierno");
		break;
	case "Otoño":
		System.out.println("Otoño");
		break;
	case "Primavera":
		System.out.println("Primaver");
		break;
		}
		
		

	}

}

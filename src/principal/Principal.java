package principal;

import java.util.Scanner;

import clases.Coche;
import clases.Moto;
import clases.Vehiculo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		// Voy a crear un vehiculo
		Vehiculo vehiculo;
		String matricula; 
		int caballos,numPuertas;
		boolean tieneSideCar;
		
		System.out.println("Introduce matricula");
		matricula=sc.next();
		System.out.println("Introduce caballos");
		caballos=sc.nextInt();
		vehiculo= new Vehiculo(matricula,caballos);

		System.out.println("El vehiculo introducido es" + vehiculo);
		
		// Voy a crear un coche
		//Coche coche = new Coche();
		System.out.println("Introduce matricula");
		matricula=sc.next();
		System.out.println("Introduce caballos");
		caballos=sc.nextInt();
		System.out.println("Introduce numPuertas");
		
		System.out.println("El coche introducido es" + vehiculo);
		
		// Voy a crear una moto
		System.out.println("Introduce moto");
		System.out.println("Introduce matricula");
		matricula=sc.next();
		System.out.println("Introduce caballos");
		caballos=sc.nextInt();
		System.out.println("Tiene sidecar?");
		tieneSideCar =sc.next().equalsIgnoreCase(matricula);
		System.out.println("La moto introducida es" + vehiculo);
	}

}

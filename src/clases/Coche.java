package clases;

import java.util.Scanner;

public class Coche extends Vehiculo {
	Scanner sc= new Scanner(System.in);

	private Integer numPuertas;
	//COnstructor
	public Coche(String matricula, int caballos, Integer numPuertas) {
		super(matricula, caballos);
		this.numPuertas = numPuertas;
	}

	public Integer getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(Integer numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	// setDatos
	public void setDatos() {
		super.setDatos();
		System.out.println("Introduce numPuertas:");
		numPuertas=sc.nextInt();
	}

	@Override
	public String toString() {
		return super.toString() + "Coche [numPuertas=" + numPuertas + "]";
	}
	
}

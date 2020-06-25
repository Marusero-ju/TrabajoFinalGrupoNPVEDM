package ar.edu.unju.edm;

import java.util.Scanner;


public class Alta_Baja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean band;
		band = false;

		Scanner sc =new Scanner(System.in);
		try {
			System.out.println("INGRESE nombre del paciente)");
			if(band=true){
				System.out.println("El paciente es positivo,se le da de alta");
			}else {
				System.out.println("El paciente es negativo,sera internado ");
			}			
		}catch(Exception e) {
			System.out.println("no es un paciente");
			
		}
	
	}

}

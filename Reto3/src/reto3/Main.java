package reto3;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LocalDate fecha1=Funciones.dimeFecha("dime primera fecha", sc);
		LocalDate fecha2;
		do {
			 fecha2=Funciones.dimeFecha("dime segunda fecha ", sc);
			

			
			
		} while (fecha1.isAfter(fecha2));
		 int ano1=fecha1.getYear();
		 int ano2=fecha2.getYear();
	
		 if(ano1==ano2){
			 
		 }
		 if(ano1!=ano2){
			 System.out.println(Funciones2.noSonMismoAño(fecha1, fecha2));
		 }

	}

}

package reto3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Funciones2 {
	public static int noSonMismoAño(LocalDate fecha1, LocalDate fecha2) {
		Scanner sc=new Scanner(System.in);
		int cont=0;
		int sum=0;
		LocalDate ld1 = LocalDate.of(fecha1.getYear(),fecha1.getMonthValue() ,1);
		LocalDate ld2 = LocalDate.of(fecha2.getYear(),fecha2.getMonthValue() ,1);
		int meses = (int) ChronoUnit.MONTHS.between(ld1, ld2);



		for (int i =0 ; i < meses ; i++) {
			
			sum=sum+fecha1.lengthOfMonth();
			System.out.println(sum);
			fecha1=fecha1.plusMonths(1);
			cont++;
			
			
			
		}
		int media=(sum/cont);
		return media;
	
		
	}

}

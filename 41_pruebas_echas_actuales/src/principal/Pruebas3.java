package principal;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Pruebas3 {

	public static void main(String[] args) {
	LocalDate f1=LocalDate.of(2023,11 , 4);
	LocalDate f2=LocalDate.of(2024, 3, 7);
	Period p=Period.between(f1, f2);
	System.out.println("Meses:  "+p.getMonths());
	System.out.println("Dias:  "+p.getDays());
	long dias1=ChronoUnit.DAYS.between(f1, f2);
	///////////////////////////
	LocalDate f3=LocalDate.of(2023,4 , 4);
	LocalDate f4=LocalDate.of(2024, 8, 7);
	Period p2=Period.between(f1, f2);
	//System.out.println("Meses:  "+p.getMonths());
	//System.out.println("Dias:  "+p.getDays());
	long dias2=p.get(ChronoUnit.DAYS);
	System.out.println(ChronoUnit.DAYS.between(f3, f4)); 
	

	}

}

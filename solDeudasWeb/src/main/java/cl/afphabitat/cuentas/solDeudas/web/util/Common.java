package cl.afphabitat.cuentas.solDeudas.web.util;

import java.util.Date;

public class Common {

	public static String fechaString(Date fechaIn){
		String fecha = "";
		//System.out.println("**** fechaIn) = " + fechaIn);
		//System.out.println("**** fechaIn.getDay() = " + fechaIn.getDate());
		
		if (fechaIn.getDate() < 10)
		{
			fecha += "0" + fechaIn.getDate() + "/";
		}else{
			fecha += fechaIn.getDate() + "/";
		}
		
		if (fechaIn.getMonth() < 10)
		{
			fecha += "0" + (fechaIn.getMonth()+1) + "/";
		}else{
			fecha += (fechaIn.getMonth()+1) + "/";
		}
		
		fecha += (fechaIn.getYear() + 1900);
		
		return fecha;
	}
	
	
	
	
	
	
	
	
}

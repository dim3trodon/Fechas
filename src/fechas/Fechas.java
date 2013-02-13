/* Rodrigo Valladares Santana L1 
 * Programación de Aplicaciones Interactivas Práctica 3
 * 
 * Clase que devuelve la edad de una persona dada la fecha actual y la fecha de nacimiento de la persona.
 * 
 * */
package fechas;

public class Fechas {
	
	static final int DIA = 0;
	static final int MES = 1;
	static final int AÑO = 2;
	
	Fechas(String fActual, String fNacimiento) {
		Integer edad;
		String [] separadaActual;
		String [] separadaNacimiento;
		separadaActual = fActual.split("/");
		separadaNacimiento = fNacimiento.split("/");
		
		try {
			edad = Integer.parseInt(separadaActual[AÑO]) - Integer.parseInt(separadaNacimiento[AÑO]);
			if(Integer.parseInt(separadaActual[MES]) < Integer.parseInt(separadaNacimiento[MES]) || 
				(Integer.parseInt(separadaActual[MES]) == Integer.parseInt(separadaNacimiento[MES]) &&
		    	Integer.parseInt(separadaActual[DIA]) < Integer.parseInt(separadaNacimiento[DIA])))
		    	edad--;
			System.out.println("Edad de la persona: " + edad + " años.");
		}
		catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.print("El programa debe ser llamado con la fecha actual y la fecha de nacimiento de la persona como argumentos: ");
			System.out.println("Fechas <dd/mm/aa> <dd/mm/aa>");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Fechas(args[0], args[1]);
		}
		catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.print("El programa debe ser llamado con la fecha actual y la fecha de nacimiento de la persona como argumentos: ");
			System.out.println("Fechas <dd/mm/aa> <dd/mm/aa>");
		}

	}

}

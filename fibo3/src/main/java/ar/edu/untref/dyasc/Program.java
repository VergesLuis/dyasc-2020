package ar.edu.untref.dyasc;

public class Program {
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public static void main(String[] args) {

		int n = 0;

		try {
		if(args.length == 0) {
					
			System.out.print("Ingrese un numero mayor que cero");
			System.exit(0);
		
			
		}else if (args.length == 1) {
			n = Integer.parseInt(args[0]);
			inicializarControl("","","", n);
			
		} else if (args.length == 2  ) {

			n = Integer.parseInt(args[1]);
			inicializarControl(args[0], "", "", n);
			
		} else if (args.length == 3 ) {
			
			n = Integer.parseInt(args[2]);

			inicializarControl(args[0], args[1], "", n);
			
			
		} else if (args.length == 4 ) {
			
			n = Integer.parseInt(args[3]);

			inicializarControl(args[0], args[1], args[2], n);

		} 
		} catch( Exception e ) {
			System.out.println("Opcion no valida");
			e.printStackTrace();
			}
		
	}
	
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public static void inicializarControl(String arg0, String arg1, String arg2, int n) {
		if(n <= 0) {
			System.out.print("Ingrese un numero mayor que cero");
			System.exit(0);
		}else if(n > 0) {
		new Control(arg0, arg1, arg2, n);
		}
	}
}

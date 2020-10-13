package ar.edu.untref.dyasc;


public class ProcesadorCadenaOpciones {
	
	private String cadenaASalida = "";
	private String serie= null;
	private String suma = "";
	private ArchivadorTxt archivador = null;
	private String nombreArchivo = "";
	private String cadenaOpciones = "";
	private int CantidadElemntosSerie = 0;
	private YoImprimo  impresor = null;
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public ProcesadorCadenaOpciones(String cadena, String dato, int suma, String arg1, String arg2, int cantElemSerie) {

		this.serie = dato;
		this.suma += suma;
		

		this.cadenaOpciones = cadena;
		this.CantidadElemntosSerie = cantElemSerie;

		siNecesitaNombreArchivoCrearlo(cadena, arg1, arg2);
	    verificarCadenaOpciones(cadena);
	}
	
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public void siNecesitaNombreArchivoCrearlo(String cadena, String arg1, String arg2) {
		
		if(cadena.length()>1 && cadena.substring(1, 2).equals("F")) {
		
			this.nombreArchivo = obtenerNombreArchivo(arg1 ,arg2);
			archivador = new ArchivadorTxt(this.nombreArchivo, this.suma, this.serie );
		
		}
		
	}
	
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public void verificarCadenaOpciones(String unaCadena) {

		if(unaCadena.length() == 3) {
			
			verificarCon3Opciones(unaCadena);
			
			
		}else if(unaCadena.length() == 2) {
			
			verificarCon2Opciones(unaCadena);
			
		}else if(unaCadena.length() == 1) {

			verificarCon1Opcion(unaCadena);
			
		}
		
	}	
		
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public void verificarCon3Opciones(String unaCadena) {
			
		if(unaCadena.substring(2,3).equals("S")) {
			
			this.cadenaASalida += "fibo<" + this.CantidadElemntosSerie +">s: " + this.suma;
			verificar3OpcionesPosicion1(unaCadena);
			
			
		}else if(unaCadena.substring(2,3).equals("L")) {

			this.cadenaASalida += "fibo<" + this.CantidadElemntosSerie +">: " + this.serie;
			verificar3OpcionesPosicion1(unaCadena);
		
		}	
		
	}
	
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public void verificarCon2Opciones(String unaCadena) {
		
		if(unaCadena.substring(1,2).equals("S")) {

			this.cadenaASalida += "fibo<" + this.CantidadElemntosSerie +">s: " + this.suma;
			imprimirPantalla();
			
			
		}else if(unaCadena.substring(1,2).equals("L")) {
			
			
			this.cadenaASalida += "fibo<" + this.CantidadElemntosSerie +">: " + this.serie;
			imprimirPantalla();
		
		}else if(unaCadena.substring(1,2).equals("F")) {

			this.cadenaASalida += "fibo<" + this.CantidadElemntosSerie +">: " + this.serie;
			archivar(this.nombreArchivo, this.cadenaASalida);
						
		}	
		
	}	
		

	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public void verificarCon1Opcion(String unaCadena) {

		this.cadenaASalida += "fibo<" + this.CantidadElemntosSerie +">: " + this.serie;
		imprimirPantalla();
		
	}
	
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public void imprimirPantalla() {
		
		impresor = new YoImprimo();

		if(this.cadenaOpciones.substring(0,1).equals("H")) {

			impresor.horizontal(this.cadenaASalida);
						
		}else if(cadenaOpciones.substring(0,1).equals("V")) {
			
			impresor.vertical(this.cadenaASalida);
		
		}
		
	}
	
	
	
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public void verificar3OpcionesPosicion1(String cadena) {
	
		if(cadena.substring(1,2).equals("F")) {
			archivar(this.nombreArchivo, this.cadenaASalida);

		}
		
	}
	
	
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public void archivar(String nombre, String dato) {
		
		if(this.cadenaOpciones.substring(0,1).equals("H")) {
			this.archivador.escrituraHorizontal(dato);;
			
		}else if(cadenaOpciones.substring(0,1).equals("V")){

			this.archivador.escrituraVertical(dato);
			
		}		
		
	}
	
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public String obtenerNombreArchivo(String arg1 , String arg2) {
		
		if(arg1.substring(1,2).equals("f")) {
			
			this.nombreArchivo += arg1.substring(3, arg1.length());
			
		}else if(arg2.substring(1,2).equals("f")) {
		
			this.nombreArchivo += arg2.substring(3, arg2.length());
		
		}
		
		return this.nombreArchivo;
	}	
}

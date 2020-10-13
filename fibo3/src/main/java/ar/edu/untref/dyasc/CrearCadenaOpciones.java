package ar.edu.untref.dyasc;

public class CrearCadenaOpciones{
	
	private String respuesta = "";
	
	/********************************************
	 * @autor Verge Luis
	 * Constructor
	 *@parametro: los tres primeros que recibe el main
	 *             ya separados
	 *  Crea una cadena con las opciones segùn los argumentos.
	 *  Ejemplo: "HFS", "HL", "VF", etc.            
	 * 
	 *******************************************/
	public CrearCadenaOpciones(String arg0, String arg1, String arg2) {

		verificarArg0(arg0, arg1, arg2);

	}
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public void verificarArg0(String arg0, String arg1, String arg2) {

		if(arg0.substring(3,4).equals("h")) {
			
			this.respuesta += "H";
			verificarArg1( arg1, arg2);
			
		}else if(arg0.substring(3,4).equals("v")) {
			
			this.respuesta += "V";
			verificarArg1(arg1, arg2);
		}	
	}
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public void verificarArg1( String arg1, String arg2) {

		if(arg1.equals("")){
			
		}else if(arg1.equals("-m=l")){
			
			this.respuesta += "L";
					
		}else if(arg1.equals("-m=s")) {

			this.respuesta += "S";
						
		}else if(arg1.substring(1,2).equals("f")){

			this.respuesta += "F";
			verificarArg2(arg2);
		}
	}
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public void verificarArg2(String arg2) {

		if(arg2.equals("-m=l")) {
			this.respuesta += "L";
			
		}else if(arg2.equals("-m=s")) {

			this.respuesta += "S";
		}
	}
	
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public String obtenerCadenaOpciones() {

		return this.respuesta;
	}
}

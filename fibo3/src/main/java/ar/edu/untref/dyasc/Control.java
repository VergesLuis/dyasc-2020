package ar.edu.untref.dyasc;

public class Control {

	private Fibonacci fibo=null;
	private String serieFibo="";
	private int suma= 0;
	private int elementosDeSerie = 0;
	private AcomodoCadena acomodador = null;
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
    public Control(String arg0, String arg1, String arg2, int n) {
        
    			
    	this.elementosDeSerie = n;
    	fibo = new Fibonacci();
    	
    	this.serieFibo = fibo.obtenerSubSerie(n);
    	int respuesta = verificarArg0NoVacio(arg0, n);
  	
    	if(respuesta == 1){
    	
    		acomodador = new AcomodoCadena(this.serieFibo, arg0);

    		this.suma =fibo.entregoSumaDeSerie(this.elementosDeSerie);
    	
    		this.serieFibo = acomodador.cadenaAcomoada();

    		CrearCadenaOpciones cco = new CrearCadenaOpciones(arg0, arg1, arg2);
    		String cadena = cco.obtenerCadenaOpciones();
 
    		new ProcesadorCadenaOpciones(cadena, this.serieFibo, this.suma, arg1, arg2, this.elementosDeSerie);
   	
    	}
    	
    	    	
    }
    
    
    
    
    
    public int verificarArg0NoVacio(String arg0, int n) {
    	if(arg0.equals("")) {
    		imprimir(n);
    		return 0;
    	}else if(!arg0.equals("")) {
    		return 1;
    	}
    	return 1;
    }
    
    
    
    
    
    public void imprimir(int n) {
    	System.out.println("fibo<" + n + ">: " + this.serieFibo);
    }
}

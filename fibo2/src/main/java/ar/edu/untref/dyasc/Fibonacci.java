package ar.edu.untref.dyasc;

/*****************************
*@autor: Verges Luis
*
*
******************************/
public class Fibonacci {

    public static void main(String[] args) {
    	
    
    	if(args.length < 1 || (args.length == 1 && Integer.parseInt(args[0])<=0)) {
    		System.out.println("Debe ingresar un numero mayor a cero!!");
    	}else
    		if(args.length == 1){
    			SerieFibo serie = new SerieFibo();
    			String cadena = serie.getSubserie(Integer.parseInt(args[0]));
        		System.out.println(cadena);
    	}else
    		if(args.length == 2) {
    				
    			VertOHor deter = new VertOHor();
    			deter.determinarOpcion(args[0], Integer.parseInt(args[1]));
        	
        }
    
    }

}

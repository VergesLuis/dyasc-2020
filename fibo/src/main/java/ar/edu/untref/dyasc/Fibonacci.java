package ar.edu.untref.dyasc;

public class Fibonacci {

    public static void main(String[] args) {
    
    	if(args.length < 1 || Integer.parseInt(args[0])==0) {
    		System.out.println("Debe ingresar un numero mayor a cero!!");
    	}
        if(args.length >= 1){
        	SerieFibo serie = new SerieFibo();
        	String cadena = serie.getSubserie(Integer.parseInt(args[0]));
        	System.out.println(cadena);
        }
    
    }

}

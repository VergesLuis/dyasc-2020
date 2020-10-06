package ar.edu.untref.dyasc;

public class SerieFibo {

    public String getSubserie(int cant) {
    	String cadena="";
    	int temp=0;
    	int anteultimo=0;
    	int ultimo=1;
    	if(cant == 1) {
    		cadena = cadena + "0";
    	}else
    	    if(cant == 2) {
    		cadena = cadena +"0, 1";
    	    }else  
    	    	if(cant >= 3) {
    	    		cadena = cadena + "0, 1";
    	    		for(int i = 3; i <= cant; i++) {
    	    			temp = ultimo;
    	    			ultimo = anteultimo + ultimo;
    	    			anteultimo = temp;
    	    			cadena = cadena + ", " + ultimo;
    	    			
    	    		}
    	    	}
        return cadena;
    }

}

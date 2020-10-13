package ar.edu.untref.dyasc;

public class YoImprimo {
	
	String subSerie="";
    
	public String imprimirFibo(String cadena) {
    	
    	System.out.println(cadena);
    	
    	return cadena;
    }
    	
    	
    	
    	
     
     public void horizontal(String cadena) {

    	 System.out.println(cadena);

     }

 
     
     
     public void vertical(String cadena) {
     	
    	 String[] temp=cadena.split(" ");

     	for (int i = 0; i < (temp.length); i++) {
     		 System.out.println(temp[i]+" ");
        }
     		
      	
     }

        
}

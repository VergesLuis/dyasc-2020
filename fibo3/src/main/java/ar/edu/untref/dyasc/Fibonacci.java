package ar.edu.untref.dyasc;

public class Fibonacci {
	private String subSerie = "";
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public int entregoSumaDeSerie(int n) {
		
		int suma=0;
		if(this.subSerie.equals("")) {
			this.subSerie = obtenerSubSerie(n);
		}
		

		String[] temp= this.subSerie.split(" ");

		for(int i = 0; i < temp.length; i++) {
			suma += Integer.parseInt(temp[i]);
			
		}
		return suma;
	}
	
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public String obtenerSubSerie(int n) {

		for (int i = 0; i < n; i++) {
     		subSerie = subSerie + fibonacci(i) + " ";

		}

		return subSerie;
	}
	
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public int fibonacci(int n) {
	    if (n == 0) {
	    	return 0;
	    } else if (n == 1) {
	    	return 1;
	    } else {
	    	return fibonacci(n - 1) + fibonacci(n - 2);
	    }

	}
		
}

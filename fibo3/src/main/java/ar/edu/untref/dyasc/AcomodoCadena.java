package ar.edu.untref.dyasc;

public class AcomodoCadena {
		
		private String cadenaAcomodada="";
	
		public AcomodoCadena(String cadena, String tipoOrden) {
			
			if(tipoOrden.substring(4,5).equals("i")) {
				
				invertirCadena(cadena);
				
			}else if(tipoOrden.substring(4,5).equals("d")) {
				
				this.cadenaAcomodada += cadena;
			}
		}

		
		
		
		
		public String invertirCadena(String unaCadena) {

			String[] cad = unaCadena.split(" ");

			for(int i = cad.length-1; i >= 0; i--) {
				this.cadenaAcomodada += cad[i] + " ";
			}
			

			return this.cadenaAcomodada;
		}
		
		
		
		
		public String cadenaAcomoada() {
			
			return this.cadenaAcomodada;
			
		}
}

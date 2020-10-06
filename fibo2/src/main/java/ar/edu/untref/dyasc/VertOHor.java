package ar.edu.untref.dyasc;

public class VertOHor {
	private String cadena="";
	String[] subCadena2 = new String[this.cadena.length()];
	
	
	public String[] determinarOpcion(String det, int cant) {
		this.cadena = obtenerCadena(cant);
	
		if(!("-o=hd".equals(det)) && !("-o=hi".equals(det)) && !("-o=vd".equals(det)) && !("-o=vi".equals(det))) {
			System.out.println("Opcion no valida !!");
		}else
			if("-o=hd".equals(det)) {
				subCadena2 = this.cadena.split(" ");
				imprimirHor();
				//System.out.println(this.cadena);
		}else
			if("-o=hi".equals(det)) {
				subCadena2 = invertir();
				imprimirHor();
		}else
			if("-o=vd".equals(det)) {

				subCadena2 = this.cadena.split(" ");
				imprimirVert();
				
		}else
			if("-o=vi".equals(det)) {

				 subCadena2 = invertir();
				 imprimirVert();
			}
		return subCadena2;
	}
	
	private String[] invertir() {
		String[] subCadena = this.cadena.split(" ");
		String[] subCadena2 = new String[subCadena.length]; 
		int ultimo=0;
		for(int i=subCadena.length-1; i>=0; i--) {
		
				subCadena2[ultimo] = subCadena[i];
			ultimo++;
		}
		
		return subCadena2;
	}
	
	private String obtenerCadena(int cantidad) {
		SerieFibo serie = new SerieFibo();
        String subSerie = serie.getSubserie((cantidad));
        return subSerie;
	} 

	private void imprimirHor() {
		for(int i = 0; i < this.subCadena2.length; i++) {
			System.out.print(subCadena2[i]+" ");
		}
		System.out.println();
	}
	
	private void imprimirVert() {
		for(int i = 0; i < this.subCadena2.length; i++) {
			System.out.println(this.subCadena2[i]);
		}
		
	}
}

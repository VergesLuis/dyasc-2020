package ar.edu.untref.dyasc;

import java.io.*;

public class ArchivadorTxt {
	
	private File myFile = null;
	private FileWriter writer = null;
	private PrintWriter pw= null;
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public ArchivadorTxt(String filename, String serie, String suma) {

	    try{
		this.myFile = new File(filename);
	    this.writer = new FileWriter(this.myFile);
		this.pw = new PrintWriter(this.writer);
		
		} catch(Exception e ) {
			System.out.println("Error en creacion de Archivo");
			e.printStackTrace();
		}
	}	

	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public void escrituraHorizontal(String dato) {

		try {
		this.pw.println(dato);

		this.pw.flush();
		this.pw.close();
		} catch (Exception e) {
			System.out.println("Error de Escritura") ;
			e.printStackTrace();
		}
		
	}
	
	
	
	
	/********************************************
	 * @autor Verge Luis
	 * 
	 *@parametros: 
	 *              
	 * 
	 *******************************************/
	public void escrituraVertical( String dato) {
		
		String[] temp = dato.split(" ");
		try {
		this.pw.println(temp[0]);
		for(int i=1; i < temp.length; i++) {

			this.pw.println(temp[i]);
		}
		this.pw.flush();
		this.pw.close();
		
		} catch (Exception e) {
			System.out.println("Error de Escritura") ;
			e.printStackTrace();
		}
		
	}
}

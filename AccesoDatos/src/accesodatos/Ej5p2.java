package accesodatos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;

public class Ej5p2 {

	public static void main(String[] args) {
		/*3)Añade un número a cada letra (a1, b2, c3, d4, e5) y realiza la misma operación anterior. Debe quedar e5 d4 c3 b2 a1.*/
		
		String letras = "";
		String algo = "";
		int pos =0;
		try {
			RandomAccessFile fichero = new RandomAccessFile("ficheroC.txt","rw");
			RandomAccessFile otro = new RandomAccessFile("ficheroD.txt","rw");
			
			for(int i=(int) fichero.length();i<=0;i--) {
				fichero.seek(i);
				algo = fichero.readLine();
				letras = letras + algo + "\n";
			}
			//System.out.println(letras);
		
			/*
			for(int i=letras.length()-1;i>=0;i--) {
				
				System.out.print(letras.charAt(i));
		
				otro.writeChar(letras.charAt(i));
			}
		*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

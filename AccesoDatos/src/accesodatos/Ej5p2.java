package accesodatos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ej5p2 {

	public static void main(String[] args) {
		/*3)Añade un número a cada letra (a1, b2, c3, d4, e5) y realiza la misma operación anterior. Debe quedar e5 d4 c3 b2 a1.*/
		
		String letras = "";
		String algo = "";
		
		try {
		
			RandomAccessFile fichero = new RandomAccessFile("ficheroC.txt","rw");
			RandomAccessFile otro = new RandomAccessFile("ficheroD.txt","rw");
			
			for(int i=0;i<fichero.length();i++) {
				fichero.seek(i);
				algo = fichero.readLine();
				System.out.println(algo);
				letras = letras + algo;
			}
			
			for(int i=letras.length()-1;i>=0;i--) {
				otro.writeChars(i+"\n");
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

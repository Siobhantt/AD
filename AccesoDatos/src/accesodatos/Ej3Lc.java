package accesodatos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;

public class Ej3Lc {

	public static void main(String[] args) {
		/*3)Añade un número a cada letra (a1, b2, c3, d4, e5) y realiza la misma operación anterior. Debe quedar e5 d4 c3 b2 a1.*/
		String letras = "";
		int cont = 5;

		try {
			RandomAccessFile fichero = new RandomAccessFile("ficheroD.txt","rw");
			RandomAccessFile otrof = new RandomAccessFile("ficheroE.txt","rw");
			
			for(int i=0;i<=fichero.length();i++) {
				fichero.seek(i);
				letras = fichero.readLine();
				if(letras!="" && letras!=null) {
					System.out.println(letras);
					otrof.writeBytes(letras+cont+"\n");
					cont--;
				}
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

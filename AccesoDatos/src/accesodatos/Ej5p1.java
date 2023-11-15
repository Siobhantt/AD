package accesodatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ej5p1 {

	
	/*2)Aumenta el documento de lectura hasta la letra "e" en líneas diferentes (a, b, c, d, e) y crea un método que las escriba en otro de forma inversa. 
	 * Sin usar ARRAYS ni BUFFER.
3)Añade un número a cada letra (a1, b2, c3, d4, e5) y realiza la misma operación anterior. Debe quedar e5 d4 c3 b2 a1.*/
	
	public static void main(String[] args) {
		
		String letras = "abcde";
		String algo = "";
		
		
		try {
		
			RandomAccessFile fichero = new RandomAccessFile("ficheroC.txt","rw");
			RandomAccessFile otro = new RandomAccessFile("ficheroD.txt","rw");
			
			for(int i=0;i<fichero.length();i++) {
				fichero.seek(i);
				algo = fichero.readLine();
				System.out.println(algo);
			}
			
			for(int i=(int)otro.length();i>0;i--) {
				otro.seek(i);
				otro.write(algo.charAt(i));
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void inverso(RandomAccessFile fichero) {
		String ave = "";
		try {
			ave = fichero.readLine();
			System.out.println(ave);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

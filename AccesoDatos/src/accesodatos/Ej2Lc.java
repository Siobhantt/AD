package accesodatos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ej2Lc {
	/*2)Aumenta el documento de lectura hasta la letra "e" en líneas diferentes (a, b, c, d, e) y crea un método que las escriba en otro de forma inversa. 
	 * Sin usar ARRAYS ni BUFFER.
*/
	public static void main(String[] args) {
		
		String letras = "";
		String algo = "";
		//Variable auxiliar para usar el bucle en dos direcciones
		try {
			RandomAccessFile fichero = new RandomAccessFile("ficheroC.txt","r");
			RandomAccessFile fichero2 = new RandomAccessFile("ficheroD.txt","rw");
			//Recorro el fichero desde el final
			for(int i= (int) fichero.length()-1;i>=0;i=i-3) {
				fichero.seek(i);
				algo = fichero.readLine();
				fichero2.writeBytes(algo+"\n");
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

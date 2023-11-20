package accesodatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ej5p1 {

	
	/*2)Aumenta el documento de lectura hasta la letra "e" en líneas diferentes (a, b, c, d, e) y crea un método que las escriba en otro de forma inversa. 
	 * Sin usar ARRAYS ni BUFFER.
*/
	
	public static void main(String[] args) {
		
		String letras = "";
		String algo = "";
		//Variable auxiliar para usar el bucle en dos direcciones
		int posicion = 0;
		try {
		
			RandomAccessFile fichero = new RandomAccessFile("ficheroC.txt","r");
			RandomAccessFile fichero2 = new RandomAccessFile("ficheroD.txt","rw");
			//Recorro el fichero desde el final
			for(int i= (int) fichero.length()-1;i>=0;i--) {
				//ubico el puntero al final
				fichero2.seek(0);
				fichero.seek(i);
				//guardo lo que sea que se lea en la varibale algo
				//Como hay posiciones que devuelven null y no se por que
				algo = fichero.readLine();
				//en caso de que sea distinto a nul
				if(algo!=null && algo!="") {
					//Imprimo algo para ver que si guarda la letras
					//System.out.println(algo);
					//A la variable letra le concateno lo que este leyendo
					letras = letras + algo+"\n";
					//pongo el puntero en el principio del otro fichero
					fichero2.seek(posicion);
					//Escribo lo que sea que este en letra
					fichero2.writeUTF(letras);
					//avanzo en el segundo fichero
					posicion++;
				}
				//fichero2.writeChars(letras.charAt(posicion)+"\n");	
				
			}
			
		/*	
			for(int i=0;i<fichero.length();i++) {
				fichero.seek(i);
				algo = fichero.readLine();
				System.out.println(algo);
				letras = letras + algo;
			}
			
			for(int i=letras.length()-1;i>=0;i--) {
				fichero.seek(i);
				algo =fichero.readLine();
				System.out.println(algo);
				letras = letras + algo;
				
			}*/
		
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

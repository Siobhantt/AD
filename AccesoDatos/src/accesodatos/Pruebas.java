package accesodatos;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Pruebas {

	public static void main(String[] args) {
		try {
			RandomAccessFile fichero = new RandomAccessFile("ficheroC.txt","rw");
			Ej5p1.inverso(fichero);
		}catch(IOException e){
			
		}
		
		
		
		

	}

}

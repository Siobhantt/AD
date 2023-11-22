package accesodatos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ej1LuisaC {

	/*
	 * 1)Crea un documento de texto con una única letra "a" que será leído de forma
	 * aleatoria (seek) y escrito 5 veces en otro documento también de forma
	 * aleatoria (seek).
	 */

	public static void main(String[] args) {

		// String donde = "C:\\Users\\lcardozo\\git\\repository\\AccesoDatos";

		// File ficheroA = new File(donde,"FicheroAleatorio.txt");
		String letra = "";

		try {
			// abro el fichero en rw(significa read and wirte)
			RandomAccessFile ficheroA = new RandomAccessFile("ficheroA.txt", "r");
			// Ubico en la posicion 0 que es donde esta la letra a
			ficheroA.seek(0);
			// Leo el fhicero y lo que encuentre lo guardo en la variable letra
			letra = ficheroA.readLine();
			// Lo cierro
			ficheroA.close();

			RandomAccessFile ficheroB = new RandomAccessFile("ficheroB.txt", "rw");

			for (int i = 0; i < 5; i++) {
				ficheroB.writeChars(letra);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Pa ver que funciona
		System.out.println(letra);

		// try {
		// BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroA));
		// bw.write("a");
		// bw.close();
		// } catch (IOException e) {
		// TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}// fin del main

}

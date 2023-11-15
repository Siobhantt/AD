package accesodatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Ej4LuisaC {

	
	public static void main(String[] args) throws IOException {
	//Variable para guardar la letra
	String donde = "C:\\Users\\lcardozo\\git\\repository\\AccesoDatos";
	char letra=' ';
	String[] palabras;
	//El archivo que se quiere leer
	File archivo = new File("palabras.txt");
	//Donde se va a guardar la palabra de 5 letras
	String palabra="";
	//El contador de las letras
	int contador=0;
	//La linea completa que se lee del fichero
	String linea = "";

	File newArchivo = new File(donde,"nuevoFichero.txt");
	
	File nuevoFichero = new File(donde,"palabrasOrdenadas.txt");
	
	BufferedWriter bw = new BufferedWriter(new FileWriter(nuevoFichero));
	
	//EL buffered reader para leer el archivo
	try (BufferedReader br = new BufferedReader(new FileReader(archivo)))
	{
		//Mientras ya no haya que leer
		while((linea = br.readLine())!= null){
			//Recorremos la linea
			for(int i=0;i<linea.length();i++) {
				//de la linea sacamos la letra
				letra = linea.charAt(i);
				//la pasamos a string para concatenarla
				String l = String.valueOf(letra);
				//Concatenamos la letra a la palabra
				palabra= palabra+l;;
				//aumentamos el contador en cada vuelta para que cuando llegue a 5 inserte un salto de linea
			contador++;
			//cuando el contador llegue a 5
			if(contador==5) {
				//Se inserta un salto de linea 
				palabra+="\n";
			//y se reinicia el contador a 0
				contador=0;
			} 
			}
		}
		//System.out.println(palabra);
		//Con el buffered writer escribimos todo lo que se ha guardado en palabra
	//bw.write(palabra);
	//Cerramos el buffered writer
		
		//==================ESTA ES LA PARTE DEL EJERCICIO 4=========================
	
		//Hacemos un split de la palabra que escribimos en el fichero, cortamos por los saltos de linea
	palabras = palabra.split("\n");
	//Ordenamos las palabras
	Arrays.sort(palabras);
	
	//System.out.println(Arrays.toString(palabras));
	//En caso de que no exita el fichero lo creamos
	if(!nuevoFichero.exists()) {
		nuevoFichero.createNewFile();
	}
	//Recorremos el array y en cada iteracion, que equivale en este caso a una palabra
	//Escribimos la palabra en el fichero junto con un \n para que muestre cada palabra en una linea
	for (int i=0;i<palabras.length;i++) {
		bw.write(palabras[i]+"\n");
	}
	//Cerramos el escritor
	bw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
		

	}

}

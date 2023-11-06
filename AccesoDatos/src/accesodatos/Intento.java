package accesodatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Intento {

	public static void main(String[] args) {
		//mi nombre xd
		String luisa = "Luisa Alejandra Cardozo Mendoza";
		//la pagina que se va a crear en las carpetas
		File pagina = new File("index.html");
		//La ruta donde quiero que se cree
		String donde = "C:\\Users\\lcardozo\\";
		//El fichero de donde se van a sacar las rutas
		File fichero = new File("fichero.txt");
		///////////////////////////////////////////TRY////////////////////////////////////
	try {
		//Creamos el scanner 
		Scanner lee = new Scanner(fichero);
		//Mientras hayan lineas que leer
		while(lee.hasNextLine()) {
			//Guardamos la linea que contiene el nombre de las carpetas que vamos a crear
			String nombreCarpeta = lee.nextLine();
			//El boolean que nos avisara si se creo el directorio o no
			//Es una variable que crea un directorio con el nombre de la carpeta(donde, nombre) mkdir para crearlo
			boolean creaDirectorio = (new File(donde+nombreCarpeta)).mkdir();
			//En caso de que lo cree correctamente lanza un mensaje
			if(creaDirectorio) {
				System.out.println("Directorio: " + donde + " creado.");
			}
			//LA imprimimos y pasamos a la siguiente
			System.out.println(nombreCarpeta);
			//Despues de crear los directorios vamos a crear las paginas web
			
			try {
				//Otro boolean para que avise si lo ha creado
				//es una variable que crea un archivo, en la ruta deseada, con la carpeta creada mas arriba y creando el archivo, que tiene el nombre asignado en la variable pagina(index.html)
				boolean creaArchivo = (new File(donde+nombreCarpeta+"\\"+pagina)).createNewFile();
				//En caso de que lo cree, da un aviso
				if(creaArchivo) {
					System.out.println("Pagina creada: " + donde + " creado.");
				}
				//Ahora vamos a llenar el archivo html con lo que nos pide el ejercicio
				String contpagina = "<html>\r\n"
						+ "   <head>\r\n"
						+ "      <title> ["+nombreCarpeta+"] </title>\r\n"
						+ "   </head>\r\n"
						+ "   <body>\r\n"
						+ "      <h1>["+donde+nombreCarpeta+"]</h1>\r\n"
						+ "      <h3>Autor: ["+luisa+"]</h3>\r\n"
						+ "   </body>\r\n"
						+ "</html>";
				//Creamos el escritor, que escribirá en la ruta que le asignamos por parametro, el segundo parametro true es para que escriba al final y no al principio
				FileWriter fwr = new FileWriter(donde+nombreCarpeta+"\\"+pagina,true);
				//Escribimos lo que guarda la variable contpagina
				fwr.write(contpagina); 
				//Cerramos el escritor
				fwr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		//En caso de que no encuentre el fichero que muestre un error
	lee.close();
	}
	catch (FileNotFoundException e){
		 System.out.println("No se ha encontrado el fichero");
	      
	}	
}//fin del main
}

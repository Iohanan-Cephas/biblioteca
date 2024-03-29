package application;

import java.io.File;

public class Program {
	public static void main(String[] args) {
		String directoryPath = "D:\\library";
		File directory = new File(directoryPath);
		
		if(directory.exists() && directory.isDirectory()) {
			File[] files = directory.listFiles();
			
			if(files != null) {
				for(File f : files) {
					if(f.isFile() && f.getName().toLowerCase().endsWith(".pdf")) {
						System.out.println("Arquivo PDF encontrado: " + f.getName());
					}
				}
			}
		} else {
			System.out.println("O diretório especificado não existe ou é inválido!");
		}
	}
}

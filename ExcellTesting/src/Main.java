import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Main {
	public static void main(String[] args) throws BiffException, IOException {
		Workbook workbook = Workbook.getWorkbook(new File("teste.xls"));
		Sheet sheet = workbook.getSheet(0);
		int linhas = sheet.getRows();
		
		System.out.println("Iniciando a leitura do arquivo XLS");
		for (int i = 0; i < linhas; i++) {
			Cell a1 = sheet.getCell(0, i);
			Cell a2 = sheet.getCell(1, i);
			Cell a3 = sheet.getCell(2, i);
			
			String s1 = a1.getContents();
			String s2 = a2.getContents();
			String s3 = a3.getContents();
			
			System.out.println("Coluna 1: " + s1);
			System.out.println("Coluna 2: " + s2);
			System.out.println("Coluna 3: " + s3);
			
		}
		
		workbook.close();
	}
}

package week7.marathon3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static String[][] Edata(String filename) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("src/main/java/week7/marathon3/"+filename+".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int rowN = sheet.getLastRowNum();
		short ColumnN = sheet.getRow(0).getLastCellNum();
		String [][] data =new String[rowN][ColumnN];
		for (int i = 1; i <= rowN; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < ColumnN; j++) {
				XSSFCell cell = row.getCell(j);
				data[i-1][j]=cell.getStringCellValue();
			}
		}
		return data;
	}

}

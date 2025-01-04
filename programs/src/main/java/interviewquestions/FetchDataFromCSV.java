package interviewquestions;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchDataFromCSV {

	public static void main(String[] args) throws Throwable {

		File f=new File("C:\\Software\\Aruna_JAVA\\programs\\Resources");

		FileInputStream fis=new FileInputStream(f);

XSSFWorkbook workbook=new XSSFWorkbook(fis);

XSSFSheet sh=workbook.getSheet("Aruna");

java.lang.String celldata=sh.getRow(0).getCell(0).getStringCellValue();






	}

}

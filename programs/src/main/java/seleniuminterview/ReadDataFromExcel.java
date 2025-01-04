package seleniuminterview;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;


public class ReadDataFromExcel {

	public static String main(String[] args) throws Exception {
		File f=new File("C:\\Software\\Aruna_JAVA\\programs\\Resources\\aruna.xlsx");

		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook book=new XSSFWorkbook(fis);
		
		XSSFSheet shhet=book.getSheet("aruna");
		
		//get static data
		String CellValue=shhet.getRow(1).getCell(2).getStringCellValue();
		System.out.println(CellValue);
		
		
		//get dynamic data
		
		int rowcount=shhet.getPhysicalNumberOfRows();
		
		for(int i=0;i<rowcount;i++) {
			XSSFRow row=shhet.getRow(i);
			
			int Cellcount=row.getPhysicalNumberOfCells();
			for(int j=0;j<Cellcount;j++) {
				XSSFCell cell=row.getCell(j);
				//String cellValue = getCellValue(cell);//calling method
				//System.out.print("||"+cellValue);//print the table in console
			}
		}
		return CellValue;
		
		
//		String getCellValue(Cell cell) {//identify the type of cell and convert the data and return in form of string
//			switch (((XSSFCell) cell).getCellType()) {
//			case NUMERIC:
//				return String.valueOf(((XSSFCell) cell).getNumericCellValue());
//			case BOOLEAN:
//				return String.valueOf(((XSSFCell) cell).getBooleanCellValue());
//			case STRING:
//				return ((XSSFCell) cell).getStringCellValue();
//			case BLANK:
//				return "";
//			default:
//				return cell.getStringCellValue();
//			}
//		}
		
		
	}

}

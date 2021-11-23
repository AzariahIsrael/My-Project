package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Row_Data {

	public static void main(String[]args) throws Throwable {
		
		Row_Data();
		
		
			
	}

	public static void Row_Data() throws Throwable {

		System.out.println("Row Data");
		
	File f = new File("C:\\Users\\Azar\\eclipse-workspace\\RunnerClass\\Book1.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook Wb = new XSSFWorkbook(fis);
	Sheet s = Wb.getSheetAt(0);
	Row r = s.getRow(5);
	int numberOfCells = r.getPhysicalNumberOfCells();
	
	for(int i = 0; i < numberOfCells; i++) {
	Cell c = r.getCell(i);
	Enum<org.apache.poi.ss.usermodel.CellType> CT = c.getCellType();
	 
	if (CT.equals(org.apache.poi.ss.usermodel.CellType.STRING)) {
	String value = c.getStringCellValue();		
			System.out.println(value);
	}
	else if (CT.equals(org.apache.poi.ss.usermodel.CellType.NUMERIC)) {
		double numericvalue = c.getNumericCellValue();
		int value = (int) numericvalue;
		System.out.println(value);
	}
	
	}
	
	}
}

	
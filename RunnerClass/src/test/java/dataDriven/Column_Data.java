package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Column_Data {

	public static void main(String[]args) throws Throwable {
		
		Column_Data();
	}

	public static void Column_Data() throws Throwable {
	
		System.out.println("*****Column Data*****");
		
	File f = new File("C:\\Users\\Azar\\eclipse-workspace\\RunnerClass\\Book1.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook Wb = new XSSFWorkbook(fis);
	Sheet s = Wb.getSheetAt(0);
	int numberOfRows = s.getPhysicalNumberOfRows();
	
	for (int i=0; i < numberOfRows; i++) {
		Row row = s.getRow(i);
	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
	Cell c = row.getCell(1);
	CellType CT = c.getCellType();
	
	if(CT.equals(CellType.STRING)) {
		String value = c.getStringCellValue();
		System.out.println(value);
	}
	
	else if(CT.equals(CellType.NUMERIC)) {
		double numericvalue = c.getNumericCellValue();
		int value = (int) numericvalue;
		System.out.println(value);
		
		
	}
	}
	
			
	
		
	}
}

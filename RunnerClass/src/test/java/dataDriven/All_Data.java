package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class All_Data {
	
	public static void alldata() throws Throwable {
		
		File f = new File("C:\\Users\\Azar\\eclipse-workspace\\RunnerClass\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		System.out.println("All Data");
		
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int NumberOfCells = row.getPhysicalNumberOfCells();
			
			
		for (int j = 0; j < NumberOfCells; j++) {
			org.apache.poi.ss.usermodel.Cell cell = row.getCell(j);
			Enum<org.apache.poi.ss.usermodel.CellType> cellType = cell.getCellType();
			
			if (cellType.equals(org.apache.poi.ss.usermodel.CellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
				
			}
		
			else if (cellType.equals(org.apache.poi.ss.usermodel.CellType.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();
				int value = (int) cellValue;
						
				
			}
			
		}
					
		}
		
		
		
		
		
		
	}

}

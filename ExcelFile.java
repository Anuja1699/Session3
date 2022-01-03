package Persistent.Session.ExcelSheetRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
public static void main(String[] args) throws IOException {
	File fileRef = new File("E:\\Products.xlsx");
	if (!fileRef.exists())
	{
	  System.out.println("file does not exists");
	  throw new FileNotFoundException("file does not exists");
	}
	
	FileInputStream fl = new FileInputStream(fileRef);
	Workbook wb = new  XSSFWorkbook(fl);
	Sheet sh = wb.getSheetAt(0);
	int i=0;
	Iterator<Row> rows = sh.iterator();
	List<Product> productTest = new ArrayList<>();
	
	while(rows.hasNext())
	{
		if(i==0)
		{
			rows.next();
		}
		else
		{
			Row currentRow = rows.next();
			Product p = new Product(currentRow.getCell(0).getStringCellValue(),
					currentRow.getCell(1).getStringCellValue(),
					currentRow.getCell(2).getStringCellValue(),
					currentRow.getCell(3).getNumericCellValue(),
					currentRow.getCell(4).getStringCellValue());
		 productTest.add(p);	
		}
		i++;
	}
	
	System.out.println(productTest);
	fl.close();
}
}

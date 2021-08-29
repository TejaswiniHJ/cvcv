package datadrivenexcel;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readmultidata {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
	FileInputStream fis=new FileInputStream("./Excel/Datadriver.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	int Rowcount=sh.getLastRowNum()-sh.getFirstRowNum();
	for(int i=0; i<Rowcount+1; i++)
	{
		Row r=sh.getRow(i);
		for(int j=0; j<r.getLastCellNum(); j++)
		{
			System.out.print(r.getCell(j).getStringCellValue() + " ");
		}
	System.out.println();
		
	}

}
}



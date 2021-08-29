package datadrivenexcel;


	import java.io.FileInputStream;
    import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	public class Datadri {
		public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
			
			FileInputStream fis=new FileInputStream("./Excel/Datadriver.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet("Sheet1");
			Row r=sh.getRow(0);
			Cell c=r.getCell(10);
			String value = c.getStringCellValue();
			System.out.println(value);
			
}
	}



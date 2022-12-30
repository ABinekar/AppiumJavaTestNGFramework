package Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public static String getCellValue(int r, int c)

	{

		try

		{
			String xl1 = System.getProperty("user.dir") + "\\src\\main\\java\\testData\\testData.xlsx";

			FileInputStream fis = new FileInputStream(xl1);

			Workbook wb = WorkbookFactory.create(fis);

			Cell cell = wb.getSheetAt(0).getRow(r).getCell(c);

			return cell.getStringCellValue();

		}

		catch (Exception e)

		{

			return "";

		}
	}
}
package pompages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestEbayData
{
public static Object[][] getExcelData(String path) throws Exception
{
	Object[][] myData=null;

	XSSFWorkbook wb=new XSSFWorkbook(path);
	XSSFSheet ws=wb.getSheet("Sheet1");
	int rows=ws.getPhysicalNumberOfRows();

	myData=new Object[rows][2];

	for(int i=0;i<rows;i++)
	{
		myData[i][0]=ws.getRow(i).getCell(0).getStringCellValue();
		myData[i][1]=ws.getRow(i).getCell(1).getStringCellValue();
	}
	
	return myData;
}
}
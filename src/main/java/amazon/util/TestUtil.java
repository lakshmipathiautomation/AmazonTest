package amazon.util;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import amazon.base.TestBase;

public class TestUtil extends TestBase {
 
	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long  IMPLICIT_WAIT_TIMEOUT =40;
	static Workbook book;
	static Sheet sheet;
	public void switchToFrame(){
		driver.switchTo().frame("Please Enter Frame Name");
	}
//	public static Object[][] getTestData(String sheetName){
//		FileInputStream file=null;
//		try{
//			file=new FileInputStream(TESTDATA_SHEET_PATH);
//		}catch(FileNotFoundException e){
//			e.printStackTrace();
//		}catch(IOException e){
//			e.printStackTrace();
//		}
//		sheet = book.getSheet(sheetName);
//		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getCellNum()];
//		for(int i=0;i<sheet.getLastRowNum();i++){
//			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++){
//				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
//				
//			}
//		}
//		return data;

//public static void takeScreenshotAtEndOfTest() throws IOException{
//	File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	String CurrentDir =System.getProperty("user.dir");
//    FileUtils.copyFile(srcFile, new File(CurrentDir+"/screenshots/"+System.currentTimeMillis()+".png"));
//}
}

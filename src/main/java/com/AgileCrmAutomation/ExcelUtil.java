package com.AgileCrmAutomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
    private String getFileExtention(String filePath) {
    	String extention=filePath.substring(filePath.indexOf("."));
    	System.out.println(extention);
    	return extention;
    }
    private Workbook getWorkbookInstance(String filePath) throws IOException {
    	Workbook wb;
    	FileInputStream input=new FileInputStream(filePath);
    	if(getFileExtention(filePath).equals(".xlsx")) {
    		wb=new XSSFWorkbook(input);
    	}else {
    		wb=new HSSFWorkbook(input);
    	}
    	return wb;
    }
    private Sheet getSheet(String filePath , String sheetName) throws IOException {
    	Sheet sheet=null;
    	Workbook wb= getWorkbookInstance(filePath);
    	sheet=wb.getSheet(sheetName);
    	return sheet;
    }
    public Object [][] getExcelData(String filePath, String sheetName) throws IOException{
    	Sheet sheet=getSheet(filePath,sheetName);
    	int totalRow=sheet.getPhysicalNumberOfRows();
    	int totalColumn=sheet.getRow(0).getPhysicalNumberOfCells();
    	return getCellValue(sheet,totalRow,totalColumn);
    }
    public Object[][] getCellValue(Sheet sheet , int totalRows, int totalColumns){
    	Object[][] value=new Object[totalRows][totalColumns];
    	for(int i=1;i<totalRows;i++) {
    		Row row=sheet.getRow(i);
    		for(int j=0;j<totalColumns;j++) {
    			Cell cell =row.getCell(j);
    			CellType type=cell.getCellType();
    			switch(type) {
    			case STRING:
    				 value[i][j]=cell.getStringCellValue();
    				 break;
    			case NUMERIC:
    				value[i][j]=cell.getNumericCellValue();
    				break;
    			case BOOLEAN:
    				value[i][j]=cell.getBooleanCellValue();
    				break;
    			case _NONE:
    				value[i][j]=null;
    				break;
    			case BLANK:
    				value[i][j]= null;
    				break;
    				default:
    					value [i][j]= null;
    					
    			}
    		}
    	}
    	return value;
    }
	public static void main(String[] args) throws IOException {
		String filePath="E:\\R K\\CST 47\\AutomationTestData.xlsx";
		ExcelUtil excelvalue=new ExcelUtil();
		 Object[][] data=excelvalue.getExcelData(filePath,"LoginTestData");
		 
		 int rowLength=data.length;
		 int columnLength=data[0].length;
		 
		   for(int i=1;i<=rowLength-1;i++) {
			   for(int j=0;j<columnLength;j++) {
				   System.out.print(data[i][j]+"  ");
			   }
			   System.out.println();
		   }
		 
	
		

	}

}

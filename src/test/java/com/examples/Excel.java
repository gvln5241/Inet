package com.examples;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("D:\\Learn\\1Java\\inet\\sample_File.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
       
        XSSFSheet worksheet = workbook.getSheet("sheet1");
       
        int rowCount = worksheet.getLastRowNum(); //returns the row count
        int colCount = worksheet.getRow(0).getLastCellNum();
       
        for(int i=0;i<rowCount;i++)
        {
            XSSFRow currentrow = worksheet.getRow(i);
           
            for(int j=0;j<colCount;j++)
            {
                String value = currentrow.getCell(j).toString();
                System.out.print(" "+value);
            }
            System.out.println();

	}
        workbook.close();
}
}

package com.kc.megamillions.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;



import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import com.kc.megamillions.dao.ExcelDao;
import com.kc.megamillions.services.CalculationService;
import com.kc.megamillions.services.RandomGeneratorService;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//	ExcelDao pastResultsDao = new ExcelDao();
//         
//         ArrayList<Date> pastResults = pastResultsDao.getPastDates();
         
		
		CalculationService cs = new CalculationService();
		
		cs.meanPastResults();
         
       
//         
//         int holdIndex = 0;
//         
//         for(Date date: pastResults){
//        	int month = date.getMonth() + 1;
//            int day = date.getDate();
//            int year = date.getYear() + 1900;
//
//            if((month == 5) && (day == 21) && (year == 2002)){
//            	holdIndex = pastResults.indexOf(date);
//            	//System.out.println("Found index: " + holdIndex);         	
//            }
//
//         }
//         
//         //Get Full information from that date
//         Result res = pastResultsDao.getPastWinningNumbers().get(holdIndex);
//         System.out.println(res.getFirstNum());
//         System.out.println(res.getSecondNum());
//         System.out.println(res.getThirdNum());
//         System.out.println(res.getFourthNum());
//         System.out.println(res.getFifthNum());
//         System.out.println(res.getMegaBall());
       
         
//         ArrayList<Integer> megaballs = pastResultsDao.getPastMegaBalls();
//         
//         for(Integer i : megaballs){
//        	 
//        	 System.out.println(i);
//         }
         
//		 FileInputStream file = new FileInputStream(new File("C:\\Users\\kxc541\\Desktop\\MMResults.xls"));
//		    HSSFWorkbook wb = new HSSFWorkbook(file);
//		    HSSFSheet sheet = wb.getSheetAt(0);
//		    Iterator<Row> rowIterator = sheet.iterator();
//		    while (rowIterator.hasNext()) {
//		      Row row = rowIterator.next();
//		      Iterator <Cell> cellIterator = row.cellIterator();
//		      while (cellIterator.hasNext()) {
//		        Cell cell = cellIterator.next();
//		        
//		        //Date
//		        if(cell.getColumnIndex() == 0){
//		        	
//		        	
//		        	
//		        }
//	
//		        //Winning Numbers
//		        if(cell.getColumnIndex() == 1){
//		        	
//		        	
//		        	
//		        }
//		        
//		        
//		        //MegaBall Multiplier
//		        if(cell.getColumnIndex() == 2){
//		        	
//		        	
//		        	
//		        }
//		        
//		        //Multiplier 
//		        if(cell.getColumnIndex() == 3){
//		        	
//		        	
//		        	
//		        }
//		        
//		        
//		        
//		        
		        
		        
//		        if(cell.getCellType() == 0){
//		        	if(HSSFDateUtil.isCellDateFormatted(cell)){
//		        		
//		        		System.out.println(cell.getDateCellValue() + " " + cell.getColumnIndex());
//		        		
//		        	}else{
//		        		
//		        		System.out.println(cell.getNumericCellValue() + " " + cell.getColumnIndex());
//		        		
//		        	}
//		        	
//		        	
//		        	
//		        	
//		        }else if(cell.getCellType() == 1){
//		        	
//		        	System.out.println(cell.getStringCellValue() + " " + cell.getColumnIndex());
//		        	
//		        }
		       
//		      }
//		    }
//		    file.close();
//		    FileOutputStream out =
//		      new FileOutputStream(new File("C:\\test.xls"));
//		    wb.write(out);
//		    out.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		RandomGeneratorService rgs = new RandomGeneratorService();
//	
//		Result r =	rgs.generateRandomResult();
//		
//		ArrayList<Integer> temp = r.getFullResult();
//
//        for(Integer number : temp){
//        	
//        	
//			System.out.println(number);
//        	
//        	
//        }
//        
//        System.out.println("First number: " + r.getFirstNum());
//        System.out.println("MegaBall is: " + r.getMegaBall());
		
		
	}

}

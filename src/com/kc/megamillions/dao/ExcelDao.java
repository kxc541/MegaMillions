package com.kc.megamillions.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Component;

import com.kc.megamillions.domain.Result;

@Component
public class ExcelDao {

	private ArrayList<Date> pastDates = new ArrayList<Date>();
	//Includes the MegaBall 
	private ArrayList<Result> pastWinningNumbers = new ArrayList<Result>();
	private ArrayList<Integer> pastMegaBalls = new ArrayList<Integer>();
	private ArrayList<Integer> pastMultipliers = new ArrayList<Integer>();

	//public constructor
	public ExcelDao(){
		
		 	FileInputStream file = null;
			
		 	try {
				file = new FileInputStream(new File("C:\\Users\\kxc541\\Desktop\\MMResults.xls"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
			HSSFWorkbook wb = null;
			try {
				wb = new HSSFWorkbook(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    HSSFSheet sheet = wb.getSheetAt(0);
		    Iterator<Row> rowIterator = sheet.iterator();
		   
		    while (rowIterator.hasNext()) {
		      Row row = rowIterator.next();
		      Iterator <Cell> cellIterator = row.cellIterator();
		      
		      //One 'Result' created per 'row'
		      Result r = null;
		  	  ArrayList<Integer> temp = new ArrayList<Integer>();
		     
		      //Iterates through a row's cells
		      while (cellIterator.hasNext()) {
		    	  
		        Cell cell = cellIterator.next();

		        //Dates
		        if(cell.getColumnIndex() == 0){
		        	
		        	//Assumed date
		        	pastDates.add(cell.getDateCellValue());
		        	
		        }

		        //Winning Numbers
		        if(cell.getColumnIndex() == 1){
		        	/*
		        	 * Note that a sort is not needed as past results 
		        	 * happen to be sorted already :)
		        	 */

		        	String[] winningNums = cell.getStringCellValue().split(" ");
		        	//System.out.println(cell.getStringCellValue());
		        	temp.add(Integer.parseInt(winningNums[0]));
		        	temp.add(Integer.parseInt(winningNums[1]));
		        	temp.add(Integer.parseInt(winningNums[2]));
		        	temp.add(Integer.parseInt(winningNums[3]));
		        	temp.add(Integer.parseInt(winningNums[4]));

		        	
		        }
		        
		        
		        //MegaBall
		        if(cell.getColumnIndex() == 2){
		        	
		        	temp.add((int)cell.getNumericCellValue());
		        	pastMegaBalls.add((int)cell.getNumericCellValue());

		        }
		        
		        //Multiplier 
		        if(cell.getColumnIndex() == 3){
		        	
		        	pastMultipliers.add((int)cell.getNumericCellValue());
		        	
		        }

		      }
		      
	            //Add the Result (r) to list of pastResults
		  	    r = new Result(temp);
				pastWinningNumbers.add(r);
		    }
		    try {
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	//DAO Methods
	public ArrayList<Date> getPastDates() {
		return pastDates;
	}

	public ArrayList<Result> getPastWinningNumbers() {
		return pastWinningNumbers;
	}

	public ArrayList<Integer> getPastMegaBalls() {
		return pastMegaBalls;
	}

	public ArrayList<Integer> getPastMultipliers() {
		return pastMultipliers;
	}

}

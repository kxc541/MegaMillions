package com.kc.megamillions.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

import com.kc.megamillions.dao.ExcelDao;
import com.kc.megamillions.domain.Result;
import com.kc.megamillions.domain.Statistics;

/*
 * This class contains many services related to crunching numbers
 */
@Component
public class CalculationService {

	private ExcelDao pastResultsDao = new ExcelDao();

	public CalculationService(){}

	//Count how many times a number occurred in the past
	public int countPastOccurrences(int num){
		
		int count = 0;
		
		ArrayList<Result> allNumbers = pastResultsDao.getPastWinningNumbers();
		
		for(Result r: allNumbers){
	
			if(r.getFullResult().contains(num)){
				
				count++;
				
			}

		}
		return count;
		
	}
	
	//Calculate standard deviation for single result
	public double standardDevSingleResult(Result r){
		double[] arrayNums = new double[5];
	
		arrayNums[0] = r.getFirstNum();
		arrayNums[1] = r.getSecondNum();
		arrayNums[2] = r.getThirdNum();
		arrayNums[3] = r.getFourthNum();
		arrayNums[4] = r.getFifthNum();

		Statistics stats = new Statistics(arrayNums);
		
		return stats.getStdDev();

	}
	
	//Calculate mean for single result
	public double meanSingleResult(Result r){
		double[] arrayNums = new double[5];
	
		arrayNums[0] = r.getFirstNum();
		arrayNums[1] = r.getSecondNum();
		arrayNums[2] = r.getThirdNum();
		arrayNums[3] = r.getFourthNum();
		arrayNums[4] = r.getFifthNum();

		Statistics stats = new Statistics(arrayNums);
		
		return stats.getMean();

	}
	
	//Calculate mean for single result
	public double varianceSingleResult(Result r){
		double[] arrayNums = new double[5];
	
		arrayNums[0] = r.getFirstNum();
		arrayNums[1] = r.getSecondNum();
		arrayNums[2] = r.getThirdNum();
		arrayNums[3] = r.getFourthNum();
		arrayNums[4] = r.getFifthNum();

		Statistics stats = new Statistics(arrayNums);
		
		return stats.getVariance();

	}
	
	/*
	 * Print out standard deviation of all past results
	 * This will needed to be converted to return JSON for web.
	 */
	
	public void standardDevPastResults(){
		ArrayList<Result> results = pastResultsDao.getPastWinningNumbers();
		
		for(Result r: results){
			
			System.out.println(standardDevSingleResult(r));
			
		}

	}
	
	/*
	 * Print out mean of all past results
	 * This will needed to be converted to return JSON for web.
	 */
	
	public void meanPastResults(){
		ArrayList<Result> results = pastResultsDao.getPastWinningNumbers();
		
		for(Result r: results){
			
			System.out.println(meanSingleResult(r));
			
		}
	}

	/*
	 * Method doesn't really calculate anything,
	 * But it does provide a service in case all results want to be viewed
	 * FYI: This method will probably be moved in the future
	 */
	public void printAll(){
		
		ArrayList<Result> allNumbers = pastResultsDao.getPastWinningNumbers();
		
		for(Result r: allNumbers){
	
			System.out.println(r.getFullResult());

		}
		
		
	}
	
	/*
	 * Getters/Setters
	 */
	
	public ExcelDao getPastResultsDao() {
		return pastResultsDao;
	}

	public void setPastResultsDao(ExcelDao pastResultsDao) {
		this.pastResultsDao = pastResultsDao;
	}



}

package com.kc.megamillions.services;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.stereotype.Component;

import com.kc.megamillions.domain.Result;


@Component
public class RandomGeneratorService {
	
	
	private ArrayList<Result> listOfResults;
	
	
	/*
	 * Method that generates 5 numbers and a megaball (Returns Result)
	 */
    public Result generateRandomResult(){
 
    	//Holds a resultSet(Not related to the class Result, obvy
    	ArrayList<Integer> resultSet = new ArrayList<Integer>();
    	
    	int randomNumber = (int)(Math.random()*100);

    	
    	for(int i = 0; i<5; i++){
    		
    		while(resultSet.contains(new Integer(randomNumber)) 
    				|| randomNumber < 1 
    				|| randomNumber > 75){
    				
    				randomNumber = (int)(Math.random()*100);
    				
    		}//end of while

            resultSet.add(new Integer(randomNumber));
 
    	}
    	
    	
    	/*
    	 * Sort the first 5. This consistent behavior will be helpful later :)
    	 */
    	Collections.sort(resultSet);

    	/*
    	 * Now adding a MegaBall;
    	 * Megaball will be the last element (ArrayList preserves order, luckily)
    	 */
    	
    	resultSet.add(new Integer(generateMegaBall()));

    	//populate Result
        return new Result(resultSet);
	
    }//End of generateRandomResult
    	
    public int generateMegaBall(){
    	
    	int randomMegaBall = (int)(Math.random()*100);
 
		while(randomMegaBall < 1 || randomMegaBall>15){
				
				randomMegaBall = (int)(Math.random()*100);
				
		}//end of while
		
		return randomMegaBall;
	

    }


}

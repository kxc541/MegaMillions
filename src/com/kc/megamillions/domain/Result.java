package com.kc.megamillions.domain;

import java.io.Console;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

/*
 * A Result contains 5 numbers and a Megaball
 */
@Component
public class Result {

	/*
	 * First 5 winning numbers
	 */
	private int firstNum;
	private int secondNum;
	private int thirdNum;
	private int fourthNum;
	private int fifthNum;
	
	/*
	 * Megaball
	 */
	private int megaBall;
	
    /*
     * Array List of full result set
     */
	ArrayList<Integer> fullResult;

	
	/*
	 * Constructor
	 */
	public Result(){
		
	}
	
	/*
	 * Constructor 2 - This one takes 5 numbers and a megaball
	 */
	
	public Result(int firstNum, int secondNum, int thirdNum, int fourthNum, int fifthNum, int megaBall){
		
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.thirdNum = thirdNum;
		this.fourthNum = fourthNum;
		this.fifthNum = fifthNum;
		this.megaBall = megaBall;
		
		fullResult = new ArrayList<Integer>();
		fullResult.add(new Integer(firstNum));
		fullResult.add(new Integer(secondNum));
		fullResult.add(new Integer(thirdNum));
		fullResult.add(new Integer(fourthNum));
		fullResult.add(new Integer(fifthNum));
		fullResult.add(new Integer(megaBall));	

	}
	
	public Result(ArrayList<Integer> fullResult){
		
		this.fullResult = fullResult;
		
		
		try
		{
		//Assign Numbers
		this.firstNum = fullResult.get(0);
		this.secondNum = fullResult.get(1);
		this.thirdNum = fullResult.get(2);
		this.fourthNum = fullResult.get(3);
		this.fifthNum = fullResult.get(4);
		this.megaBall = fullResult.get(5);
		}catch(IndexOutOfBoundsException e)
		{
			System.out.println("Something may be wrong with your list of numbers. :)");
		}		
		
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public int getThirdNum() {
		return thirdNum;
	}

	public void setThirdNum(int thirdNum) {
		this.thirdNum = thirdNum;
	}

	public int getFourthNum() {
		return fourthNum;
	}

	public void setFourthNum(int fourthNum) {
		this.fourthNum = fourthNum;
	}

	public int getFifthNum() {
		return fifthNum;
	}

	public void setFifthNum(int fifthNum) {
		this.fifthNum = fifthNum;
	}

	public int getMegaBall() {
		return megaBall;
	}

	public void setMegaBall(int megaBall) {
		this.megaBall = megaBall;
	}

	public ArrayList<Integer> getFullResult() {
		return fullResult;
	}

	public void setFullResult(ArrayList<Integer> fullResult) {
		this.fullResult = fullResult;
	}

}

package com.csci4448.project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
	private static RandomGenerator instance = null;
	public static Random randNum = null;
	
	private RandomGenerator(int i) {
		randNum = new Random(i);
	}
	
	public static RandomGenerator getRandomNumber(int i){
		if(instance == null){
			instance = new RandomGenerator(i);
		}
		return instance;
	}
	
	public int getMainRand(){
		return randNum.nextInt(10) + 1;
	}
	public static void RandomMethod(){
		List<Integer> LInt = new ArrayList<>();
		for(int i = 0; i < 1; i++){
		LInt.add(getRandomNumber(10).getMainRand());
		}
		for(int i : LInt){
			System.out.println(i);
		}
	}
}

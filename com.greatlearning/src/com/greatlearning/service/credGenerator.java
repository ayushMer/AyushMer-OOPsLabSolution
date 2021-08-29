package com.greatlearning.service;

import java.util.Random;

public class credGenerator {

	public int getRandomNumber(int min,int max)
	{
		Random random= new Random();
		//int random=(int)(Math.random());
		return random.nextInt(max-min)+min;
	}
		public String generatedCreds() {
		// TODO Auto-generated method stub
		int random=(int)(Math.random()*9000)+1000;
		String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase="abcdefghijklmnopqrstuvwxyz";
		String specialChars="!@#$%^&*()_=+";
		String password="";
		for(int i=0;i<3;i++)
		{
			password=password+upperCase.charAt(getRandomNumber(0,upperCase.length()))
					+lowerCase.charAt(getRandomNumber(0,lowerCase.length()))
					+specialChars.charAt(getRandomNumber(0,specialChars.length()))
					+getRandomNumber(0,9);
		}
		
	return password;
	}

}

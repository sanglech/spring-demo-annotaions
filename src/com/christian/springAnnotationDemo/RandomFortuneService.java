package com.christian.springAnnotationDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	
	private ArrayList<String> gFortunes= new ArrayList<String>();
	//Array of string fortunes
	
	@Value("${goodFortunes}")
	private String[] goodFortunes;

	//Random number generator
	private Random rand= new Random();
	
	@Override
	public String getFortune() {
		//return a random fortune
		//int index= rand.nextInt(goodFortunes.length);
		
		int index = rand.nextInt(gFortunes.size());
		//return goodFortunes[index];
		
		return gFortunes.get(index);
	}
	
	//Define init method
	@PostConstruct
	public void doMyStartupStuff(){
		try {
			File fortuneFile= new File("goodfortunes.txt");
		      Scanner myReader = new Scanner(fortuneFile);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        gFortunes.add(data);
		        //System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}

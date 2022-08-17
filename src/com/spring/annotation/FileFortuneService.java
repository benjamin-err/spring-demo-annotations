package com.spring.annotation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;


@Component
public class FileFortuneService implements FortuneService {
	
	private static final String FILE_PATH ="src/fortunes.txt";
	
	// pokusaj ove inicijalizirati u konstruktoru
	private Random r;
	private List<String> fortunes;
	
	public FileFortuneService() {
		System.out.println(">> FileFortuneService constructor");
		r = new Random();
		fortunes = new ArrayList<>();
	}
	
	@PostConstruct
	private void populateFile() {
		
		String line;
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File(FILE_PATH)))) {
			while((line = br.readLine()) != null) {
				fortunes.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	@Override
	public String getFortune() {	
		return fortunes.get(r.nextInt(fortunes.size()));
	}

}

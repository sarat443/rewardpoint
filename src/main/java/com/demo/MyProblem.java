package com.demo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MyProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fs = new FileInputStream(
					"/Users/sharatmeitei/Documents/workspace-spring-tool-suite-4-4.6.1.RELEASE/demo/src/main/java/com/demo/words.txt");
		    DataInputStream dis = new DataInputStream(fs);
		    BufferedReader br = new BufferedReader(new InputStreamReader(dis));
		    Map <String, Integer> wordMap = new HashMap<>();
		    String line = null ;
		    while((line=br.readLine())!= null) {
		    	String words[] = line.split(" ");
		    	for (String word : words) {
		    		if(wordMap.containsKey(word)) {
		    			wordMap.put(word, wordMap.get(word)+1);
		    		} else {
		    			wordMap.put(word, 1);
		    		}
		    		
		    	}
		    }
		    System.out.println("word Map : "+wordMap);
		    br.close();
		    fs.close();
		    dis.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}

}

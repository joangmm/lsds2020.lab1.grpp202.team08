/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upf.edu.filter;
import upf.edu.parser.SimplifiedTweet;
import upf.edu.filter.LanguageFilter;
import java.io.*;
import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author u149943
 */

public class FileLanguageFilter implements LanguageFilter{

    private String inputFile;
    private String outputFile;
    
    public FileLanguageFilter(String inputFile, String outputFile){
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }
    
    public void filterLanguage(String language) throws Exception{
    	long count = 0;	//tweets counter
        File input = new File(inputFile);
        String CurrentLine;
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        Scanner sc = new Scanner(input);
        while (sc.hasNextLine()) {
                CurrentLine = sc.nextLine();
                Optional<SimplifiedTweet> Tweet = SimplifiedTweet.fromJson(CurrentLine) ;
                if(Tweet.isPresent()) {                	
                	if (Tweet.get().getLanguage().equals(language)){
                			count += 1;
	                        byte[] strToBytes = CurrentLine.getBytes();
	                        outputStream.write(strToBytes);
	                }
                }                
        }
        System.out.println("Total number of tweets: " + count);
        sc.close();
        outputStream.close();
    } 
}

package algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
	
public class WordList{
    private Scanner input;

	private static List<Term> wordList = new ArrayList<Term>();
	
	public WordList() throws Exception{
		inputter();
	}
	
	public static void inputter() throws Exception {
		File termFile = new File("wiktionary.txt");
		 Scanner inTerms = new Scanner(termFile);

		 String delims = "\t";
		  while (inTerms.hasNextLine()) {
		    String termDetails = inTerms.nextLine().trim();
		    String[] termTokens = termDetails.split(delims);

		    if (termTokens.length == 2) {
		      Long weight = Long.parseLong(termTokens[0]);
		      String name = termTokens[1];
              Term t = new Term(name, weight);
              wordList.add(t);
             
		    }else
		    {
		      inTerms.close();
		      throw new Exception("Invalid member length: "+termTokens.length);
		    }
		  }
		  inTerms.close();

	}


	public List<Term> getWordList() {
		return wordList;
	}


	public void setWordList(List<Term> wordList) {
		this.wordList = wordList;
	}

}



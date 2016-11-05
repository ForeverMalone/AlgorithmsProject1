
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
	
public class WordList implements StringSearchInterface {
    private Scanner input;

	private List<String> wordList;

	public WordList(String urlString) throws IOException {
		input = new Scanner(System.in);
        
		BufferedReader in = null;
		try {
			wordList = new ArrayList<String>();

			in = new BufferedReader(new InputStreamReader(
					new URL(urlString).openStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null)
				wordList.add(inputLine);
		} finally {
			if (in != null)
				in.close();
		}
		Collections.sort(wordList);
		
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ie.wit.bsc2.assess1.StringSearchInterface#getSubstringList(java.lang.
	 * String)
	 */
	@Override
	public List<String> getSubstringList(String subString) {
		List<String> returnList = new ArrayList<String>();
		if (subString != null) {
			for (String s : wordList) {

				if (s.toLowerCase().contains(subString.toLowerCase()))
					returnList.add(s);
			}
		}
		Collections.sort(returnList);
		return returnList;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ie.wit.bsc2.assess1.StringSearchInterface#addString(java.lang.String)
	 */
	@Override
	public void addString(String s) {

		if (s != null && s.trim().length() > 0)
			wordList.add(s.trim());

	}
	
	
	
	public static void main(String[] args) throws Exception {
		File termFile = new File("wiktionary.txt");
		 Scanner inTerms = new Scanner(termFile);
		    
		 List<Term> terms = new ArrayList<Term>();
		  String delims = "\t";//each field in the file is separated(delimeted) by a space.
		  while (inTerms.hasNextLine()) {
		    // get user and rating from data source
		    String termDetails = inTerms.nextLine().trim();
		    // parse user details string
		    String[] termTokens = termDetails.split(delims);

		    // output user data to console.
		    if (termTokens.length == 2) {
		      System.out.println("Weight: " + termTokens[0] + ",Term:" + termTokens[1]);
              Term t = new Term(termTokens[1], Long.parseLong (termTokens[0]));
              terms.add(t);
             
		    }else
		    {
		      inTerms.close();
		      throw new Exception("Invalid member length: "+termTokens.length);
		    }
		  }
		  inTerms.close();

	}
}



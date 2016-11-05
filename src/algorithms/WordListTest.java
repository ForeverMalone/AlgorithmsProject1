package algorithms;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


import java.util.List;

import org.junit.Test;

/**
 * Simple test for class implementing WordSearch Interface according to
 * assignment specification. This Test should work "as is". 
 * Note the methods throw exception. This is to handle students who throw 
 * rather than catch exceptions in their methods. 
 * Please try to test your exception handling in other tests.
 * Passing this unit test does not guarantee your methods work correctly. Please feel free to create
 * your own tests.
 * 
 * @author Frank
 * 
 * 
 */
public class WordListTest {

	private static final String url = "https://wit-computing.github.io/algorithms-2016/topic04/book-2/data/wiktionary.txt";

	/**
	 * Tests adding a string to the wordlist.
	 */
	@Test
	public void testAddString() throws Exception {
		StringSearchInterface wordList;
		String s = "I Love Javaaaaaa!";
		String searchString="love";

		wordList = new WordList(url);

		wordList.addString(s);
		System.out.println(wordList.getSubstringList(searchString).size());
		// check that the search returned some results
		assertTrue(wordList.getSubstringList(s).size() == 1);

	}

	/**
	 * Tests getSubString method;
	 */
	@Test
	public void testGetSubstringList() throws Exception {
		StringSearchInterface wordList;
		String s = "umb";

		wordList = new WordList(url);
		
		wordList.addString(s);
		
		List<String> resultList = wordList.getSubstringList(s);

		// check that the search returned some result(i.e. there is a match
		// in the list)
		assertTrue(resultList.size() > 0);

	}

	/**
	 * Tests creation of WordList object;
	 */
	@Test
	public void testWordList() throws Exception {
		StringSearchInterface wordList;

		wordList = new WordList(url);
		assertNotNull(wordList);

	}

}
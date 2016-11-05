package algorithms;

import java.util.List;

public interface StringSearchInterface {

	/**
	 * This method returns a list of Strings that contain the substring
	 * passed as an argument. 
	 * 
	 * @param subString to search for.
	 * @return List<String> of matching substrings.
	 */
	public abstract List<String> getSubstringList(String subString);

	

	/**
	 * Method that adds a String to the list of strings 
	 * 
	 * @param p
	 */
	public abstract void addString(String s);
	

}
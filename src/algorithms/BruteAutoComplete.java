package algorithms;

import java.util.ArrayList;
import java.util.List;

public class BruteAutoComplete implements AutoComplete {
    
	WordList word;
	@Override
	public double weightOf(String term) {
		
		for(int i=0; i < word.getWordList().size(); i++) {
			if (term.equals(word.getWordList().get(i).getName())){
				return word.getWordList().get(i).getWeight();
			}
		}
		return 0.0;
	}

	@Override
	public String bestMatch(String prefix) throws Exception {
		
		word = new WordList();
		for(int i=0; i < word.getWordList().size(); i++) {
			if (word.getWordList().get(i).getName().startsWith(prefix)){
				return word.getWordList().get(i).getName();
			}
		}
		
		return null;
	}

	@Override
	public Iterable<String> matches(String prefix, int k) {
		List<String> matchesList = new ArrayList<String>();
		for(int i=0; i < word.getWordList().size(); i++) {
			if (word.getWordList().get(i).getName().startsWith(prefix) && (matchesList.size() < k)){
				matchesList.add(word.getWordList().get(i).getName());
			}
		}
		return matchesList;
	}

}

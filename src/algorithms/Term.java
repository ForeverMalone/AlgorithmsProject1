package algorithms;

public class Term {
	
	private String name;
    private long weight;
    
	public String getName() {
		return name;
	}

	public long getWeight() {
		return weight;
	}

	public Term(String name, long weight) {
		this.name = name;
		this.weight = weight;
	}
    
    public String toString(){
    	return weight+"	"+name;
    }

}

package domainModel;

public class Topic {
	
	private String name;
	
	public Topic(String name) {
		this.name = name;
	}
	public Topic(Topic t) {
		this.name = t.name;
	}
	public String getName() {
		String n = new String(name);
		return n;
	}
	
}

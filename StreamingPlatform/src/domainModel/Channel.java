package domainModel;

public class Channel {
	private String name;
	private Live live;
	
	public Channel(String name) {
		this.name=name;
	}
	
	public void startLive(String name) {
		this.live=new Live(name);
	}
	
    public Live getLive() {
		return this.live;
	}

}

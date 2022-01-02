package domainModel;

public class Streamer extends User {
	private Channel myChannel;
	
	public Streamer(String name, Channel channel) {
		super(name);
		this.myChannel=channel;
	}
	
	public void startLive(String name) {
		this.myChannel.startLive(name);
	}
	

	
	
	
	}



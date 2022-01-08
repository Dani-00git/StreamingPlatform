package domainModel;

public class Streamer extends User {
	private Channel myChannel;
	
	public Streamer(String name, String channelName, ChannelsPanel cp, RecommendedChannels rc) {  
		super(name, rc);
		this.myChannel= new Channel(channelName);
		cp.addNewChannel(myChannel);
	}
	
	public Streamer(String name, String channelName, ChannelsPanel cp) {  
		super(name);
		this.myChannel= new Channel(channelName);
		cp.addNewChannel(myChannel);
	}
	
	public void startLive(String name) {
		this.myChannel.startLive(name);
	}
	
	public void stopLive() {            
		this.myChannel.stopLive();
	}
	
	public void setTopic(Topic t) {            
		this.myChannel.setTopic(t);
	}
}



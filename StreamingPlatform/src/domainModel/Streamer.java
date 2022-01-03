package domainModel;

public class Streamer extends User {
	private Channel myChannel;
	
	public Streamer(String name, String channelName) {  //FIXED crea il canale nel costruttore
		super(name);
		this.myChannel= new Channel(channelName);
	}
	
	public void startLive(String name) {
		this.myChannel.startLive(name);
	}
	
	public void stopLive() {            //Aggiunto
		this.myChannel.stopLive();
	}
}



package businessLogic;

import domainModel.ChannelsPanel;
import domainModel.Streamer;

public class PageControllerStreamer extends PageControllerUser{

	private String userName;
	private Streamer streamer;
	
	public PageControllerStreamer(String userName, ChannelsPanel cp, String channelName) {
		super(userName, cp);
		this.userName = userName;
		streamer = new Streamer(userName, channelName);
	}
	public void startLive(String name) {
		streamer.startLive(name);
	}
	public void stopLive() {
		streamer.stopLive();
	}
}

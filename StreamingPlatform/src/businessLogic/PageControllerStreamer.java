package businessLogic;

import domainModel.Streamer;

public class PageControllerStreamer extends PageControllerUser{

	private String userName;
	private Streamer streamer;
	
	public PageControllerStreamer(String userName) {
		this.userName = userName;
		streamer = new Streamer(userName);
	}
	public void startLive(String name) {
		streamer.startLive(name);
	}
	public void endLive() {
		streamer.endLive();
	}
}

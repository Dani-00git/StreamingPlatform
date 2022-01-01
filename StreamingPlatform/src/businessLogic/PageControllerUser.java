package businessLogic;

public class PageControllerUser {
	
	protected String userName;
	protected ChannelsPannel cp;
	protected PageViewer pw;
	protected Live 
	
	
	public PageControllerUser(String userName, ChannelPanel cp){
		this.userName = userName;
		this.cp = cp;
	}
	public Channel searchChannel(String channelName) {
		return cp.search(channelName);
	}
	public Live WatchLive(Channel c) {
		
	}
}

package businessLogic;

import domainModel.Channel;
import domainModel.ChannelsPanel;
import domainModel.Live;

public class PageControllerUser {
	
	protected String userName;
	protected ChannelsPanel cp;
	protected PageViewer pw;
	
	public PageControllerUser(String userName, ChannelsPanel cp){
		this.userName = userName;
		this.cp = cp;
	}
	public Channel searchChannel(String channelName) {
		return cp.search(channelName);
	}
	public Live WatchLive(Channel c) {
		
	}
}
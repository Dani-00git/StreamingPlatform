package businessLogic;

import domainModel.Channel;
import domainModel.ChannelsPanel;
import domainModel.Live;
import domainModel.RecommendedChannels;
import domainModel.User;

public class PageControllerUser {
	
	protected User user;
	protected ChannelsPanel cp;
	protected PageViewer pw;
	protected RecommendedChannels rc;
	
	public PageControllerUser(String userName, ChannelsPanel cp){
		user = new User(userName);
		this.cp = cp;
	}
	public Channel searchChannel(String channelName) {
		return cp.search(channelName);
	}
	public void watchLive(Channel c) {
		user.watchLive(c);
	}
	public void closeLive() {
		user.closeLive();
	}
	public void addComment(String s) {
		user.addComment(s);
	}
	public void addLike(){
		user.addLike();
	}
	public void followChannel(Channel c) {
		user.followChannel(c);
	}
	public void unChannel(Channel c) {
		user.followChannel(c);
	}
	public void addTopic(String topic) {
		rc.addTopic(topic);
	}
	public void removeTopic(String topic) {
		rc.removeTopic(topic);
	}
	
}








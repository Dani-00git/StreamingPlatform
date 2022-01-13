package businessLogic;

import domainModel.Channel;
import domainModel.ChannelsPanel;
import domainModel.Live;
import domainModel.RecommendedChannels;
import domainModel.User;

public class PageControllerUser {
	
	protected User user;
	protected ChannelsPanel cp;
	public PageViewer pv;
	protected RecommendedChannels rc;
	
	public PageControllerUser(String userName, ChannelsPanel cp){
		user = new User(userName);
		pv = new PageViewer();
		rc = new RecommendedChannels(cp, pv);
		this.cp = cp;
	}
	public Channel searchChannel(String channelName) {
		return cp.search(channelName);
	}
	public void watchLive(Channel c) {
		user.watchLive(c, pv);
	}
	public void closeLive() {
		pv.destroyCommentList();
		user.closeLive(pv);
	}
	public void addComment(String s) {
		user.addComment(s);
	}
	public void addLike(){
		user.addLike();
	}
	public void followChannel(Channel c) {
		user.followChannel(c, pv);
	}
	public void unfollowChannel(Channel c) {
		user.unfollowChannel(c, pv);
	}
	public void addTopic(String topic) {
		rc.addTopic(topic);
	}
	public void removeTopic(String topic) {
		rc.removeTopic(topic);
	}
	public String getWatchedLive() {
		return user.getWatchedLive();
	}
	public String getUserFollowedChannell(int i) {
		return user.getFollowedChannel(i);
	}
	public String getTopic(int i) {
		return rc.getTopic(i);
	}
	
}








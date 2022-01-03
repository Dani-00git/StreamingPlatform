package domainModel;

import java.util.ArrayList;

import businessLogic.PageViewer;

public class User {
	
    protected String name;
    protected ChannelsPanel channelsPanel;
    protected ArrayList<Topic> favouriteTopics = new ArrayList<Topic>();       //
    protected ArrayList<Channel> followedChannels = new ArrayList<Channel>();
    protected RecommendedChannels recommendedChannels;
    protected Live watchedLive;
    
    public User(String name) {
    	this.name = name;
    }
   
    public void followChannel (Channel channel, PageViewer pv) {
	   this.followedChannels.add(channel);
	   channel.addFollower(this, pv);
    }
	
    public void unfollowChannel (Channel channel, PageViewer pv) {
    	this.followedChannels.remove(channel);
    	channel.removeFollower(this, pv);
    }
   
    public void watchLive(Channel channel, PageViewer newWatcher) {
    	if (channel.getLive().isOnAir()==true)
    		this.watchedLive=channel.getLive();
    	channel.getLive().attachViewer(newWatcher);
    }
   
    public void closeLive(PageViewer pv) {
    	watchedLive.removeWatcher(pv);
    	this.watchedLive=null;
    }
   
    public void addLike () {
    	this.watchedLive.addLike();
    }
   
    public void removeLike () {
    	this.watchedLive.decreaseLike();
    }
   
    public void addComment(String myComment) {
    	this.watchedLive.addComment(myComment, this.name);
    }
   
    public void addTopic(Topic topic) {
    	this.favouriteTopics.add(topic);
    }
   
    public void removeTopic(Topic topic) {
    	this.favouriteTopics.remove(topic);
    }

}

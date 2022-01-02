package domainModel;

import java.util.ArrayList;

public class User {
	
    protected String name;
    protected ChannelsPanel channelsPanel;
    protected ArrayList<Topic> favouriteTopics;
    protected ArrayList<Channel> followedChannels;
    protected RecommendedChannels recommendedChannels;
    protected Live watchedLive;
    
    
    
   public User(String name) {
	   this.name = name;
   }
   
   public void followChannel (Channel channel) {
	   this.followedChannels.add(channel);
   }
	
   public void unfollowChannel (Channel channel) {
	   this.followedChannels.remove(channel);
   }
   
   public void watchLive(Channel channel) {
	   if (channel.getLive().isOnAir()==true)
		   this.watchedLive=channel.getLive();
   }
   
   public void stopWatchingLive() {
	   this.watchedLive=null;
   }
   
   public void addLike () {
	   this.watchedLive.addLike();
   }
   
   public void removeLike () {
	   this.watchedLive.decreaseLike();
   }
   
   public void addComment(String myComment) {
	   this.watchedLive.addComment(myComment);
   }
   
   public void addTopic(Topic topic) {
	   this.favouriteTopics.add(topic);
   }
   
   public void removeTopic(Topic topic) {
	   this.favouriteTopics.remove(topic);
   }

}

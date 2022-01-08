package domainModel;
import java.util.ArrayList;

import businessLogic.PageViewer;

public class Channel extends Osservato {
	
	private String name;
	private Live live;
	private RecommendedChannels rc;
	private ArrayList<User> followers = new ArrayList<User> ();   
	private Topic channelTopic;
	
	public Channel(String name) {   
		this.name=name;   
		this.live=new Live();
	}
	
	public Channel(Channel c) {   
		this.name = c.getName();   
		this.live = new Live();
	}
	
	public void addFollower(User newFollower, PageViewer pv) {
		followers.add(newFollower);
		super.attachFollower(pv);
	}
	
	public void removeFollower(User follower, PageViewer pv) {
		followers.remove(follower);
		super.detachFollower(pv);
	}
	
	public void startLive(String name) {
		this.live.startLive(name, this);
	}
	
	public void stopLive() {
		this.live.stopLive(this);
	}
	
    public Live getLive() {
		return this.live;
	}
    
    public String getName() {
    	String n = new String(this.name);
    	return n;
    }
    public String getTopic() {
    	String t = new String(channelTopic.getName());
    	return t;
    }
    public User getFollower(int i) {
    	return followers.get(i);
    }
    public void setTopic(Topic t) {
    	channelTopic = t;
    }

}

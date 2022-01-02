package businessLogic;

import java.util.ArrayList;

import domainModel.Channel;
import domainModel.Comment;
import domainModel.Live;

public class PageViewer {
	
	private ArrayList<Comment> commentList = new ArrayList<Comment>();
	private ArrayList<Channel> followedChannelOnAir = new ArrayList<Channel>();
	private int likes;
	private Live currentLive;

	public void setCurrentLive(Live l) {
		this.currentLive = l;
		l.attachViewer(this);
	}
	public void update(Comment c) {
		commentList.add(c);
	}
	public void update(int likes) {
		this.likes = likes;
	}
	public void update(Boolean startedEnded, Channel c) {
		if(startedEnded) {
			followedChannelOnAir.add(c);
		}
		if(!startedEnded) {
			followedChannelOnAir.remove(c);
		}
	}
}

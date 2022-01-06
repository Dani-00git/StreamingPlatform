package businessLogic;

import java.util.ArrayList;

import domainModel.Channel;
import domainModel.Comment;
import domainModel.Live;
import domainModel.Osservatore;

public class PageViewer implements Osservatore{
	
	private ArrayList<Comment> commentList = new ArrayList<Comment>();
	private ArrayList<String> followedChannelOnAir = new ArrayList<String>();
	private ArrayList<String> recommendedChannels = new ArrayList<String>();
	private int likes;
	
	public void update(Comment c) {
		commentList.add(c);
	}
	public void update(int likes) {
		this.likes = likes;
	}
	public void update(Boolean startedEnded, String c) {
		if(startedEnded) {
			followedChannelOnAir.add(c);
		}
		if(!startedEnded) {
			followedChannelOnAir.remove(c);
		}
	}
	public void updateRecommendedChannels(ArrayList<String> c) {
		recommendedChannels = c;
	}
	public void destroyCommentList() {
		commentList = new ArrayList<Comment>();
	}
}

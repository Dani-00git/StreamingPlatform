package domainModel;

import java.util.ArrayList;
import java.util.Observable;

import businessLogic.PageViewer;

public class Live extends Observable{
	
	private String name;
	private int likes;
	private boolean onAir;
	private ArrayList<Comment> commentList = new ArrayList<Comment>();
	
    public Live() {
    	this.onAir = false;
    	this.likes = 0;
    }
    
    public void startLive(String name) {   //FIXED la live parte non quando viene creata ma quando lo streamer la fa partire
    	this.onAir = true;
    	this.name = name;
    	super.notify(true);
    }
    
    public void closeLive() {
    	this.onAir = false;
    	this.name = null;
    	super.notify(false);
    }
	
	public void addLike() {
		this.likes++;
	}
	
	public void decreaseLike() {
		this.likes--;
	}
	
	public void addComment(String myComment) {
		Comment comment = new Comment(myComment);
		this.commentList.add(comment);
	}
	
	public boolean isOnAir() {
		return this.onAir;
	}
	
	public void addWatcher(PageViewer newWatcher) {
		super.attachViewer(newWatcher);
	}
	
	public void removeWatcher(PageViewer watcher) {
		super.detachViewer(watcher);
	}


}

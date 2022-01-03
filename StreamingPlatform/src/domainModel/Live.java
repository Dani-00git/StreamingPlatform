package domainModel;

import java.util.ArrayList;
import java.util.Observable;

import businessLogic.PageViewer;

public class Live extends Osservato{
	
	private String name;
	private int likes;
	private boolean onAir;
	private ArrayList<Comment> commentList = new ArrayList<Comment>();
	
    public Live() {
    	this.onAir = false;
    	this.likes = 0;
    }
    
    public void startLive(String name, Channel thisChannel) {   //FIXED la live parte non quando viene creata ma quando lo streamer la fa partire
    	this.onAir = true;                                      // il metodo notify richiede un bool e il canale della live, quindi gli ho fatto passare un riferimemto al canale
    	this.name = name;
    	super.notify(true, thisChannel);
    }
    
    public void closeLive(Channel thisChannel) {
    	this.onAir = false;
    	this.name = null;
    	super.notify(false, thisChannel);
    }
	
	public void addLike() {
		this.likes++;
	}
	
	public void decreaseLike() {
		this.likes--;
	}
	
	public void addComment(String myComment, String user) {
		Comment comment = new Comment(myComment, user);
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

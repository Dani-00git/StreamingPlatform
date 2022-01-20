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
    
    public void startLive(String name, Channel thisChannel) {   
    	this.onAir = true;                                      
    	this.name = name;
    	String n = thisChannel.getName();
    	super.notify(true, n);
    }
    
    public void stopLive(Channel thisChannel) {
    	this.onAir = false;
    	this.name = null;
    	String n = thisChannel.getName();
    	super.notify(false, n);
    }
	
	public void addLike() {
		int l = this.likes++;
		super.notify(l);
	}
	
	public void decreaseLike() {
		int l = this.likes--;
		super.notify(l);
	}
	
	public void addComment(String myComment, String user) {
		Comment comment = new Comment(myComment, user);
		this.commentList.add(comment);
		Comment c = new Comment(comment);
    	super.notify(c);
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

	public Comment getComment(int i) {
		Comment c = new Comment(commentList.get(i));
		return c;
	}
	
	public String getName() {
		if (name == null)
			return null;
    	String s = new String(name);
    	return s;
	}

}

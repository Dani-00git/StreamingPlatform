package domainModel;

import java.util.ArrayList;

public class Live {
	
	private String name;
	private int likes;
	private boolean onAir;
	private ArrayList<Comment> commentList;
	
    public Live(String name) {
    	this.name=name;
    	this.onAir=true;
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

}

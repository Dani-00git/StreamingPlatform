package businessLogic;

public class PageViewer {
	
	private ArrayList<Comment> commentList = new ArrayList<Comment>();
	private ArrayList<Live> commentList = new ArrayList<Comment>();
	private int likes;
	private String currentLive;

	public setCurrentLive(Live l) {
		this.currentLive = l;
		l.attachViewer(this);
	}
	public void update(Comment c) {
		commentList.add(c);
	}
	public void update(int likes) {
		this.likes = likes;
	}
	public void update(Boolean startedEnded) {
	}
}

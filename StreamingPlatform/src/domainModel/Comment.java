package domainModel;

public class Comment {
	
	private String comment;
	private String user;
	
	public Comment(String comment, String user) {
		this.comment = comment;
		this.user = user;
	}
	
	public Comment(Comment c) {
		this.comment = c.getComment();
		this.user = c.getName();
	}
	
	public String getName() {
		String n = new String(user);
		return n;
	}
	public String getComment() {
		String c = new String(comment);
		return c;
	}

}

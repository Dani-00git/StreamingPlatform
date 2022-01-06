package domainModel;

public interface Osservatore {
	
	public void update(Boolean se, String c);
	public void update(int likes);
	public void update(Comment newComment);

}

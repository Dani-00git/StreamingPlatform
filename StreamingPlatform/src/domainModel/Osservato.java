package domainModel;

import java.util.ArrayList;
import java.util.Observer;

public class Osservato {
	
	protected ArrayList<Osservatore> viewers = new ArrayList<Osservatore>();
	
	protected ArrayList<Osservatore> followers = new ArrayList<Osservatore>();
	
	public void attachFollower(Osservatore o) {
		viewers.add(o);
	}
	public void detachFollower(Osservatore o) {
		viewers.remove(o);
	}
	public void attachViewer(Osservatore o) {
		followers.add(o);
	}
	public void detachViewer(Osservatore o) {
		followers.remove(o);
	}
	
	protected void notify(Boolean se, String c) {
		for(Osservatore o : followers) {
			o.update(se, c);
		}
	}
	
	protected void notify(Comment newComment) {
		for(Osservatore o : viewers) {
			o.update(newComment);
		}
	}
	protected void notify(int likes) {
		for(Osservatore o : viewers) {
			o.update(likes);
		}
	}

}

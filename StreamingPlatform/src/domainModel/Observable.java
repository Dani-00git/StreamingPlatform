package domainModel;

import java.util.ArrayList;
import java.util.Observer;

public class Observable {
	
	protected ArrayList<Observer> viewers = new ArrayList<Observer>();
	protected ArrayList<Observer> followers = new ArrayList<Observer>();
	
	public void attachFollower(Observer o) {
		viewers.add(o);
	}
	public void detachFollower(Observer o) {
		viewers.remove(o);
	}
	public void attachViewer(Observer o) {
		followers.add(o);
	}
	public void detachViewer(Observer o) {
		followers.remove(o);
	}
	
	protected void notify(Boolean se, Channel c) {
		for(Observer o : followers) {
			o.update(se, c);
		}
	}
	
	protected void notify(Comment newComment) {
		for(Observer o : viewers) {
			o.update(newComment);
		}
	}
	protected void notify(int likes) {
		for(Observer o : viewers) {
			o.update(likes);
		}
	}

}

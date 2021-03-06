package domainModel;

import java.util.ArrayList;

public class ChannelsPanel {
	
	 private ArrayList<Channel> channels = new ArrayList<Channel>();
	 
	 public void addNewChannel(Channel c) {
		 channels.add(c);
	 }
	 
	 public Channel search(String name) {
		 for(Channel c : channels) {
			 if(c.getName().contentEquals(name)) {
				 return c;
			 }
		 }
		 return null;
	 }
	 
	 public Channel searchByTopic(Topic t) {
		 for(Channel c : channels) {
			 if(c.getTopic().contentEquals(t.getName())) {
				 return c;
			 }
		 }
		 return null;
	 }
	 
	 public Channel getChannel(int i) {
		 return channels.get(i);
	 }
}

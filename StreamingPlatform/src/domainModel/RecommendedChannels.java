package domainModel;

import java.util.ArrayList;

import businessLogic.PageViewer;

public class RecommendedChannels {
	
	private ArrayList<Topic> topics = new ArrayList<Topic>();
	private ArrayList<Channel> recommendedChannels = new ArrayList<Channel>();
	private ChannelsPanel cp;
	private PageViewer pv;
	
	public RecommendedChannels(ChannelsPanel cp, PageViewer pv) {
		this.cp = cp;
		this.pv = pv;
	}
	
	public void addTopic(String topic) {
		Topic newTopic = new Topic(topic);
		topics.add(newTopic);
		calculateRecommendedChannels();
	}
	
	public void removeTopic(String topic) {
		for(Topic t : topics) {
			if(t.getName().contentEquals(topic)) {
				topics.remove(t);
			}
		}
		calculateRecommendedChannels();
	}
	
	public void calculateRecommendedChannels() {

		ArrayList<String> r = new ArrayList<String>();
		for(Topic t:topics) {
			recommendedChannels.add(cp.searchByTopic(t));
			r.add(cp.searchByTopic(t).getName());
		}
		pv.updateRecommendedChannels(r);
	}
	
	public String getTopic(int i) {
		if(topics.size() > 0) {
			String t = new String(topics.get(i).getName());
			return t;
		}
		return null;
	}
	public String getRecommendedChannel() {
		return recommendedChannels.get(0).getName();
	}
}

package domainModel;

import java.util.ArrayList;

import businessLogic.PageViewer;

public class RecommendedChannels {
	
	private ArrayList<Topic> topics = new ArrayList<Topic>();
	private ChannelsPanel cp;
	private PageViewer pv;
	
	public void RecommendedChannels(ChannelsPanel cp, PageViewer pv) {
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
			if(t.getName() == topic) {
				topics.remove(t);
			}
		}
		calculateRecommendedChannels();
	}
	public void calculateRecommendedChannels() {
		ArrayList<Channel> recommendedChannels = new ArrayList<Channel>();
		for(Topic t:topics) {
			recommendedChannels.add(cp.searchByTopic(t));
		}
		pv.updateRecommendedChannels(recommendedChannels);
	}
}

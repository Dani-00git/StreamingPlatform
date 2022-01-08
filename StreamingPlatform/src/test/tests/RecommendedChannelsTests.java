package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import businessLogic.PageViewer;
import domainModel.ChannelsPanel;
import domainModel.RecommendedChannels;
import domainModel.Streamer;
import domainModel.Topic;

class RecommendedChannelsTests {
	
	private static ArrayList<Topic> topics = new ArrayList<Topic>();
	private static ChannelsPanel cp;
	private static PageViewer pv;
	private static RecommendedChannels rc;
	
	@BeforeAll
	static void setUpBeforeClass(){
		pv = new PageViewer();
		cp = new ChannelsPanel();
		rc = new RecommendedChannels(cp, pv);
		ArrayList<Streamer> s = new ArrayList<Streamer>();

		for(int i=0; i<10; i++) {
			s.add(new Streamer("streamer di test", "canale di test", cp, rc)); 
		}
		Topic t1 = new Topic("gaming");
		s.get(0).setTopic(t1);
		s.get(1).setTopic(t1);
		s.get(2).setTopic(t1);
		Topic t2 = new Topic("just chatting");
		s.get(3).setTopic(t1);
		s.get(4).setTopic(t1);
		s.get(5).setTopic(t1);
		s.get(6).setTopic(t1);
		Topic t3 = new Topic("sports");
		s.get(7).setTopic(t1);
		s.get(8).setTopic(t1);
		s.get(9).setTopic(t1);
	}

	@Test
	void testAddTopic() {
		//Exercise
		rc.addTopic("gaming");
		//Verify
		assertEquals(rc.getTopic(0), "gaming");
		//Exercise
	}
	
	@Test 
	void testRemoveTopic() {
		//Exercise
		rc.removeTopic("gaming");
		//Verify
		assertNotEquals(rc.getTopic(0), "gaming");
	}

	@Test
	void testCalculateRecommendedChannels() {
		
	}

}

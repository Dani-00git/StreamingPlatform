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
		Streamer s = new Streamer("streamer di test", "canale di test", cp, rc);
		Topic t1 = new Topic("gaming");
		s.setTopic(t1);
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

}

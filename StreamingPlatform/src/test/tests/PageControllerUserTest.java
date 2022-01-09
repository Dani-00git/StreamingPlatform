package tests;

import static org.junit.Assert.assertEquals; 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import businessLogic.PageControllerUser;
import businessLogic.PageViewer;
import domainModel.Channel;
import domainModel.ChannelsPanel;
import domainModel.RecommendedChannels;
import domainModel.Streamer;
import domainModel.Topic;

class PageControllerUserTest {
	
	private static PageControllerUser pcu;

	@BeforeAll
	static void setUpBeforeClass(){
		ChannelsPanel cp = new ChannelsPanel();
		cp = new ChannelsPanel();
		Streamer s = new Streamer("streamer di test", "canale di test", cp);
		s.startLive("live di test");
		pcu = new PageControllerUser("userditest", cp);
	}

	@Test
	void testSearchChannel() {
		//Exercise
		Channel c = pcu.searchChannel("canale di test");
		//Verify
		assertEquals(c.getName(), "canale di test");
	}

	@Test
	void testWatchLive() {
		//Exercise
		pcu.watchLive(pcu.searchChannel("canale di test"));
		//Verify
		assertEquals(pcu.getWatchedLive(), "live di test");

	}

	@Test
	void testCloseLive() {
		//Exercise
		pcu.watchLive(pcu.searchChannel("canale di test"));
		pcu.closeLive();
		//Verify
		assertNotEquals(pcu.getWatchedLive(), "live di test");
		
	}

	@Test
	void testAddComment() {
		//Exercise
		pcu.watchLive(pcu.searchChannel("canale di test"));
		pcu.addComment("commento di test");
		//Verify
		assertEquals(pcu.pv.getComment(0), "commento di test");
		
	}

	@Test
	void testAddLike() {
		//Exercise
		pcu.watchLive(pcu.searchChannel("canale di test"));
		pcu.addLike();
		//Verify
		assertEquals(pcu.pv.getLikes(), 1);
		
	}

	@Test
	void testFollowChannel() {
		fail("Not yet implemented");
	}

	@Test
	void testUnfollowChannel() {
		fail("Not yet implemented");
	}

	@Test
	void testAddTopic() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveTopic() {
		fail("Not yet implemented");
	}

}

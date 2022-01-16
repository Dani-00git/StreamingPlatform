package tests;

import static org.junit.Assert.assertEquals; 
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
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
		Topic t = new Topic("gaming");
		cp = new ChannelsPanel();
		Streamer s = new Streamer("streamer di test", "canale di test", cp);
		s.setTopic(t);
		s.startLive("live di test");
		pcu = new PageControllerUser("userditest", cp);
	}
	@Test
    @Order(1)
	void testSearchChannel() {
		//Exercise
		Channel c = pcu.searchChannel("canale di test");
		//Verify
		assertEquals(c.getName(), "canale di test");
	}
	@Test
    @Order(2)
	void testWatchLive() {
		//Exercise
		pcu.watchLive(pcu.searchChannel("canale di test"));
		//Verify
		assertEquals(pcu.getWatchedLive(), "live di test");
	}
	@Test
    @Order(3)
	void testCloseLive() {
		//Exercise
		pcu.watchLive(pcu.searchChannel("canale di test"));
		pcu.closeLive();
		//Verify
		assertNotEquals(pcu.getWatchedLive(), "live di test");
	}
	@Test
    @Order(4)
	void testAddComment() {
		//Exercise
		pcu.watchLive(pcu.searchChannel("canale di test"));
		pcu.addComment("commento di test");
		//Verify
		assertEquals(pcu.getPV().getComment(0), "commento di test");
	}
	@Test
    @Order(5)
	void testAddLike() {
		//Exercise
		pcu.watchLive(pcu.searchChannel("canale di test"));
		pcu.addLike();
		pcu.addLike();
		pcu.addLike();
		//Verify
		assertEquals(pcu.getPV().getLikes(), 3);
	}
	@Test
    @Order(6)
	void testFollowChannel() {
		//Exercise
		pcu.followChannel(pcu.searchChannel("canale di test"));
		//Verify
		assertEquals(pcu.getUserFollowedChannell(0), "canale di test");
	}
	@Test
    @Order(7)
	static void testUnfollowChannel() {
		//Exercise
		pcu.unfollowChannel(pcu.searchChannel("canale di test"));
		//Verify
		assertNotEquals(pcu.getUserFollowedChannell(0), "canale di test");
	}
	@Test
    @Order(8)
	void testAddTopic() {
		//Exercise
		pcu.addTopic("gaming");
		//Verify
		assertEquals(pcu.getTopic(0), "gaming");
	}
	@Test
    @Order(9)
	static void testRemoveTopic() {
		//Exercise
		pcu.removeTopic("gaming");
		//Verify
		assertNotEquals(pcu.getUserFollowedChannell(0), "gaming");
	}
}

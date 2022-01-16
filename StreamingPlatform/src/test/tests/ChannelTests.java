package tests;

import static org.junit.Assert.assertEquals; 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import businessLogic.PageViewer;
import domainModel.Channel;
import domainModel.Topic;
import domainModel.User;

class ChannelTests {
	
	private static Channel c;
	@BeforeAll
	static void setUpBeforeClass(){
		c = new Channel("canaleditest");
	}
	@Test
	public void testAddFollower() {
		
		User u = new User("Tizio");
		PageViewer pv = new PageViewer();
		//Exercise
		c.addFollower(u, pv);
		//Verify
		assertEquals(u, c.getFollower(0));
	}
	@Test
	public void testRemoveFollower() {

		User u = new User("Tizio");
		PageViewer pv = new PageViewer();
		c.addFollower(u, pv);
		
		//Exercise
		c.removeFollower(u, pv);
		//verify
		assertNotEquals(u, c.getFollower(0));
	}
	@Test
	public void testStartLive() {
		//Exercise
		c.startLive("nuova live");
		//Verify
		assertEquals(true, c.getLive().isOnAir());
	}
	@Test
	public void testStopLive() {

		//Exercise
		c.stopLive();
		//Verify
		assertEquals(false, c.getLive().isOnAir());
	}
	@Test
	public void testSetTopic() {
		
		Topic t = new Topic("gaming");
		//Exercise
		c.setTopic(t);
		//verify
		assertNotEquals(t, c.getTopic());
	}
}

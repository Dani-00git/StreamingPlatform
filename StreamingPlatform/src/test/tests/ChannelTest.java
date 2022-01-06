package tests;

import org.junit.Assert

import businessLogic.PageViewer;
import domainModel.Channel;
import domainModel.User;

public class ChannelTest{
	
	Channel c;
	
	public void setup() {
		c = new Channel("canaleditest");
	}

	public void testAddFollower() {
		
		User u = new User("Tizio");
		PageViewer pv = new PageViewer();
		//Exercise
		c.addFollower(u, pv);
		//Verify
		assertEquals(u, c.getFollower(0));
	}

	public void testRemoveFollower() {
		fail("Not yet implemented");
	}

	public void testStartLive() {
		fail("Not yet implemented");
	}

	public void testStopLive() {
		fail("Not yet implemented");
	}

	public void testGetLive() {
		fail("Not yet implemented");
	}

	public void testGetName() {
		fail("Not yet implemented");
	}

	public void testGetTopic() {
		fail("Not yet implemented");
	}

}

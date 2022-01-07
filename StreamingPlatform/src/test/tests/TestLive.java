package tests;

import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import domainModel.Channel;
import domainModel.Live;
import domainModel.User;

public class TestLive extends TestCase {
	
	private static Live l;
	private static Channel c;

	@BeforeAll
	static void setUpBeforeClass(){
		c = new Channel("canale per test");
		l = c.getLive();
	}

	@Test
	public void testStartLive() {
		//Exercise
		l.startLive("live di test", c);
		//Verify
		assertEquals(true, l.isOnAir());
	}

	@Test
	public void testCloseLive() {
		//Exercise
		l.stopLive(c);
		//Verify
		assertEquals(false, l.isOnAir());
	}

	@Test
	public void testAddComment() {
		String newComment = new String("commento di test");
		User u = new User("user di test");
		//Exercise
		l.addComment(newComment, u.getName());
		//Verify
		assertEquals(newComment, l.getComment(0).getComment());
		assertEquals(u.getName(), l.getComment(0).getName());
	}
}

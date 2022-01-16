package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import domainModel.Channel;
import domainModel.ChannelsPanel;
import domainModel.Topic;

class ChannelsPanelTest { 
	
	private static ChannelsPanel cp;
	
	@BeforeAll
	static void setUpBeforeClass(){
		cp = new ChannelsPanel() ;
	}
	@Test
	public void addNewChannelTest() {
		Channel c = new Channel("NomeCanale");
		//Exercise
		cp.addNewChannel(c);
		//Verify
	    assertEquals(c.getName(),cp.getChannel(0).getName());
	}
	@Test
	public void searchTest() {
		Channel c = new Channel("NomeCanale");
		String n = "NomeCanale";
		//Exercise
		cp.addNewChannel(c);
		//Verify
		assertEquals(c.getName(), cp.search(n).getName());
	}
	@Test
	public void searchByTopicTest() {
		Channel c = new Channel("NomeCanale");
		Topic t = new Topic("Games");
		c.setTopic(t);
		cp.addNewChannel(c);
		assertEquals(c, cp.searchByTopic(t));
	}

}

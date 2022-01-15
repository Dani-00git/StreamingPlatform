package tests;

	import static org.junit.jupiter.api.Assertions.*;
	import org.junit.jupiter.api.Test;
	import businessLogic.PageControllerStreamer;
	import static org.junit.Assert.assertEquals; 

	import org.junit.jupiter.api.AfterAll;
	import org.junit.jupiter.api.BeforeAll;
	import org.junit.jupiter.api.Order;
	import org.junit.jupiter.api.Test;

	import businessLogic.PageViewer;
	import domainModel.Channel;
	import domainModel.ChannelsPanel;
	import domainModel.RecommendedChannels;
	import domainModel.Streamer;
	import domainModel.Topic;
        
	class PageControllerStreamerTest {
		private static PageControllerStreamer pcs;
		private static ChannelsPanel cp;
		private static Channel c;
		private static Topic t;
		
		@BeforeAll
		static void setupBeforeClass( ) {
			ChannelsPanel cp = new ChannelsPanel();
			pcs = new PageControllerStreamer ("streamer di test", cp, "canale di test");
			c = cp.search("canale di test");
			t = new Topic("Gaming");
		}
		

		@Test
		void startLiveTest() { 
			//Exercise
			pcs.startLive("live");
			//Verify
		    assertEquals(true, c.getLive().isOnAir());
		    assertEquals("live", c.getLive().getName());
		    
		    
		}
		
		@Test
		void stopLiveTest() {
			//Exercise
			pcs.startLive("live");
			pcs.stopLive();
			//Verify
			assertEquals(false, c.getLive().isOnAir());
			assertEquals(null, c.getLive().getName());
		}
		
		@Test
		void addTopicTest() {
		    //Exercise
			pcs.setTopic(t);
			//Verify
			assertEquals("Gaming", c.getTopic());
		}
		
	}
		


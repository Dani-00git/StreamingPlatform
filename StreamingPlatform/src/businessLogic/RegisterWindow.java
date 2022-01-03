package businessLogic;

import domainModel.ChannelsPanel;

//
// Token for commit: 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
//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
//

public class RegisterWindow {
	
	public void login(String userName, String channelName, Boolean type, ChannelsPanel cp) {
		
		if(type) {
			PageControllerStreamer pgs = new PageControllerStreamer(userName, cp, channelName);
		}
		if(!type) {
			PageControllerUser pgu = new PageControllerUser(userName, cp);
		}
	}
}

package businessLogic;

//
// Token for commit: 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
//

public class RegisterWindow {
	
	public void login(String userName, Boolean type) {
		
		if(type) {
			PageControllerStreamer pgs = new PageControllerStreamer(userName);
		}
		if(!type) {
			PageControllerUser pgu = new PageControllerUser(userName);
		}
	}
}

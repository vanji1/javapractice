package JavaPractice;

public class EncapEx1 {
	
	
	public void launchBrowser(String browser) {
		
		if(browser.equals("chrome")){
			System.out.println("Launch Chrome Browser");
			chromeBrowser();
		}
		else if(browser.equals("firefox")) {
			System.out.println("Launch Firefox Browser");
			firefoxBrowser();
		}
		else {
				System.out.println("Lauch InternetExplorer Browser");
		}
	}
	
	private void chromeBrowser() {
		System.out.println("Chrome");
	}
	
	private void firefoxBrowser() {
		System.out.println("Firefox");
		
	}
	

}

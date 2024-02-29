package encapsulation;

public class Browser {
	
	// private methods has all the implementation details and we are hiding them by having them in private methods
	//public methods access them internally
	//here we are exposing only the required public method

	public void launchBrowser() {
		System.out.println("launch Browser");
		checkBrowserVersion();
		checkMemory();
	}
	
	private void checkBrowserVersion() {
		int version  = 100;
	}
	
	private void checkMemory() {
		System.out.println("check memory");
		
	}
}

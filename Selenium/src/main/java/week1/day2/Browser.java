package week1.day2;

public class Browser
{
	public String launchBrowser(String browserName) {
		System.out.println("Browser Landed Successfully");
		return browserName;
	}
	public void  loadUrl() {
		System.out.println("Application Loaded Successfully");
	}
	public static void main(String args[]) {
		Browser br = new Browser();
		br.launchBrowser("Chrome");
		br.loadUrl();
	}

}

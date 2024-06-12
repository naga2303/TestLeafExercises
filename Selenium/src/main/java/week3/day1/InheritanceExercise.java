package week3.day1;

public class InheritanceExercise {
    public static void main(String args[]){
        Chrome ch = new Chrome("chrome",23);
        ch.operURL();
        ch.openIncognito();
        ch.clearCache();
        ch.closeBrowser();
    }
}
 class Browser{
    public String browserName;
    public int browserVersion;
    public Browser(String br,int vr){
        browserName=br;
        browserVersion = vr;
    }
    public void operURL(){
        System.out.println("opened URL"+browserName+":"+browserVersion);
    }
    public void closeBrowser(){
        System.out.println("BrowserClosed");
    }
    public void navigateBack(){
        System.out.println("Navigated Back");
    }
}
class Chrome extends Browser{
    public Chrome(String br, int vr){
        super(br, vr);
    }
    public void openIncognito(){
        System.out.println("Opened Incognito");
    }
    public void clearCache(){
        System.out.println("Cache cleared");
    }
}
class Edge{
    public void takeSnap(){
        System.out.println("Snapshot taken");
    }
    public void clearCookies(){
        System.out.println("Cookies cleared");
    }
}
class Safari{
    public void readerMode(){
        System.out.println("Inreader mode");
    }
    public void fullScreenMode(){
        System.out.println("In Full Screen mode");
    }
}
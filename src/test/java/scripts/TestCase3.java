package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class TestCase3 extends BaseClass {
@Test
public void tc3() throws IOException, InterruptedException {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.searchtb(pdata.getData("search"));
	s.searchbtn();
	
	CoreJavaPage cj=new CoreJavaPage(driver);
	cj.corejava();
	
	WishlistPage w=new WishlistPage(driver);
	w.close();
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	w.playbtn();
	Thread.sleep(5000);
	w.pausebtn();
	driver.switchTo().defaultContent();
	w.addtowishlist();
}
}

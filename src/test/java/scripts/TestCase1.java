package scripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass {
@Test
public void tc1() {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsButton();
	s.demoapp();
}
}
package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
@FindBy(xpath="//a[text()='X']")
private WebElement close;

@FindBy(xpath="//div[@class='play-icon']")
private WebElement playbtn;

@FindBy(xpath="//div[@class='pause-icon']")
private WebElement pausebtn;

@FindBy(xpath="//span[text()='Add To Wishlist']")
private WebElement addtowishlist;

public WishlistPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void close() {
	close.click();
}

public void playbtn() {
	playbtn.click();
}

public void pausebtn() {
	pausebtn.click();
}

public void addtowishlist() {
	addtowishlist.click();
}
}

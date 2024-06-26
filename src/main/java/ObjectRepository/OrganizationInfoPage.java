package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement pageHeader;
	@FindBy(xpath="//a[@class='hdrLink']")
	private WebElement orgLink;
	
	//initization
	public OrganizationInfoPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
   //utilization
	public String getPageHeader()
	 {
		 return pageHeader.getText();
	 }
	public void clickOrgLink()
	{
		orgLink.click();
	}


}

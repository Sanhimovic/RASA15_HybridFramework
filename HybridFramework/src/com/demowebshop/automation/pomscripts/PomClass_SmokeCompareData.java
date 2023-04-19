package com.demowebshop.automation.pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass_SmokeCompareData 
{
	@FindBy(linkText = "Log in")
	private WebElement login_link;
	
	@FindBy(id="Email")
	private WebElement email_textfield;
	
	@FindBy(id="Password")
	private WebElement password_textfield;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement login_btn;
	
	@FindBy(xpath = "//ul[@class='top-menu']/li[1]/a")
	private WebElement books_tab;
	
	@FindBy(xpath = "//select[@id='products-orderby']")
	private WebElement sortBy_drop;
	
	@FindBy(xpath="//select[@id='products-pagesize']")
	private WebElement disp_drop;
	
	@FindBy(xpath = "//select[@id='products-viewmode']")
	private WebElement view_drop;
	
	@FindBy(xpath = "//a[text()='Computing and Internet']/../following-sibling::div[3]/div[2]/input")
	private WebElement computing_addtocart;
	
	@FindBy(xpath = "//a[text()='Fiction']/../following-sibling::div[3]/div[2]/input")
	private WebElement fiction_addtocart;
	
	@FindBy(xpath = "//a[text()='Health Book']/../following-sibling::div[3]/div[2]/input")
	private WebElement health_addtocart;
	
	@FindBy(linkText = "Fiction")
	private WebElement fiction_link;
	
	@FindBy(xpath = "//span[@title='Close']")
	private WebElement info_pop;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement cart_link;
	
	@FindBy(xpath = "//h1[text()='Shopping cart']/../following-sibling::div[1]/div[1]/form[1]/table[1]/tbody/tr[1]/td[6]")
	private WebElement computing_price;
	
	@FindBy(xpath = "//h1[text()='Shopping cart']/../following-sibling::div[1]/div[1]/form[1]/table[1]/tbody/tr[2]/td[6]")
	private WebElement fiction_price;
	
	@FindBy(xpath = "//h1[text()='Shopping cart']/../following-sibling::div[1]/div[1]/form[1]/table[1]/tbody/tr[3]/td[6]")
	private WebElement health_price;
	
	@FindBy(xpath = "//h1[text()='Shopping cart']/../following-sibling::div[1]/div[1]/form[1]/table[1]/tbody/tr[1]/td[1]")
	private WebElement computing_cbox;
	
	@FindBy(xpath = "//h1[text()='Shopping cart']/../following-sibling::div[1]/div[1]/form[1]/table[1]/tbody/tr[2]/td[1]")
	private WebElement fiction_cbox;
	
	@FindBy(xpath = "//h1[text()='Shopping cart']/../following-sibling::div[1]/div[1]/form[1]/table[1]/tbody/tr[3]/td[1]")
	private WebElement health_cbox;
	
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement update_cart;
	
	public PomClass_SmokeCompareData(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement login_Link()
	{
		return login_link;
	}
	
	public WebElement email_text()
	{
		return email_textfield;
	}
	
	public WebElement pass_text()
	{
		return password_textfield;
	}
	
	public WebElement login_button()
	{
		return login_btn;
	}
	
	public WebElement books_Tab()
	{
		return books_tab;
	}
	
	public WebElement sort_dropdown()
	{
		return sortBy_drop;
	}
	
	public WebElement disp_dropdown()
	{
		return disp_drop;
	}
	
	public WebElement view_dropdown()
	{
		return view_drop;
	}
	
	public WebElement computing()
	{
		return computing_addtocart;
	}
	
	public WebElement fiction()
	{
		return fiction_addtocart;
	}
	
	public WebElement health()
	{
		return health_addtocart;
	}
	
	public WebElement fictionlink()
	{
		return fiction_link;
	}
	
	public WebElement infopop()
	{
		return info_pop;
	}
	
	public WebElement shoppingCart()
	{
		return cart_link;
	}
	
	public WebElement computingPrice()
	{
		return computing_price;
	}
	
	public WebElement fictionPrice()
	{
		return fiction_price;
	}
	
	public WebElement healthPrice()
	{
		return health_price;
	}
	
	public WebElement computingCbox()
	{
		return computing_cbox;
	}
	
	public WebElement healthCbox()
	{
		return health_cbox;
	}
	
	public WebElement fictionCbox()
	{
		return fiction_cbox;
	}
	
	public WebElement updateCart()
	{
		return update_cart;
	}
}

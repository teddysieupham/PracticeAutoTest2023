package PageObjectModel;

public class MenuBar extends BasePage{
	 private String lnkShopMenuLocator="//li[@id='menu-item-40']/a[1]";
	 private String btnHomeLocator="//div[@id='site-logo']/a[1]";
	public String getLnkShopMenuLocator() {
		return lnkShopMenuLocator;
	}
	public void setLnkShopMenuLocator(String lnkShopMenuLocator) {
		this.lnkShopMenuLocator = lnkShopMenuLocator;
	}
	public String getBtnHomeLocator() {
		return btnHomeLocator;
	}
	public void setBtnHomeLocator(String btnHomeLocator) {
		this.btnHomeLocator = btnHomeLocator;
	}
	public MenuBar() {
		super();
	}
	 
	 
	
//	 private void clickOnShopMenu(){
//	        BasePage.clickElement(this.lnkShopMenuLocator);
//	    }
//	 private void goToHome(){
//	        BasePage.clickElement(this.btnHomeLocator);
//	    }
}

package PageObjectModel;

public class ProductPage extends BasePage{
	private String btn_AddBasket_Locator = "//button[@type='submit']";

	public String getBtn_AddBasket_Locator() {
		return btn_AddBasket_Locator;
	}

	public void setBtn_AddBasket_Locator(String btn_AddBasket_Locator) {
		this.btn_AddBasket_Locator = btn_AddBasket_Locator;
	}

	public ProductPage() {
		super();
	}
	
}

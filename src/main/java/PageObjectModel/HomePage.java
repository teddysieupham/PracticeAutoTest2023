package PageObjectModel;

import java.util.HashMap;
import java.util.Map;

public class HomePage extends BasePage {
	private String siderLocator="//div[@class='n2-ss-slider-2']/div/div";
	private String arrvialsLocator ="//div[@class='tb-column-inner']//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div";

	private Map<String,String> listImage =new HashMap<String, String>();
	public HomePage() {
		super();
		listImage.put("Selenium Ruby", "//img[@title='Selenium Ruby']");
		listImage.put("Thinking in HTML", "//img[@title='Thinking in HTML']");
		listImage.put("Mastering JavaScript", "//img[@title='Mastering JavaScript']");
	}

	public String getSiderLocator() {
		return siderLocator;
	}

	public void setSiderLocator(String siderLocator) {
		this.siderLocator = siderLocator;
	}

	public Map<String, String> getListImage() {
		return listImage;
	}

	public void setListImage(Map<String, String> listImage) {
		this.listImage = listImage;
	}

	public String getArrvialsLocator() {
		return arrvialsLocator;
	}

	public void setArrvialsLocator(String arrvialsLocator) {
		this.arrvialsLocator = arrvialsLocator;
	}
	
}

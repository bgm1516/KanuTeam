package com.kanu.web.orders;

public class MenuVO {
	
	private String menu_id;
	private String menu_name;
	private String price;
	
	public String getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MenuVO [menu_id=" + menu_id + ", menu_name=" + menu_name + ", price=" + price + "]";
	}
	
	
}

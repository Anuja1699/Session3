package Session;

public class Item {
private String itemName;
private int itemPrice;
public static void main(String[] args) {
	
}
@Override
public String toString() {
	return "Item [itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public int getItemPrice() {
	return itemPrice;
}
public void setItemPrice(int itemPrice) {
	this.itemPrice = itemPrice;
}
public Item(String itemName, int itemPrice) {
	super();
	this.itemName = itemName;
	this.itemPrice = itemPrice;
}
}

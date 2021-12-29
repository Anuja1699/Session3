package Session;

public class Shopping {
private int cardNo;
private String cardName;
public Shopping(int cardNo, String cardName) {
	super();
	this.cardNo = cardNo;
	this.cardName = cardName;
}
public int getCardNo() {
	return cardNo;
}
public void setCardNo(int cardNo) {
	this.cardNo = cardNo;
}
public String getCardName() {
	return cardName;
}
public void setCardName(String cardName) {
	this.cardName = cardName;
}
@Override
public String toString() {
	return "shopping [cardNo=" + cardNo + ", cardName=" + cardName + "]";
}


}

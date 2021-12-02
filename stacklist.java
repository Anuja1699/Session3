package sample;

public class StackList 
{
public int data;
public StackList next;

public StackList(int data)
{
	
	this.data=data;
	this.next=null;
}
public int getData() {
	return data;
}
public void setData(int data)
{
	this.data = data;
}
public StackList getNext() {
	return next;
}
public void setNext(StackList next) {
	this.next = next;
}
public String toString() {
	return data +"-->>";
}
}	

package sample;
import java.util.EmptyStackException;
public class LinkedList {
private int length;
private StackList top;

public LinkedList() {
	length=0;
	top=null;
}
public void push(int data) {
	StackList sl=new StackList(data);
	sl.setNext(top);
	top=sl;
	length++;
}
public boolean isEmpty() {
	return (length==0);
	
}
public int pop()throws EmptyStackException{
	if(isEmpty()) {
		throw new EmptyStackException();
	}
	int res=top.getData();
	top=top.getNext();
	length--;
	return res;
}
public int size() {
	return length;
}
public String toString() {
	String str="";
	StackList sl=top;
	while(sl!=null) {
		str=str+sl.toString()+"->>";
		sl=sl.getNext();
	}
	return str;
}

}


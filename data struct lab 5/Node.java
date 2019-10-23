
public class Node {
	private GiftBasket data = new GiftBasket();
	private Node next;
	
	Node(){
		setNext(null);
	}
	
	Node(GiftBasket data){
		this.setData(data);
	}
	Node(GiftBasket data, Node next){
		this.setData(data);
		this.setNext(null);
	}

	public GiftBasket getData() {
		return data;
	}

	public void setData(GiftBasket data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	

	

}

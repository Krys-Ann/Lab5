
public class GiftList {
	private Node head;
	
	public GiftList(){
		head = null;
	}
	
	public boolean add(GiftBasket gb ) {
		return false;
	}
	
	public boolean isEmpty() {
		if(head==null)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		Node temp = new Node();
		
		if(temp==null)
			return true;
		
		else
			return false;
	}
	
	public boolean addGiftBasketToEnd(GiftBasket data) {
	
		if(isFull()) {
			System.out.println("List is full, unable to add\n");
		}
		
		else {
			
			Node nextItem = new Node();
			
			nextItem.setData(data);
			
			if (isEmpty()) 
				head = nextItem; 

			else {
				Node temp = head;
				
				while (temp.getNext() !=null) {
					
					temp = temp.getNext();
				}
				temp.setNext(nextItem);
			}
				
		}
		
		return false;
		
	}
	
	public void showAllGiftBaskets() {
		if (isEmpty()) 
			System.out.println("List is Empty\n");
		
		else {
			Node temp = head;
			while (temp !=null) {
				temp.getData().display();
				temp = temp.getNext();
			}
		}
	}

}

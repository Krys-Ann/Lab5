
public class GiftBasket {
	private int id;
	private String type;
	private float cost;
	
	GiftBasket(){
		id = 0;
		type = "";
		cost = 0;
	}
	
	GiftBasket(int d, String tp, float cst){
		id = d;
		type = tp;
		cost = ct;
	}
	
	public int getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public float getCost() {
		return cost;
	}
	
	public void setId(int d) {
		id = d;
	}
	public void setType(String tp) {
		type = tp;
	}
	public void setCost(float cst) {
		cost = cst;
	}
	
	public void display() {
		System.out.println("ID= "+ getId() + " | Type= "+ getType() + " | Cost= $" + getCost());
	}
	
	

}

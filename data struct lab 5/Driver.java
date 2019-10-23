
public class Driver {

	public static void main(String[] args) {
		
		GiftList list = new GiftList();
		
		
		GiftBasket giftbasket1 = new GiftBasket(1,"Wedding Basket", 5210);
		GiftBasket giftbasket2 = new GiftBasket(2, "School Basket", 1400);
		GiftBasket giftbasket3 = new GiftBasket(3, "Work Basket", 6750);
		

	
		list.addGiftBasketToEnd(giftbasket1);
		list.addGiftBasketToEnd(giftbasket2);
		list.addGiftBasketToEnd(giftbasket3);
		

		list.showAllGiftBaskets();
		

	}

}

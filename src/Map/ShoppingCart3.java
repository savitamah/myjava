package Map;
import java.util.*;

public class ShoppingCart3 {
	
	  String itemName;
	  double itemPrice;
	  double itemQuantity;
	  int total_no_of_userItem;
	  double total_price=0;
	  int total_no_item;
	  Scanner sc=new Scanner(System.in);
	  public int CountItem() {
		 System.out.print("How many product available in your store room");
		 total_no_item=sc.nextInt();
	  return total_no_item;
	  }
	  public String itemName() {
		System.out.println("Enter Item name:");
	    itemName=sc.next();  
	  return itemName;
	  }
	  public double itemPrice() {
		 System.out.println("Enter Item price:");
	     itemPrice=sc.nextDouble(); 
	  return itemPrice;
	  }
	  
	  public HashMap<String,Double> availableItem(){
		
	  HashMap<String, Double> countPrice=new HashMap<>();  
	    CountItem();
	    for(int i=0; i<total_no_item; i++) {
	    	itemName();
	    	itemPrice();
			countPrice.put(itemName, itemPrice);
			}
	 return countPrice;
    	}
	 public int countUserItem() {
	   System.out.println("How many item user want:");
	   total_no_of_userItem=sc.nextInt();
	 return total_no_of_userItem; 
	   }
     public String userItemName() {
	   System.out.println("Enter Item name:");
	   itemName =sc.next();
	 return itemName;
	   }
   	 public double userItemQuantity() {
	   System.out.println("Enter Item quantity:");
	   itemQuantity=sc.nextDouble();	
	 return itemQuantity;
	   }
	 public void user_takesItem(){
	   HashMap<String,Double> price=availableItem();
	   countUserItem();
	   for(int i=0; i<total_no_of_userItem; i++) {
			userItemName();
			userItemQuantity();
		    double price_of_each_item=itemQuantity*price.get(itemName);
			System.out.println("total price of"+ itemName +":"+ price_of_each_item);
			total_price=total_price + price_of_each_item;
		  }
		 
	 System.out.print("Total item price:"+total_price);
   }
 public static void main(String args[]) {
	ShoppingCart ob=new ShoppingCart ();
	ob.user_takesItem();
    	
    }
}

package Map;
import java.util.*;

public class ShoppingCart {
	
	  String itemName;
	  double itemPrice;
	  double itemQuantity;
	  int toal_no_of_userItem;
	  double total_price=0;
	  
	
		
	
	  public HashMap<String,Double> availableItem(){
		
		 
		  HashMap<String, Double> countPrice=new HashMap<>();  
		Scanner sc=new Scanner(System.in);
		System.out.print("How many product available in your store room");
		int total_no_item=sc.nextInt();
	
		
	    for(int i=0; i<total_no_item; i++) {
	    	System.out.println("Enter Item name:");
	    	itemName=sc.next();
	    	System.out.println("Enter Item price:");
	    	itemPrice=sc.nextDouble();
			countPrice.put(itemName, itemPrice);
			}
		return countPrice;
	}
	  public void user_takesItem(){
			
		  HashMap<String,Double> price=availableItem();
		  Scanner sc=new Scanner(System.in);
		  System.out.println("How many item user want:");
		  toal_no_of_userItem=sc.nextInt();
		  for(int i=0; i<toal_no_of_userItem; i++) {
			  System.out.println("Enter Item name:");
			  itemName =sc.next();
			  System.out.println("Enter Item quantity:");
			  itemQuantity=sc.nextDouble();	
			 // System.out.println("ItemName:"+itemName);
			//  System.out.println(itemName+"quantity"+":"+itemQuantity);
			//  System.out.print("Item Price");
			//  System.out.println(price.get(itemName));
			 
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

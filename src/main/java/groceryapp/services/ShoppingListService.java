package groceryapp.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import groceryapp.models.ShoppingList;

@Service 
public class ShoppingListService {

	private List<ShoppingList> shoppingLists;
	
	public ShoppingListService() {
		
		this.shoppingLists = new ArrayList<ShoppingList>(); 
		
		this.shoppingLists.add(new ShoppingList(1,"HEB")); 
		this.shoppingLists.add(new ShoppingList(2,"Walmart"));
		this.shoppingLists.add(new ShoppingList(3,"Fiesta")); 
		
	} 
	
	public void deleteShoppingList(int shoppingListId) {
		
		ShoppingList shoppingList = getShoppingListById(shoppingListId); 
		this.shoppingLists.remove(shoppingList);
	}
	
	public void addShoppingList(ShoppingList shoppingList) {
		this.shoppingLists.add(shoppingList);
	}
	
	public ShoppingList getShoppingListById(int shoppingListId) {
		return this.shoppingLists.stream().filter(x -> x.getShoppingListId() == shoppingListId).findFirst().get();	
	}

	public List<ShoppingList> getAllShoppingLists() {
		return this.shoppingLists; 
	}
	
}

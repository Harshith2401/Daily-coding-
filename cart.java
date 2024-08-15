/*Assignment 1:-
Create a class ShoppingList which will contain the list of all the items that are there to
shop from.
Create another class ShoppingCart that will extend ShoppingList, there will be a
method price in ShoppingCart, which will calculate the price of the shopping item.
Create one more class wallet which will extend ShoppingCart, there will be different
methods in the wallet class, which will generate the bill and update and recharge the
wallet balance accordingly.
Note - It will also display an appropriate message if the wallet balance is less than the
shopping cart value */
import java.util.HashMap;
import java.util.Map;
class ShoppingList
{
    protected Map<String, Double> items;
    public ShoppingList() 
    {
        // Initialize a map to store items and their prices
        items = new HashMap<>();
    }
    public void addItem(String itemName, double price) 
    {
        // Add an item with its price to the shopping list
        items.put(itemName, price);
    }
class ShoppingCart extends ShoppingList
{

}
class Wallet extends ShoppingCart
{

}

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
/*import java.util.HashMap;
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

}*/
import java.util.HashMap;
import java.util.Map;

class ShoppingList {
    protected Map<String, Double> items;

    public ShoppingList() {
        // Initialize a map to store items and their prices
        items = new HashMap<>();
    }

    public void addItem(String itemName, double price) {
        // Add an item with its price to the shopping list
        items.put(itemName, price);
    }

    public void displayItems() {
        // Display all items in the shopping list
        System.out.println("Items available for shopping:");
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }
}

class ShoppingCart extends ShoppingList {
    protected Map<String, Integer> cart;

    public ShoppingCart() {
        // Initialize the parent class and an empty map for the cart
        super();
        cart = new HashMap<>();
    }

    public void addToCart(String itemName, int quantity) {
        // Add an item to the shopping cart if it's available in the shopping list
        if (items.containsKey(itemName)) {
            cart.put(itemName, cart.getOrDefault(itemName, 0) + quantity);
            System.out.println("Added " + quantity + " x " + itemName + " to cart.");
        } else {
            System.out.println(itemName + " is not available in the shopping list.");
        }
    }

    public void displayCart() {
        // Display all items in the shopping cart
        if (!cart.isEmpty()) {
            System.out.println("Items in your shopping cart:");
            for (Map.Entry<String, Integer> entry : cart.entrySet()) {
                String itemName = entry.getKey();
                int quantity = entry.getValue();
                double price = items.get(itemName);
                System.out.println(itemName + ": " + quantity + " x $" + price + " = $" + (price * quantity));
            }
        } else {
            System.out.println("Your shopping cart is empty.");
        }
    }

    public double calculateTotal() {
        // Calculate the total price of items in the shopping car
        double totalPrice = 0.0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String itemName = entry.getKey();
            int quantity = entry.getValue();
            totalPrice += items.get(itemName) * quantity;
        }
        return totalPrice;
    }
}

class Wallet extends ShoppingCart {
    private double balance;

    public Wallet(double initialBalance) {
        // Initialize the parent class and set the wallet balance
        super();
        this.balance = initialBalance;
    }

    public void generateBill() {
        // Calculate the total price and generate the bill
        double totalPrice = calculateTotal();
        System.out.println("Total bill: $" + totalPrice);
        if (balance >= totalPrice) {
            balance -= totalPrice;
            System.out.println("Purchase successful! Your new wallet balance is: $" + balance);
            cart.clear();  // Clear the cart after a successful purchase
        } else {
            System.out.println("Insufficient balance! You need an additional $" + (totalPrice - balance) + " to complete the purchase.");
        }
    }

    public void rechargeWallet(double amount) {
        // Recharge the wallet balance
        balance += amount;
        System.out.println("Wallet recharged! Your new balance is: $" + balance);
    }

    public void displayBalance() {
        // Display the current wallet balance
        System.out.println("Current wallet balance: $" + balance);
    }
}

public class cart {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet(100);  // Initialize wallet with a balance of $100
        myWallet.addItem("Shirt", 30);  // Add items to the shopping list
        myWallet.addItem("Jeans", 50);
        myWallet.addItem("Shoes", 70);

        myWallet.displayItems();  // Display items in the shopping list

        myWallet.addToCart("Shirt", 2);  // Add items to the cart
        myWallet.addToCart("Jeans", 1);
        myWallet.displayCart();  // Display items in the cart

        myWallet.generateBill();  // Generate the bill and deduct from the wallet balance

        myWallet.rechargeWallet(50);  // Recharge wallet balance
        myWallet.generateBill();  // Try generating the bill again
    }
}


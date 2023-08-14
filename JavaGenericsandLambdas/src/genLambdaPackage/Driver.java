package genLambdaPackage;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create instances of Product
        Product product1 = new Product("Item 1", 10.99);
        Product product2 = new Product("Item 2", 5.99);
        Product product3 = new Product("Item 3", 7.49);

        // Create an instance of Inventory
        Inventory<Product> myInventory = new Inventory<>();

        // Add products to the inventory
        myInventory.addItem(product1);
        myInventory.addItem(product2);
        myInventory.addItem(product3);

        // Calculate the total price of all products
        double priceTotal = myInventory.getAllItems()
                .stream()
                .mapToDouble(product -> product.price)
                .sum();

        // Print the total price
        System.out.println("Total Price of Products: $" + priceTotal);

        // Remove an item from the inventory
        myInventory.removeItems(product2);

        // Get the number of items in the inventory
        int numberOfItems = myInventory.getItemCount();
        System.out.println("Number of Items in Inventory: " + numberOfItems);
	}

}

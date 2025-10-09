import java.io.*;
import java.util.*;
//CashRegister:
// Reads product information from the file.
// Maintains a list of scanned items.
// Provides methods to add an item by UPC and calculate the running subtotal.

public class Model {
	 // product list from file (UPC : price)
	 private Map<String, Double> products = new HashMap<>();

	 //scanned items
	 private List<String> scannedItems = new ArrayList<>();
	 private double subtotal = 0.0;
	 
	 public Model() {
	  	loadProducts("products.txt");
	 }

	 //populate the model from the file
	 private void loadProducts(String filename){
		 try (java.util.Scanner fileScanner = new java.util.Scanner(new File(filename))){
			 while (fileScanner.hasNext()){
				 String upc = fileScanner.next();
				 String name = fileScanner.next();
				 double price = fileScanner.nextDouble();

				 products.put(upc+","+name, price);
			 }
		 }
		 catch (FileNotFoundException e){
			 System.out.println("File not found: "+filename);
		 }
	 }

	 //add item to list and update subtotal
	 public void addItem(String upc, String product, double price){
		 scannedItems.add(product + " - $"+price);
		 subtotal+=price;
	 }

	 //getters
	 public List<String> getScannedItems() {
		 return scannedItems;
	 }
	 public double getSubtotal(){
		 return subtotal;
	 }
	 public Map<String, Double> getProducts(){
		 return products;
	}
}

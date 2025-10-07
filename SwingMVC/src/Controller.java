import javax.swing.JOptionPane;
import java.util.*;
 
public class Controller {
	 private Model model;
	 private View view;
	 private Scanner scanner;
	 
	 public Controller(Model m, View v) {
		  model = m;
		  view = v;
		  this.scanner = new Scanner();
	 }

	 public void initController() {
		 scanner.addScanListener(e -> handleScan());
	 }
	 
	private void handleScan(){
		 int upc = scanner.performScan();
		 if (upc == 0) return;

		 Map<String, Double> products = model.getProducts();

		 for (String key : products.keySet()){
			 String[] parts = key.split(",");
			 int modelUpc = Integer.parseInt(parts[0]);

			 if(modelUpc == upc){
				 String product = parts[1];
				 double price = products.get(key);
				 model.addItem(String.valueOf(upc), product, price);
				 view.update(model.getScannedItems(), model.getSubtotal());
				 return;
			 }
		 }
		 System.out.println("UPC not found: "+upc);
	}
	 
}

import java.awt.BorderLayout;

import javax.swing.*;
import java.util.List;

// Display:
// Shows a scrollable list of all scanned items with their prices.
// Displays the running subtotal at the bottom.


public class View {
	// View uses Swing framework to display UI to user
	 private JFrame frame;
	 //running subtotal
	 private JLabel subtotalLabel;
	 //scrollable list
	 private JTextArea itemList;

	 
	 public View(String title) {
	  frame = new JFrame(title);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setSize(500, 120);
	  frame.setLocationRelativeTo(null);
	  frame.setVisible(true);
	 
	  // Create UI elements
	  subtotalLabel = new JLabel("Subtotal: $0.00");
	  itemList = new JTextArea();
	  itemList.setEditable(false);
	  JScrollPane scrollPane = new JScrollPane(itemList);

	  // Add UI element to frame
	  GroupLayout layout = new GroupLayout(frame.getContentPane());
	  frame.getContentPane().setLayout(layout);
	  layout.setAutoCreateGaps(true);
	  layout.setAutoCreateContainerGaps(true);

	  layout.setHorizontalGroup(
			  layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					  .addComponent(scrollPane)
					  .addComponent(subtotalLabel)
	  );

	  layout.setVerticalGroup(
			  layout.createSequentialGroup()
					  .addComponent(scrollPane)
					  .addComponent(subtotalLabel)
	  );
	 }
	 
	 public JFrame getFrame() {
	  return frame;
	 }
	 
	 public void setFrame(JFrame frame) {
	  this.frame = frame;
	 }

	 //update the scrollable list and the running subtotal
	 public void update(List<String> items, double subtotal){
		 itemList.setText("");
		 for (String i:items){
			 itemList.append(i + "\n");
		 }
		 subtotalLabel.setText(String.format("Subtotal: $%.2f", subtotal));
	 }
}

// This window emulates the scanning of an item. Every time the buttom is pressed
// it will send a notification of a UPC code

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;


public class Scanner {
	// Scanner uses Swing framework to create a UPC code
	private JFrame frame;
	private JPanel scannerPanel;
	private JButton scanButton;

	public Scanner() {
		frame = new JFrame("Scanner");
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100, 100);
		frame.setLocation(300,50);
		frame.setVisible(true);


		// Create UI elements
		scanButton = new JButton("Scan");
		scannerPanel = new JPanel();

		// Add UI element to frame
		scannerPanel.add(scanButton);
		frame.getContentPane().add(scannerPanel);
	}

	//randomly generate UPC from products.txt
	private int generateUPC() {
		int upc=0;
		Random rand = new Random();

		List<String> lines = new ArrayList<>();
		try (java.util.Scanner fileScanner = new java.util.Scanner(new File("products.txt"))){
			while (fileScanner.hasNextLine()){
				lines.add(fileScanner.nextLine());
			}
			if (!lines.isEmpty()){
				String line = lines.get(rand.nextInt(lines.size()));
				String[] parts = line.split(" ");
				upc=Integer.parseInt(parts[0]);
				System.out.println("Scanned UPC: "+upc);
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Error reading products.txt");
		}

		return upc;
	}

	//allow controller to "subscribe" to scanning events (like the Observer pattern!)
	public void addScanListener(ActionListener listener){
		scanButton.addActionListener(listener);
	}

	//needed this to keep generateUPC private
	public int performScan(){
		return generateUPC();
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JPanel getScannerPanel() {
		return scannerPanel;
	}

	public void setScannerPanel(JPanel scannerPanel) {
		this.scannerPanel = scannerPanel;
	}

	public JButton getScanButton() {
		return scanButton;
	}

	public void setScanButton(JButton scanButton) {
		this.scanButton = scanButton;
	}


}
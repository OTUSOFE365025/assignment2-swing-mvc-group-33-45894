
1. The main purpose of the Java Swing Framework is to build Graphical User Interface (GUI) applications. It provides a set of platform-independent components for creating new tabs or windows, buttons, menus, text boxes, tables, and a lot more. This demonstrates that the framework's primary purpose is to facilitate the creation of interactive desktop applications that can run on any platform.

Class Diagram:<br />
<img width="904" height="749" alt="image" src="https://github.com/user-attachments/assets/7d68c29d-241b-46bc-82f0-95dd9862a451" /><br />
[Download PDF](https://github.com/user-attachments/files/22757101/Architecture.Assignment.2.-.Class.Diagram_.Lucidchart.pdf)


2. This example demonstrates the MVC design pattern by organizing the application into three different components that separate data, user interface, and control logic. The Model class stores the user’s first and last names and provides getter and setter methods to manage the data. The View class creates the GUIs using Java Swing components such as text fields, labels, and buttons, allowing users to enter and interact with information. The Controller connects these two parts by listening for user actions in the View, such as clicking the “Save” or “Hello” buttons, then updating the Model data, which gives feedback messages. This structure ensures that the Model never directly interacts with the user interface, and the View does not perform any data processing, maintaining a clear separation. However, this implementation differs from the conventional MVC pattern described in lectures because it employs a passive MVC approach. In this version, the Controller explicitly updates the View after modifying the Model, where in a traditional MVC, the Model would automatically notify the View of changes using an observer or listener structure. The program still effectively follows MVC principles by keeping the code modular and organized
   
3. How to run: Import into your IDE. Once the code is running, you will see 2 windows. Every time you click "Scan," an item will be randomly selected from products.txt and added to the second scrollable window, displaying each item, its price, and the running subtotal.
   Test:<br />
   <img width="1205" height="616" alt="Screenshot 2025-10-08 233557" src="https://github.com/user-attachments/assets/cbfb026b-5f38-4cb5-bab8-ddf7f056269d" />





Sequence Diagram for Question 4:<br />
<img width="760" height="569" alt="image" src="https://github.com/user-attachments/assets/7e9b7278-27ec-4065-afd7-64408a76fe07" />

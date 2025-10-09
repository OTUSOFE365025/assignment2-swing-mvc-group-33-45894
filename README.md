
1. The main purpose of the Java Swing Framework is to build Graphical User Interface (GUI) applications. It provides a set of platform-independent components for creating new tabs or windows, buttons, menus, text boxes, tables, and a lot more. This demonstrates that the framework's primary purpose is to facilitate the creation of interactive desktop applications that can run on any platform.

Class Diagram:
<img width="904" height="749" alt="image" src="https://github.com/user-attachments/assets/7d68c29d-241b-46bc-82f0-95dd9862a451" />
[Download PDF](https://github.com/user-attachments/files/22757101/Architecture.Assignment.2.-.Class.Diagram_.Lucidchart.pdf)


2. The classes in this program follow the MVC design pattern by separating the application’s data, interface, and logic into different components. The Model class stores and manages the data by loading products from a file, tracking scanned items, and calculating the subtotal. The View class is responsible for displaying information to the user through a Swing interface that shows the list of items and the running total. The Controller serves as the connection between the Model and View—it listens for user actions from the Scanner window, updates the Model based on those actions, and then tells the View to refresh. This implementation represents a passive form of MVC, where the Controller handles updates to the View instead of the Model notifying the View directly. In conventional MVC, the Model automatically communicates changes to the View (Observer pattern). However, in this Swing version, the Controller takes that responsibility, which simplifies the refreshing while still keeping the code component-based and organized.




Sequence Diagram for Question 4:
<img width="791" height="577" alt="image" src="https://github.com/user-attachments/assets/7da510a6-5c3f-4175-80db-0e822e719d38" />

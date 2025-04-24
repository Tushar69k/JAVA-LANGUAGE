// Not Done
//package Exam;
//
//import java.applet.Applet;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Applet {
//
//
//    /* <applet code="AddApplet" width=300 height=150></applet> */
//
//    public class AddApplet extends Applet implements ActionListener {
//        TextField t1, t2, t3;
//        Button addButton;
//
//        public void init() {
//            // Create text fields
//            t1 = new TextField(10);
//            t2 = new TextField(10);
//            t3 = new TextField(10);
//            t3.setEditable(false); // Result field should not be editable
//
//            // Create button
//            addButton = new Button("Add");
//
//            // Add action listener to button
//            addButton.addActionListener(this);
//
//            // Add components to applet
//            add(new Label("Number 1:"));
//            add(t1);
//            add(new Label("Number 2:"));
//            add(t2);
//            add(addButton);
//            add(new Label("Sum:"));
//            add(t3);
//        }
//
//        public void actionPerformed(ActionEvent e) {
//            try {
//                int num1 = Integer.parseInt(t1.getText());
//                int num2 = Integer.parseInt(t2.getText());
//                int sum = num1 + num2;
//                t3.setText(String.valueOf(sum));
//            } catch (NumberFormatException ex) {
//                t3.setText("Invalid input");
//            }
//        }
//    }
//
//
//}

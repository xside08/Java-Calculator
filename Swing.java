package Lesson5;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Swing {

//	public static void main(String[] args) {
//		
//		JFrame frame = new JFrame("My frist app");
//		JButton button = new JButton("Click");
//		JLabel label = new JLabel("empty");
//		JTextField field = new JTextField(10);
//		JPanel panel = new JPanel();
//		panel.add(button);
//		panel.add(label);
//		panel.add(field);
//		frame.add(panel);
//		
//		
//		button.addActionListener (new AbstractAction(){
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String text = field.getText();
//				label.setText(text);
//				field.setText("");
//			}
//			
//			
//		});
//		
	static int balance = 1000;	
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Terminal");
		JLabel label = new JLabel("Balance:"+balance);
		JTextField field = new JTextField(10);
		JButton button1 = new JButton("Add");
		JButton button2 = new JButton("Credit");
		JPanel panel = new JPanel();
		
		panel.add(label);
		panel.add(field);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		
		
		button1.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				String textNum = text.replaceAll("[^0-9]","");
				int num = Integer.parseInt(textNum);//перевели із стрінга в інт
				balance+=num;
				label.setText("Balance:"+balance);
				field.setText("");
			}
			
			
		});
		button2.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				String textNum = text.replaceAll("[^0-9]","");
				int num = Integer.parseInt(textNum);//перевели із стрінга в інт
				balance-=num;
				label.setText("Balance:"+balance);
				field.setText("");
			}
			
			
		});
//		
//		frame.setVisible(true);
//		frame.setSize(300,300);
		
		frame.setVisible(true);
		frame.setSize(190,300);


	}

}

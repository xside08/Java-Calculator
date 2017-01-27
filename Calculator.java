package Lesson5;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Calculator {
	
	static int balance = 0;	
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Calculator");
		JLabel label = new JLabel("Input:  ");
		JLabel empty = new JLabel("");
		JLabel empty1 = new JLabel("");
		JLabel empty2 = new JLabel("");
		JLabel name = new JLabel("Made by Maks");
		JButton footer = new JButton("RESULT");
		JLabel label1 = new JLabel("Result:");
		JTextField field = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton buttonPlus = new JButton("+");
		JButton button0 = new JButton("0");
		JButton buttonMinus = new JButton("-");
		JButton buttonIncrease = new JButton("*");
		JButton buttonReset = new JButton("RESET");
		JButton buttonDivide = new JButton("/");
		JButton buttonDot = new JButton(".");
		JButton buttonDelete = new JButton("C");
		
		JPanel panel = new JPanel();
		
		//panel.add(label1);
		panel.add(label);
		panel.add(field);
		panel.add(label1);
		panel.add(field2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(buttonPlus);
		panel.add(buttonMinus);
		panel.add(buttonIncrease);
		panel.add(buttonDivide);
		panel.add(buttonDot);
		panel.add(buttonDelete);
		panel.add(buttonReset);
		panel.add(footer);
		panel.add(empty);
		
		
		frame.add(panel);
		field2.setText("0");
		
		
		button1.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				field.setText(text+"1");
			}
			
			
		});
		button2.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				field.setText(text+"2");
			}
		});
		button3.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				field.setText(text+"3");
			}
		});
		button4.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				field.setText(text+"4");
			}
		});
		button5.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				field.setText(text+"5");
			}
		});
		button6.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				field.setText(text+"6");
			}
		});
		button7.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				field.setText(text+"7");
			}
		});
		button8.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				field.setText(text+"8");
			}
		});
		button9.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				field.setText(text+"9");
			}
		});
		button0.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				field.setText(text+"0");
			}
		});
		buttonPlus.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				if (text.isEmpty()){
					field.setText("");
				}
				else
				{
					field.setText(text+"+");
				}
			}
		});
		buttonMinus.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				if(text.length()==1){
					if(text.contains("-")){
					}
					else{
						field.setText(text+"-");						
					}
				}
				else{
					if(text.contains("-")){
						
					}
					else
					{
						field.setText(text+"-");
					}
				}
				
			}
		});
		buttonIncrease.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				if(text.isEmpty()){
					field.setText("");
				}
				else{
					field.setText(text+"*");
				}
				
			}
		});
		buttonDivide.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				if(text.isEmpty()){
					field.setText("");
				}
				else{
					field.setText(text+"/");
				}
				
			}
		});
		buttonDot.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				text = text.replaceAll("[a-zA-Z]", "");
				if(text.isEmpty()){
					field.setText("0.");
				}
				else{
					if(text.contains(".")){
						if(text.contains("+")||text.contains("-")||text.contains("/")||text.contains("*")){
							String LastChar = text.substring(text.length()-1, text.length());
								if (LastChar.contains("+")||LastChar.contains("-")||LastChar.contains("/")||LastChar.contains("*")) {
									field.setText(text+"0.");
								}
								else{
									String twoDots = text.replaceAll("[0-9-+*/]", "");
									if (twoDots.contains("..")){
										
									}
									else{
										if(LastChar.contains(".")){
											
										}
										field.setText(text+".");
									}
									
									
								}
						
						}
					}
					else{
						field.setText(text+".");	
					}
				}
			}
		});

		buttonReset.addActionListener (new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				field.setText("");
				field2.setText("");
			}
		});
		
		buttonDelete.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				 field.setText(text.substring(0,text.length()-1));			
				}
		});
		
		footer.addActionListener (new AbstractAction(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field.getText();
				
				text = text.replaceAll("[a-zA-Z]","");
				
				String znak = text.replaceAll("[a-zA-Z0-9]", "");
				
				String firstNum = ("");
				
				String secondNum = ("");
				
				switch(znak){
				case  "-":
					
					 firstNum = text.replaceAll("[-][0-9]+", "");
					
					 secondNum = text.replaceAll("[0-9]+[-]", "");
					
					 int num1 = Integer.parseInt(firstNum);

				  	int num2 = Integer.parseInt(secondNum);
					
					int result = num1-num2;
					
					field2.setText(result+"");
					
					break;
				case  "+":
					firstNum = text.replaceAll("[+][0-9]+", "");
					
					secondNum = text.replaceAll("[0-9]+[+]", "");
					
					num1 = Integer.parseInt(firstNum);
					
					num2 = Integer.parseInt(secondNum);
					result = num1+num2;
					field2.setText(result+"");
					break;
				case  "*":
					firstNum = text.replaceAll("[*][0-9]+", "");
					secondNum = text.replaceAll("[0-9]+[*]", "");
					num1 = Integer.parseInt(firstNum);
					num2 = Integer.parseInt(secondNum);
					result = num1*num2;
					field2.setText(result+"");
					break;
				case  "/":
					
					if(!text.contains(".")){
						firstNum = text.replaceAll("[/][0-9]+", "");
						
						secondNum = text.replaceAll("[0-9]+[/]", "");
						
					num1 = Integer.parseInt(firstNum);
					num2 = Integer.parseInt(secondNum);
					if (num2==0){
						field2.setText("На 0 ділення is forbidden");
						break;
					}
					
				
				
					if (num1%num2!=0){
						double num3 = Double.parseDouble(firstNum);
						double num4 = Double.parseDouble(secondNum);
						double resultdouble = num3/num4;
						field2.setText(resultdouble+"");
						
					}
					else{
						result = num1/num2;
						field2.setText(result+"");
					}
					}
					else{
						firstNum = text.replaceAll("[/].+", "");
						secondNum = text.replaceAll(".+[/]", "");
						field2.setText(firstNum);
					}
					break;
					
					
				}
				
			
			}
			
			
		});
		frame.setVisible(true);
		frame.setSize(1440,150);
		frame.setResizable(false);


	}

}

package Lesson5;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean status = true;
		while(status){
			double i = sc.nextDouble();
			String znak = sc.next();
			double j = sc.nextDouble();
			switch(znak){
			case "+":{
				System.out.println(i+j);
				break;
			}
		
			case "-":{
				System.out.println(i-j);
				break;
			}
			case "*":{
				System.out.println(i*j);
				break;
			}
			case "/":{
				System.out.println(i/j);
				break;
			}
			case "x":{
				System.out.println("BB");
				status = false;
				break;
			}
			default:{
				System.out.println("Введений знак не вірний");
			}
			}
		}
	}

}

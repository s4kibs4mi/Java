import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame {
	public boolean turn = false;
	public long numb1;
	public long numb2;
	public long total;
	public JPanel front;
	public JLabel display;
	public JLabel sign;
	public JPanel buttons;
	public JButton one;
	public JButton two;
	public JButton three;
	public JButton four;
	public JButton five;
	public JButton six;
	public JButton seven;
	public JButton eight;
	public JButton nine;
	public JButton zero;
	public JButton ac;
	public JButton plus;
	public JButton minus;
	public JButton divide;
	public JButton multiply;
	public JButton equal;
	
	public Calculator(){
		setTitle("Calculator");
		setLayout(new GridLayout(0,1));
		setSize(350, 400);
		
		front = new JPanel();
		sign = new JLabel();
		display = new JLabel("0");
		front.setLayout(new GridLayout(0,1));
		sign.setSize(350, 40);
		display.setSize(350, 40);
		sign.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		sign.setFont(new Font(sign.getName(), Font.PLAIN, 30));
		display.setFont(new Font(display.getName(), Font.PLAIN, 20));
		front.add(sign);
		front.add(display);
		buttons = new JPanel();
		buttons.setLayout(new GridLayout(0,4));
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		ac = new JButton("C");
		plus = new JButton("+");
		minus = new JButton("-");
		divide = new JButton("/");
		multiply = new JButton("*");
		equal = new JButton("=");
		
		one.addActionListener(new ButtonAction());
		two.addActionListener(new ButtonAction());
		three.addActionListener(new ButtonAction());
		four.addActionListener(new ButtonAction());
		five.addActionListener(new ButtonAction());
		six.addActionListener(new ButtonAction());
		seven.addActionListener(new ButtonAction());
		eight.addActionListener(new ButtonAction());
		nine.addActionListener(new ButtonAction());
		zero.addActionListener(new ButtonAction());
		ac.addActionListener(new ButtonAction());
		plus.addActionListener(new ButtonAction());
		minus.addActionListener(new ButtonAction());
		divide.addActionListener(new ButtonAction());
		multiply.addActionListener(new ButtonAction());
		equal.addActionListener(new ButtonAction());
		
		buttons.add(seven);
		buttons.add(eight);
		buttons.add(nine);
		buttons.add(ac);
		buttons.add(four);
		buttons.add(five);
		buttons.add(six);
		buttons.add(plus);
		buttons.add(one);
		buttons.add(two);
		buttons.add(three);
		buttons.add(minus);
		buttons.add(zero);
		buttons.add(equal);
		buttons.add(divide);
		buttons.add(multiply);
		
		
		add(front);
		add(buttons);
		show();
	}
	
	public class ButtonAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String command = e.getActionCommand();
			switch(command){
			case "1":
				if(!turn){
					numb1 = Integer.parseInt(command);
					display.setText("" + numb1);
					turn = true;
				}
				else{
					numb1 = (numb1*10) + Integer.parseInt(command);
					display.setText("" + numb1);
				}
				break;
			case "2":
				if(!turn){
					numb1 = Integer.parseInt(command);
					display.setText("" + numb1);
					turn = true;
				}
				else{
					numb1 = (numb1*10) + Integer.parseInt(command);
					display.setText("" + numb1);
				}
				break;
			case "3":
				if(!turn){
					numb1 = Integer.parseInt(command);
					display.setText("" + numb1);
					turn = true;
				}
				else{
					numb1 = (numb1*10) + Integer.parseInt(command);
					display.setText("" + numb1);
				}
				break;
			case "4":
				if(!turn){
					numb1 = Integer.parseInt(command);
					display.setText("" + numb1);
					turn = true;
				}
				else{
					numb1 = (numb1*10) + Integer.parseInt(command);
					display.setText("" + numb1);
				}
				break;
			case "5":
				if(!turn){
					numb1 = Integer.parseInt(command);
					display.setText("" + numb1);
					turn = true;
				}
				else{
					numb1 = (numb1*10) + Integer.parseInt(command);
					display.setText("" + numb1);
				}
				break;
			case "6":
				if(!turn){
					numb1 = Integer.parseInt(command);
					display.setText("" + numb1);
					turn = true;
				}
				else{
					numb1 = (numb1*10) + Integer.parseInt(command);
					display.setText("" + numb1);
				}
				break;
			case "7":
				if(!turn){
					numb1 = Integer.parseInt(command);
					display.setText("" + numb1);
					turn = true;
				}
				else{
					numb1 = (numb1*10) + Integer.parseInt(command);
					display.setText("" + numb1);
				}
				break;
			case "8":
				if(!turn){
					numb1 = Integer.parseInt(command);
					display.setText("" + numb1);
					turn = true;
				}
				else{
					numb1 = (numb1*10) + Integer.parseInt(command);
					display.setText("" + numb1);
				}
				break;
			case "9":
				if(!turn){
					numb1 = Integer.parseInt(command);
					display.setText("" + numb1);
					turn = true;
				}
				else{
					numb1 = (numb1*10) + Integer.parseInt(command);
					display.setText("" + numb1);
				}
				break;
			case "0":
				if(!turn){
					numb1 = Integer.parseInt(command);
					display.setText("" + numb1);
					turn = true;
				}
				else{
					numb1 = (numb1*10) + Integer.parseInt(command);
					display.setText("" + numb1);
				}
				break;
			case "+":
				sign.setText("+");
				total = Integer.parseInt(display.getText());
				numb1 = 0;
				display.setText("" + numb1);
				turn = false;
				break;
			case "-":
				sign.setText("-");
				total = Integer.parseInt(display.getText());
				numb1 = 0;
				display.setText("" + numb1);
				turn = false;
				break;
			case "*":
				sign.setText("*");
				total = Integer.parseInt(display.getText());
				numb1 = 0;
				display.setText("" + numb1);
				turn = false;
				break;
			case "/":
				sign.setText("/");
				total = Integer.parseInt(display.getText());
				numb1 = 0;
				display.setText("" + numb1);
				turn = false;
				break;
			case "C":
				numb1 = 0;
				total = 0;
				sign.setText("");
				display.setText("0");
				break;
			case "=":
				if(sign.getText() != "" && total != 0 && numb1 != 0){
					String s = sign.getText();
					switch(s){
					case "+":
						total += numb1;
						numb1 = 0;
						display.setText("" + total);
						break;
					case "-":
						total -= numb1;
						numb1 = 0;
						display.setText("" + total);
						break;
					case "*":
						total *= numb1;
						numb1 = 0;
						display.setText("" + total);
						break;
					case "/":
						total /= numb1;
						numb1 = 0;
						display.setText("" + total);
						break;
					}
				}
				sign.setText("");
				turn = false;
				break;
			}
		}
	}
	
}

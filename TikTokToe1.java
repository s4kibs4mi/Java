/**
 * TikTokToe Game
 * Java Implementation : Sakib Sami
 * Single Player Mode
 * Save source file as TikTokToe.java
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class TikTokToe extends JFrame {
	// All needed data declaration
	public boolean turn;
	public String mark;
	public String human;
	public String comp;
	public JLabel dInfo;
	public JLabel one;
	public JLabel two;
	public JLabel three;
	public JLabel four;
	public JLabel five;
	public JLabel six;
	public JLabel seven;
	public JLabel eight;
	public JLabel nine;
	public JLabel welcomeInfo;
	public JLabel msg;
	public JButton setBtn;
	public JButton exitBtn;
	public JButton resetBtn;
	public JPanel head;
	public JPanel board;
	public JPanel foot;
	public JPanel credits;
	public JPanel end;
	public JComboBox setData;

	// Constractor
	public TikTokToe() {
		Initialize(); // fields initialiation method
	}

	// Initializing fields with value
	public void Initialize() {
		turn = true;
		human = "X";
		comp = "O";
		String setDataInfo[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		one = new JLabel("1");
		two = new JLabel("2");
		three = new JLabel("3");
		four = new JLabel("4");
		five = new JLabel("5");
		six = new JLabel("6");
		seven = new JLabel("7");
		eight = new JLabel("8");
		nine = new JLabel("9");
		dInfo = new JLabel(
				" Credit : Sakib Sami < s4kibs4mi@gmail.com > < www.sakibsami.com >");
		welcomeInfo = new JLabel("Welcome");
		msg = new JLabel("Your turn : X");
		setData = new JComboBox(setDataInfo);
		setBtn = new JButton("Set");
		exitBtn = new JButton("Exit");
		resetBtn = new JButton("Reset");
		head = new JPanel();
		board = new JPanel();
		foot = new JPanel();
		end = new JPanel();
		credits = new JPanel();

		setTitle("TikTokToe");
		setLayout(new BorderLayout());
		setSize(600, 600);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		// changing 1,2,3,4,5,6,7,8,9 font size
		one.setFont(new Font(one.getName(), Font.PLAIN, 150));
		two.setFont(new Font(two.getName(), Font.PLAIN, 150));
		three.setFont(new Font(three.getName(), Font.PLAIN, 150));
		four.setFont(new Font(four.getName(), Font.PLAIN, 150));
		five.setFont(new Font(five.getName(), Font.PLAIN, 150));
		six.setFont(new Font(six.getName(), Font.PLAIN, 150));
		seven.setFont(new Font(seven.getName(), Font.PLAIN, 150));
		eight.setFont(new Font(eight.getName(), Font.PLAIN, 150));
		nine.setFont(new Font(nine.getName(), Font.PLAIN, 150));

		msg.setHorizontalAlignment(SwingConstants.CENTER);
		dInfo.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeInfo.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeInfo.setFont(new Font(welcomeInfo.getName(), Font.PLAIN, 50));
		setData.setSelectedIndex(1);
		head.setLayout(new BorderLayout());
		head.add(welcomeInfo, BorderLayout.NORTH);
		head.add(msg, BorderLayout.CENTER);

		board.setLayout(new GridLayout(3, 3));
		board.add(one);
		board.add(two);
		board.add(three);
		board.add(four);
		board.add(five);
		board.add(six);
		board.add(seven);
		board.add(eight);
		board.add(nine);

		credits.setLayout(new FlowLayout());
		credits.add(dInfo);

		foot.setLayout(new GridLayout(0, 4));
		foot.add(setData);
		foot.add(setBtn);
		foot.add(exitBtn);
		foot.add(resetBtn);

		end.setLayout(new BorderLayout());
		end.add(foot, BorderLayout.NORTH);
		end.add(credits, BorderLayout.SOUTH);

		setBtn.addActionListener(new setAction());
		exitBtn.addActionListener(new exitAction());
		resetBtn.addActionListener(new resetAction());

		add(head, BorderLayout.NORTH);
		add(board, BorderLayout.CENTER);
		add(end, BorderLayout.SOUTH);

		show();
	}

	public class GameOn {
		// Game wining check
		// 1,2,3,4,5,6,7,8,9 labels color will change to indicate wining
		// position
		public boolean WiningCheck(String mark) {
			if (one.getText().equals(mark) && two.getText().equals(mark)
					&& three.getText().equals(mark)) {
				one.setForeground(Color.BLUE);
				two.setForeground(Color.BLUE);
				three.setForeground(Color.BLUE);
				return true;
			} else if (four.getText().equals(mark)
					&& five.getText().equals(mark)
					&& six.getText().equals(mark)) {
				four.setForeground(Color.BLUE);
				five.setForeground(Color.BLUE);
				six.setForeground(Color.BLUE);
				return true;
			} else if (seven.getText().equals(mark)
					&& eight.getText().equals(mark)
					&& nine.getText().equals(mark)) {
				seven.setForeground(Color.BLUE);
				;
				eight.setForeground(Color.BLUE);
				nine.setForeground(Color.BLUE);
				return true;
			} else if (one.getText().equals(mark)
					&& five.getText().equals(mark)
					&& nine.getText().equals(mark)) {
				one.setForeground(Color.BLUE);
				five.setForeground(Color.BLUE);
				nine.setForeground(Color.BLUE);
				return true;
			} else if (three.getText().equals(mark)
					&& five.getText().equals(mark)
					&& seven.getText().equals(mark)) {
				three.setForeground(Color.BLUE);
				five.setForeground(Color.BLUE);
				seven.setForeground(Color.BLUE);
				return true;
			} else if (one.getText().equals(mark)
					&& four.getText().equals(mark)
					&& seven.getText().equals(mark)) {
				one.setForeground(Color.BLUE);
				four.setForeground(Color.BLUE);
				seven.setForeground(Color.BLUE);
				return true;
			} else if (two.getText().equals(mark)
					&& five.getText().equals(mark)
					&& eight.getText().equals(mark)) {
				two.setForeground(Color.BLUE);
				five.setForeground(Color.BLUE);
				eight.setForeground(Color.BLUE);
				return true;
			} else if (three.getText().equals(mark)
					&& six.getText().equals(mark)
					&& nine.getText().equals(mark)) {
				three.setForeground(Color.BLUE);
				six.setForeground(Color.BLUE);
				nine.setForeground(Color.BLUE);
				return true;
			}
			return false;
		}

		// Game Draw Check
		public boolean DrawCheck() {
			if (one.getText().equals("1") || two.getText().equals("2")
					|| three.getText().equals("3")
					|| four.getText().equals("4") || five.getText().equals("5")
					|| six.getText().equals("6") || seven.getText().equals("7")
					|| eight.getText().equals("8")
					|| nine.getText().equals("9"))
				return true;
			return false;
		}

		// Each Turn validity check
		public boolean isValid(int n) {
			switch (n) {
			case 1:
				if (one.getText().equals("X") || one.getText().equals("O"))
					return false;
				break;
			case 2:
				if (two.getText().equals("X") || two.getText().equals("O"))
					return false;
				break;
			case 3:
				if (three.getText().equals("X") || three.getText().equals("O"))
					return false;
				break;
			case 4:
				if (four.getText().equals("X") || four.getText().equals("O"))
					return false;
				break;
			case 5:
				if (five.getText().equals("X") || five.getText().equals("O"))
					return false;
				break;
			case 6:
				if (six.getText().equals("X") || six.getText().equals("O"))
					return false;
				break;
			case 7:
				if (seven.getText().equals("X") || seven.getText().equals("O"))
					return false;
				break;
			case 8:
				if (eight.getText().equals("X") || eight.getText().equals("O"))
					return false;
				break;
			case 9:
				if (nine.getText().equals("X") || nine.getText().equals("O"))
					return false;
				break;
			}
			return true;
		}
		
		public boolean aIwiningCheck(String mark) {
			if (one.getText().equals(mark) && two.getText().equals(mark)
					&& three.getText().equals(mark)) {
				return true;
			} else if (four.getText().equals(mark)
					&& five.getText().equals(mark)
					&& six.getText().equals(mark)) {
				return true;
			} else if (seven.getText().equals(mark)
					&& eight.getText().equals(mark)
					&& nine.getText().equals(mark)) {
				return true;
			} else if (one.getText().equals(mark)
					&& five.getText().equals(mark)
					&& nine.getText().equals(mark)) {
				return true;
			} else if (three.getText().equals(mark)
					&& five.getText().equals(mark)
					&& seven.getText().equals(mark)) {
				return true;
			} else if (one.getText().equals(mark)
					&& four.getText().equals(mark)
					&& seven.getText().equals(mark)) {
				return true;
			} else if (two.getText().equals(mark)
					&& five.getText().equals(mark)
					&& eight.getText().equals(mark)) {
				return true;
			} else if (three.getText().equals(mark)
					&& six.getText().equals(mark)
					&& nine.getText().equals(mark)) {
				return true;
			}
			return false;
		}
		
		public int aI() {
			
			if(isValid(1)){
				one.setText("O");
				if(aIwiningCheck("O")){
					one.setText("1");
					return 1;
				}
				one.setText("1");
			}
			if(isValid(2)){
				two.setText("O");
				if(aIwiningCheck("O")){
					two.setText("2");
					return 2;
				}
				two.setText("2");
			}
			if(isValid(3)){
				three.setText("O");
				if(aIwiningCheck("O")){
					three.setText("3");
					return 3;
				}
				three.setText("3");
			}
			if(isValid(4)){
				four.setText("O");
				if(aIwiningCheck("O")){
					four.setText("4");
					return 4;
				}
				four.setText("4");
			}
			if(isValid(5)){
				five.setText("O");
				if(aIwiningCheck("O")){
					five.setText("5");
					return 5;
				}
				five.setText("5");
			}
			if(isValid(6)){
				six.setText("O");
				if(aIwiningCheck("O")){
					six.setText("6");
					return 6;
				}
				six.setText("6");
			}
			if(isValid(7)){
				seven.setText("O");
				if(aIwiningCheck("O")){
					seven.setText("7");
					return 7;
				}
				seven.setText("7");
			}
			if(isValid(8)){
				eight.setText("O");
				if(aIwiningCheck("O")){
					eight.setText("8");
					return 8;
				}
				eight.setText("8");
			}
			if(isValid(9)){
				nine.setText("O");
				if(aIwiningCheck("O")){
					nine.setText("9");
					return 9;
				}
				nine.setText("9");
			}
			
			if(isValid(1)){
				one.setText("X");
				if(aIwiningCheck("X")){
					one.setText("1");
					return 1;
				}
				one.setText("1");
			}
			if(isValid(2)){
				two.setText("X");
				if(aIwiningCheck("X")){
					two.setText("2");
					return 2;
				}
				two.setText("2");
			}
			if(isValid(3)){
				three.setText("X");
				if(aIwiningCheck("X")){
					three.setText("3");
					return 3;
				}
				three.setText("3");
			}
			if(isValid(4)){
				four.setText("X");
				if(aIwiningCheck("X")){
					four.setText("4");
					return 4;
				}
				four.setText("4");
			}
			if(isValid(5)){
				five.setText("X");
				if(aIwiningCheck("X")){
					five.setText("5");
					return 5;
				}
				five.setText("5");
			}
			if(isValid(6)){
				six.setText("X");
				if(aIwiningCheck("X")){
					six.setText("6");
					return 6;
				}
				six.setText("6");
			}
			if(isValid(7)){
				seven.setText("X");
				if(aIwiningCheck("X")){
					seven.setText("7");
					return 7;
				}
				seven.setText("7");
			}
			if(isValid(8)){
				eight.setText("X");
				if(aIwiningCheck("X")){
					eight.setText("8");
					return 8;
				}
				eight.setText("8");
			}
			if(isValid(9)){
				nine.setText("X");
				if(aIwiningCheck("X")){
					nine.setText("9");
					return 9;
				}
				nine.setText("9");
			}
			
			int x;
			Random r = new Random();
			do{
				x = 1 + (r.nextInt() % 9);
			}while(!isValid(x));
			return x;
		}
	}

	// Game Exit Action
	public class exitAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	// Game Reset Action
	public class resetAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			new TikTokToe().setVisible(true);
		}
	}

	// Game Turn Set Action
	public class setAction implements ActionListener {
		GameOn go = new GameOn();

		public void actionPerformed(ActionEvent e) {
			int x;
			boolean correct = false;
			x = Integer.parseInt(setData.getSelectedItem().toString());
			mark = "X";
			if(go.isValid(x)){
				switch(x){
				case 1:
					one.setText(mark);
					break;
				case 2:
					two.setText(mark);
					break;
				case 3:
					three.setText(mark);
					break;
				case 4:
					four.setText(mark);
					break;
				case 5:
					five.setText(mark);
					break;
				case 6:
					six.setText(mark);
					break;
				case 7:
					seven.setText(mark);
					break;
				case 8:
					eight.setText(mark);
					break;
				case 9:
					nine.setText(mark);
					break;
				}
				if(go.WiningCheck(mark)){
					msg.setText("Congrats. You won :D");
					setBtn.setVisible(false);
					setData.setVisible(false);
				}
				else if(!go.DrawCheck()){
					msg.setText("Match Drawn :/");
					setBtn.setVisible(false);
					setData.setVisible(false);
				}
				else correct = true;
			}
			else{
				msg.setText("Invalid Choice. Your Sign X");
			}
			
			if(correct){
				mark = "O";
				do{
					x = go.aI();
				}while(!go.isValid(x));
				switch(x){
				case 1:
					one.setText(mark);
					break;
				case 2:
					two.setText(mark);
					break;
				case 3:
					three.setText(mark);
					break;
				case 4:
					four.setText(mark);
					break;
				case 5:
					five.setText(mark);
					break;
				case 6:
					six.setText(mark);
					break;
				case 7:
					seven.setText(mark);
					break;
				case 8:
					eight.setText(mark);
					break;
				case 9:
					nine.setText(mark);
					break;
				}
				if(go.WiningCheck(mark)){
					msg.setText("You Lose. Computer won :(");
					setBtn.setVisible(false);
					setData.setVisible(false);
				}
				else if(!go.DrawCheck()){
					msg.setText("Match Drawn :/");
					setBtn.setVisible(false);
					setData.setVisible(false);
				}
				else correct = false;
			}
		}
	}

}

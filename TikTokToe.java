package tiktoktoe;

/**
 * TikTokToe Game
 * Java Implementation : Sakib Sami
 * Email : s4kibs4mi@gmail.com
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TikTokToe extends JFrame {
	// All needed fields
	public boolean turn = true;
	public String mark;
	public String human = "X";
	public String comp = "O";
	public JLabel one = new JLabel("1");
	public JLabel two = new JLabel("2");
	public JLabel three = new JLabel("3");
	public JLabel four = new JLabel("4");
	public JLabel five = new JLabel("5");
	public JLabel six = new JLabel("6");
	public JLabel seven = new JLabel("7");
	public JLabel eight = new JLabel("8");
	public JLabel nine = new JLabel("9");
	public JButton set = new JButton("Set");
	public JButton exit = new JButton("Exit");
	public JLabel msg = new JLabel("Human Turn");
	public JLabel sign = new JLabel(human);
	public JTextField input = new JTextField();
	public JButton reset = new JButton("Reset");
	
	// Constructor
	public TikTokToe() {
		setLayout(new GridLayout(5, 3));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setTitle("Tik Tok Toe");
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(input);
		add(set);
		add(exit);
		add(msg);
		add(sign);
		add(reset);
		exit.addActionListener(new ExitAction());
		set.addActionListener(new setAction());
		reset.addActionListener(new ResetAction());
		show();
	}
	
	// this class for checking TikTokToe Game Conditions
	public class GameOn {
		
		// Game wining check
		public boolean WiningCheck(String mark) {
			if (one.getText().equals(mark) && two.getText().equals(mark)
					&& three.getText().equals(mark))
				return true;
			else if (four.getText().equals(mark) && five.getText().equals(mark)
					&& six.getText().equals(mark))
				return true;
			else if (seven.getText().equals(mark)
					&& eight.getText().equals(mark)
					&& nine.getText().equals(mark))
				return true;
			else if (one.getText().equals(mark) && five.getText().equals(mark)
					&& nine.getText().equals(mark))
				return true;
			else if (three.getText().equals(mark)
					&& five.getText().equals(mark)
					&& seven.getText().equals(mark))
				return true;
			else if (one.getText().equals(mark) && four.getText().equals(mark)
					&& seven.getText().equals(mark))
				return true;
			else if (two.getText().equals(mark) && five.getText().equals(mark)
					&& eight.getText().equals(mark))
				return true;
			else if (three.getText().equals(mark) && six.getText().equals(mark)
					&& nine.getText().equals(mark))
				return true;
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
	}

	// Game Exit Action
	public class ExitAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	// Game Reset Action
	public class ResetAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
	
	// Game Turn Set Action
	public class setAction implements ActionListener {
		GameOn go = new GameOn();

		public void actionPerformed(ActionEvent e) {
			int x;
			try {
				x = Integer.parseInt(input.getText());
			} catch (Exception ex) {
				x = 0;
			}
			if (turn)
				mark = "X";
			else
				mark = "O";

			if ((x != 0) && (x > 0 && x < 10) && go.isValid(x)) {
				switch (x) {
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

				if (go.WiningCheck(mark)) {
					String m;
					if (turn)
						m = "You Win";
					else
						m = "You Lose";
					msg.setText(m);
					sign.setText("Congrats");
				} else if (!go.DrawCheck()) {
					String m = "Match Draw";
					msg.setText(m);
					sign.setText(":)");
				} else {
					if (turn) {
						msg.setText("Computer Turn");
						sign.setText(comp);
						turn = false;
					} else {
						msg.setText("Human Turn");
						sign.setText(human);
						turn = true;
					}
					input.setText("");
				}
			} else {
				msg.setText("Invalid Choice");
				input.setText("");
				if (turn)
					sign.setText("Human : X");
				else
					sign.setText("Computer : O");
			}
		}
	}
}

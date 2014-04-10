import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FirstGui extends JFrame{
	public JButton sum = new JButton("Sum");
	public JButton exit = new JButton("Exit");
	public JLabel number1 = new JLabel("Number1 : ");
	public JLabel number2 = new JLabel("Number2 : ");
	public JLabel resultL = new JLabel("Result : ");
	public JTextField textNum1 = new JTextField();
	public JTextField textNum2 = new JTextField();
	public JLabel result = new JLabel("");
	
	public FirstGui() {
		setLayout( new GridLayout(0, 2) );
		setTitle("GUI Test Math Sum");
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setSize(400, 500);
		add(number1);
		add(textNum1);
		add(number2);
		add(textNum2);
		add(resultL);
		add(result);
		add(sum);
		add(exit);
		sum.addActionListener(new CustomActionListener());
		show();
	}
	
	public class CustomActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int a,b;
			try{
				a = Integer.parseInt(textNum1.getText());
				b = Integer.parseInt(textNum2.getText());
				result.setText(" " + (a + b));
				
			} catch(Exception ex){
				result.setText("Invalid Input");
			}
	    }
	}
}

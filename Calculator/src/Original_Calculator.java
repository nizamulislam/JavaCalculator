import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Original_Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private double Fnum;
	private double Snum;
	private String operation;
	private double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Original_Calculator frame = new Original_Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Original_Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 313, 425);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		textField.setBounds(10, 11, 277, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		final JButton Button1 = new JButton("1");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takein;
				takein=textField.getText()+Button1.getText();
				textField.setText(takein);
			}
		});
		Button1.setFont(new Font("Tahoma", Font.BOLD, 14));
		Button1.setBounds(10, 69, 51, 40);
		contentPane.add(Button1);
		
		final JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takein;
				takein=textField.getText()+button2.getText();
				textField.setText(takein);
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button2.setBounds(61, 69, 51, 40);
		contentPane.add(button2);
		
		final JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takein;
				takein=textField.getText()+button3.getText();
				textField.setText(takein);

			}
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button3.setBounds(112, 69, 51, 40);
		contentPane.add(button3);
		
		final JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takein;
				takein=textField.getText()+button4.getText();
				textField.setText(takein);
			}
		});
		button4.setFont(new Font("Tahoma", Font.BOLD, 14));
		button4.setBounds(173, 69, 51, 40);
		contentPane.add(button4);
		
		final JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				String takein;
				takein=textField.getText()+button5.getText();
				textField.setText(takein);

				
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 14));
		button5.setBounds(224, 69, 51, 40);
		contentPane.add(button5);
		
		final JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takein;
				takein=textField.getText()+button6.getText();
				textField.setText(takein);

			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 14));
		button6.setBounds(10, 120, 51, 40);
		contentPane.add(button6);
		
		final JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takein;
				takein=textField.getText()+button7.getText();
				textField.setText(takein);

			}
		});
		button7.setFont(new Font("Tahoma", Font.BOLD, 14));
		button7.setBounds(61, 120, 51, 40);
		contentPane.add(button7);
		
		final JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takein;
				takein=textField.getText()+button8.getText();
				textField.setText(takein);

			}
		});
		button8.setFont(new Font("Tahoma", Font.BOLD, 14));
		button8.setBounds(112, 120, 51, 40);
		contentPane.add(button8);
		
		final JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takein;
				takein=textField.getText()+button9.getText();
				textField.setText(takein);

			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 14));
		button9.setBounds(163, 120, 51, 40);
		contentPane.add(button9);
		
		final JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takein;
				takein=textField.getText()+button0.getText();
				textField.setText(takein);

			}
		});
		button0.setFont(new Font("Tahoma", Font.BOLD, 14));
		button0.setBounds(214, 120, 51, 40);
		contentPane.add(button0);
		
		final JButton button10 = new JButton(".");
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takein;
				takein=textField.getText()+button10.getText();
				textField.setText(takein);

			}
		});
		button10.setFont(new Font("Tahoma", Font.BOLD, 14));
		button10.setBounds(10, 171, 51, 40);
		contentPane.add(button10);
		
		JButton buttonplus = new JButton("+");
		buttonplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Fnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		buttonplus.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonplus.setBounds(81, 171, 71, 40);
		contentPane.add(buttonplus);
		
		JButton buttonminus = new JButton("-");
		buttonminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Fnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		buttonminus.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonminus.setBounds(173, 171, 71, 40);
		contentPane.add(buttonminus);
		
		JButton buttonmulti = new JButton("*");
		buttonmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Fnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		buttonmulti.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonmulti.setBounds(20, 232, 71, 40);
		contentPane.add(buttonmulti);
		
		JButton buttondiv = new JButton("/");
		buttondiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Fnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		buttondiv.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttondiv.setBounds(173, 232, 71, 40);
		contentPane.add(buttondiv);
		
		JButton buttonequal = new JButton("=");
		buttonequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Snum=Double.parseDouble(textField.getText());
				String ans;
				switch(operation)
				{
				case "+":
					result=Fnum + Snum;
					ans=String.valueOf(result);
					textField.setText(ans);
					break;
					
					
				case "-":
					result=Fnum - Snum;
					ans=String.valueOf(result);
					textField.setText(ans);
					break;
					
				case "*":
					result=Fnum * Snum;
					ans=String.valueOf(result);
					textField.setText(ans);
					break;
					
				case "/":
					result=Fnum / Snum;
					ans=String.valueOf(result);
					textField.setText(ans);
					break;
				    
				}
				
			}
		});
		buttonequal.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonequal.setBounds(81, 303, 133, 40);
		contentPane.add(buttonequal);
		
		JButton buttoncl = new JButton("CL");
		buttoncl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		buttoncl.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttoncl.setBounds(92, 232, 71, 40);
		contentPane.add(buttoncl);
	}

}

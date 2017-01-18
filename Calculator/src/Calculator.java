import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSecondNumber;
	private JTextField textFieldResult;
	private JTextField textFieldFirstNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(26, 47, 655, 359);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		textFieldSecondNumber = new JTextField();
		textFieldSecondNumber.setBounds(187, 103, 86, 20);
		panel.add(textFieldSecondNumber);
		textFieldSecondNumber.setColumns(10);
		
		textFieldResult = new JTextField();
		textFieldResult.setBounds(187, 199, 86, 30);
		panel.add(textFieldResult);
		textFieldResult.setColumns(10);
		
		textFieldFirstNumber = new JTextField();
		textFieldFirstNumber.setBounds(187, 61, 86, 20);
		panel.add(textFieldFirstNumber);
		textFieldFirstNumber.setColumns(10);
		
		JLabel lblFirstnumber = new JLabel("FirstNumber");
		lblFirstnumber.setBounds(67, 61, 73, 20);
		panel.add(lblFirstnumber);
		
		JLabel lblNewLabel = new JLabel("SecondNumber");
		lblNewLabel.setBounds(67, 109, 95, 30);
		panel.add(lblNewLabel);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(78, 215, 46, 14);
		panel.add(lblResult);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int first=Integer.parseInt(textFieldFirstNumber.getText());
				int second=Integer.parseInt(textFieldSecondNumber.getText());
				
				
				textFieldResult.setText(String.valueOf(first+second));
				
			}
		});
		btnAdd.setBounds(245, 154, 73, 23);
		panel.add(btnAdd);
		
		JButton btnSub = new JButton("SUB");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int first=Integer.parseInt(textFieldFirstNumber.getText());
				int second=Integer.parseInt(textFieldSecondNumber.getText());
				
				
				textFieldResult.setText(String.valueOf(first-second));
			}
		});
		btnSub.setBounds(323, 154, 73, 23);
		panel.add(btnSub);
		
		JButton btnMulti = new JButton("MULTI");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int first=Integer.parseInt(textFieldFirstNumber.getText());
				int second=Integer.parseInt(textFieldSecondNumber.getText());
				
				
				textFieldResult.setText(String.valueOf(first*second));
			}
		});
		btnMulti.setBounds(406, 154, 89, 23);
		panel.add(btnMulti);
		
		JButton btnDiv = new JButton("DIV");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int first=Integer.parseInt(textFieldFirstNumber.getText());
				int second=Integer.parseInt(textFieldSecondNumber.getText());
				
				
				textFieldResult.setText(String.valueOf(first/second));
			}
		});
		btnDiv.setBounds(505, 154, 65, 23);
		panel.add(btnDiv);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
	}
}

package sabhya;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;

public class calculator {

	private JFrame frmScientificCalculator;
	private JTextField txtDisplay;
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frmScientificCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScientificCalculator = new JFrame();
		frmScientificCalculator.setResizable(false);
		frmScientificCalculator.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmScientificCalculator.setBackground(Color.BLACK);
		frmScientificCalculator.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 9));
		frmScientificCalculator.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frmScientificCalculator.setTitle("Standard Calculator");
		frmScientificCalculator.setBounds(100, 100,278,367);
		frmScientificCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Times New Roman", Font.BOLD, 17));
		menuBar.setToolTipText("File");
		frmScientificCalculator.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Select");
		mnNewMenu.setFont(new Font("Times New Roman", Font.BOLD, 10));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Standard");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmScientificCalculator.setTitle("Standard Calculator");
				frmScientificCalculator.setBounds(100, 100,275,367);
				txtDisplay.setBounds(10,11,243,37);
				
			}
		});
		mntmNewMenuItem.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Scientific");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmScientificCalculator.setTitle("Scientific Calculator");
				frmScientificCalculator.setBounds(100, 100,530,367);
				txtDisplay.setBounds(10,11,503,37);
				
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Exit");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		mnNewMenu.add(mntmNewMenuItem_3);
		frmScientificCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 244, 37);
		frmScientificCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btnNewButton = new JButton("\u2190");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String backspace = null;
				 if(txtDisplay.getText().length()>0) {
					 StringBuilder strB = new StringBuilder(txtDisplay.getText());
					 strB.deleteCharAt(txtDisplay.getText().length()-1);
					 backspace=strB.toString();
					 txtDisplay.setText(backspace);
					 }
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(10, 52, 96, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnNewButton_2.setBounds(106, 52, 48, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("+_");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops=ops*(-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_1_1.setBounds(154, 52, 48, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_1_1);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText()+ btn8.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn8.setBounds(58, 99, 48, 47);
		frmScientificCalculator.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText()+ btn7.getText();
				txtDisplay.setText(iNum);
				
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn7.setBounds(10, 99, 48, 47);
		frmScientificCalculator.getContentPane().add(btn7);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText()+ btn9.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn9.setBounds(106, 99, 48, 47);
		frmScientificCalculator.getContentPane().add(btn9);
		
		JButton btnNewButton_1_1_1 = new JButton("/");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnNewButton_1_1_1.setBounds(154, 99, 48, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText()+ btn5.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn5.setBounds(58, 147, 48, 47);
		frmScientificCalculator.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText()+ btn4.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn4.setBounds(10, 147, 48, 47);
		frmScientificCalculator.getContentPane().add(btn4);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText()+ btn6.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn6.setBounds(106, 147, 48, 47);
		frmScientificCalculator.getContentPane().add(btn6);
		
		JButton btnNewButton_1_1_2 = new JButton("*");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnNewButton_1_1_2.setBounds(154, 147, 48, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_1_1_2);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText()+ btn2.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn2.setBounds(58, 194, 48, 47);
		frmScientificCalculator.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText()+ btn1.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn1.setBounds(10, 194, 48, 47);
		frmScientificCalculator.getContentPane().add(btn1);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText()+ btn3.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn3.setBounds(106, 194, 48, 47);
		frmScientificCalculator.getContentPane().add(btn3);
		
		JButton btnNewButton_1_1_3 = new JButton("-");
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
				
			}
		});
		btnNewButton_1_1_3.setBounds(154, 194, 48, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_1_1_3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText()+ btn0.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn0.setBounds(10, 246, 96, 47);
		frmScientificCalculator.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText()+ btnDot.getText();
				txtDisplay.setText(iNum);
			}
		});
		btnDot.setBounds(106, 246, 48, 47);
		frmScientificCalculator.getContentPane().add(btnDot);
		
		JButton btnNewButton_1_1_4 = new JButton("+");
		btnNewButton_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
				
				
			}
		});
		btnNewButton_1_1_4.setBounds(154, 246, 48, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_1_1_4);
		
		JButton btnNewButton_1_1_1_1 = new JButton("%");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnNewButton_1_1_1_1.setBounds(205, 99, 48, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_5 = new JButton("\u221A");
		btnNewButton_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops=Math.sqrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_1_1_5.setBounds(205, 52, 48, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_1_1_5);
		
		JButton btnNewButton_1_1_2_1 = new JButton("1/x");
		btnNewButton_1_1_2_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 9));
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = 1/ops;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_1_1_2_1.setBounds(205, 147, 48, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_1_1_2_1);
		
		JButton btnNewButton_1_1_3_1 = new JButton("=");
		btnNewButton_1_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if(operations == "+") 
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "-") 
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "*") 
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "/") 
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "%") 
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "x^y") 
				{
					result = Math.pow(firstnum,secondnum);
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
			
		});
		btnNewButton_1_1_3_1.setBounds(205, 194, 48, 99);
		frmScientificCalculator.getContentPane().add(btnNewButton_1_1_3_1);
		
		JButton Log = new JButton("Log");
		Log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops=Math.log(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		Log.setFont(new Font("Tahoma", Font.BOLD, 9));
		Log.setBounds(263, 52, 62, 47);
		frmScientificCalculator.getContentPane().add(Log);
		
		JButton btnNewButton_7_1 = new JButton("Sin");
		btnNewButton_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops=Math.sin(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_7_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_1.setBounds(326, 52, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_1);
		
		JButton btnNewButton_7_1_1 = new JButton("Mod");
		btnNewButton_7_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "Mod";
			}
		});
		btnNewButton_7_1_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_1_1.setBounds(451, 52, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_1_1);
		
		JButton btnNewButton_7_2 = new JButton("Sinh");
		btnNewButton_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops=Math.sinh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_7_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_2.setBounds(388, 52, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_2);
		
		JButton btnNewButton_7_2_1 = new JButton("Cosh");
		btnNewButton_7_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops=Math.cosh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_7_2_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_2_1.setBounds(388, 99, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_2_1);
		
		JButton btnNewButton_7_1_1_1 = new JButton("Inx");
		btnNewButton_7_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log10(ops);
				txtDisplay.setText(String.valueOf(ops));
			
			
			}
		});
		btnNewButton_7_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_1_1_1.setBounds(451, 99, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_1_1_1);
		
		JButton btnNewButton_7_1_2 = new JButton("Cos");
		btnNewButton_7_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops=Math.cos(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_7_1_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_1_2.setBounds(326, 99, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_1_2);
		
		JButton btnNewButton_7_3 = new JButton("\u03C0");
		btnNewButton_7_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops = (3.1415926535897932384626433832795);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_7_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_3.setBounds(263, 99, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_3);
		
		JButton btnNewButton_7_2_2 = new JButton("Tanh");
		btnNewButton_7_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops=Math.tanh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_7_2_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_2_2.setBounds(388, 147, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_2_2);
		
		JButton btnNewButton_7_1_1_2 = new JButton("Exp");
		btnNewButton_7_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "Exp";
			}
		});
		btnNewButton_7_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_1_1_2.setBounds(451, 147, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_1_1_2);
		
		JButton btnNewButton_7_1_3 = new JButton("Tan");
		btnNewButton_7_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops=Math.tan(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_7_1_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_1_3.setBounds(326, 147, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_1_3);
		
		JButton btnNewButton_7_4 = new JButton("x^y");
		btnNewButton_7_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "x^y";
			}
		});
		btnNewButton_7_4.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_4.setBounds(263, 147, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_4);
		
		JButton btnNewButton_7_2_3 = new JButton("Rund");
		btnNewButton_7_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.round(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_7_2_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_2_3.setBounds(388, 194, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_2_3);
		
		JButton btnNewButton_7_1_1_3 = new JButton("2*\u03C0");
		btnNewButton_7_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops = (3.1415926535897932384626433832795)*2;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_7_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_1_1_3.setBounds(451, 194, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_1_1_3);
		
		JButton btnNewButton_7_1_4 = new JButton("Cbr");
		btnNewButton_7_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cbrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_7_1_4.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_1_4.setBounds(326, 194, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_1_4);
		
		JButton btnNewButton_7_5 = new JButton("x^2");
		btnNewButton_7_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = (ops*ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_7_5.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_5.setBounds(263, 194, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_5);
		
		JButton btnNewButton_7_2_4 = new JButton("Hex");
		btnNewButton_7_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,16));
			}
		});
		btnNewButton_7_2_4.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_2_4.setBounds(388, 246, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_2_4);
		
		JButton btnNewButton_7_1_1_4 = new JButton("Octa");
		btnNewButton_7_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,8));
			}
		});
		btnNewButton_7_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_1_1_4.setBounds(451, 246, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_1_1_4);
		
		JButton btnNewButton_7_1_5 = new JButton("Bin");
		btnNewButton_7_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,2));
			}
		});
		btnNewButton_7_1_5.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_1_5.setBounds(326, 246, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_1_5);
		
		JButton btnNewButton_7_6 = new JButton("x^3");
		btnNewButton_7_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.pow(ops,3);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_7_6.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7_6.setBounds(263, 246, 62, 47);
		frmScientificCalculator.getContentPane().add(btnNewButton_7_6);
	}

}

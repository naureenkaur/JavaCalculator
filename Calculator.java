import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.DropMode;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

/**
 * File Name: Calculator
 * Programmer:	Naureen Kaur
 * Date: March 11 2018
 * Description: This program demonstrates the basic functions of a calculator using graphics  
 * and allowing user input through buttons and displaying data to the user in textboxes
**/

public class Calculator extends JFrame {

	// declare variables
	private JPanel Calculator;
	private static JTextField txtDisplay;
	private double total1 = 0.0;
	private double total2 = 0.0;
	private int option = 0;
	
	// create a method that will take the display in the textbox and turn it into a double value
	public static double firstNum (double firstNum) {
		firstNum = Double.parseDouble(txtDisplay.getText());
		// set the textbox display to nothing
		txtDisplay.setText("");
		return firstNum;	
	}
	
	//create method that will take the display in the textbox and turn it into a double value
	public static double secondNum (double secondNum) {
		secondNum = Double.parseDouble(txtDisplay.getText());
		return secondNum;
	}

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
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,450);
		Calculator = new JPanel();
		Calculator.setBackground(new Color(128, 0, 0));
		Calculator.setMaximumSize(new Dimension(100, 300));
		Calculator.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Calculator);
		Calculator.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Sylfaen", Font.BOLD, 20));
		txtDisplay.setBounds(10, 22, 564, 52);
		Calculator.add(txtDisplay);
		txtDisplay.setColumns(10);
		
		// the information about the panel that the 0-9 and the decimal button is present
		Panel panel = new Panel();
		panel.setBounds(10, 96, 307, 294);
		Calculator.add(panel);
		panel.setLayout(null);
		
		// add button 1
		JButton btnOne = new JButton("1");
		// when button one is clicked the following code will take place
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String btnOneText = txtDisplay.getText() + btnOne.getText();
				txtDisplay.setText(btnOneText);
			}
		});
		btnOne.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnOne.setBounds(10, 11, 62, 45);
		panel.add(btnOne);
		
		// add button 2
		JButton btnTwo = new JButton("2");
		// when button two is clicked the following code will take place
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnTwoText = txtDisplay.getText() + btnTwo.getText();
				txtDisplay.setText(btnTwoText);
			}
		});
		btnTwo.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnTwo.setBounds(119, 11, 62, 45);
		panel.add(btnTwo);
		
		// add button three
		JButton btnThree = new JButton("3");
		// when button three is clicked the following code will take place
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnThreeText = txtDisplay.getText() + btnThree.getText();
				txtDisplay.setText(btnThreeText);
			}
		});
		btnThree.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnThree.setBounds(218, 11, 62, 45);
		panel.add(btnThree);
		
		// add button four
		JButton btnFour = new JButton("4");
		// when button four is clicked the following code will take place
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnFourText = txtDisplay.getText() + btnFour.getText();
				txtDisplay.setText(btnFourText);
			}
		});
		btnFour.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnFour.setBounds(10, 67, 62, 45);
		panel.add(btnFour);
		
		// add button five
		JButton btnFive = new JButton("5");
		// when button five is clicked the following code will take place
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnFiveText = txtDisplay.getText() + btnFive.getText();
				txtDisplay.setText(btnFiveText);
			}
		});
		btnFive.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnFive.setBounds(119, 67, 62, 45);
		panel.add(btnFive);
		
		// add button six
		JButton btnSix = new JButton("6");
		// when button six is clicked the following code will take place
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnSixText = txtDisplay.getText() + btnSix.getText();
				txtDisplay.setText(btnSixText);
			}
		});
		btnSix.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnSix.setBounds(218, 70, 62, 45);
		panel.add(btnSix);
		
		// add button seven
		JButton btnSeven = new JButton("7");
		// when button seven is clicked the following code will take place
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnSevenText = txtDisplay.getText() + btnSeven.getText();
				txtDisplay.setText(btnSevenText);
			}
		});
		btnSeven.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnSeven.setBounds(10, 125, 62, 45);
		panel.add(btnSeven);
		
		// add button eight
		JButton btnEight = new JButton("8");
		// when button eight is clicked the following code will take place
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnEightText = txtDisplay.getText() + btnEight.getText();
				txtDisplay.setText(btnEightText);
			}
		});
		btnEight.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnEight.setBounds(119, 125, 62, 45);
		panel.add(btnEight);
		
		// add button nine
		JButton btnNine = new JButton("9");
		// when button nine is clicked the following code will take place
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnNineText = txtDisplay.getText() + btnNine.getText();
				txtDisplay.setText(btnNineText);
			}
		});
		btnNine.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnNine.setBounds(218, 125, 62, 45);
		panel.add(btnNine);
		
		// add button zero
		JButton btnZero = new JButton("0");
		// when button 0 is clicked the following code will tale place
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnZeroText = txtDisplay.getText() + btnZero.getText();
				txtDisplay.setText(btnZeroText);
			}
		});
		btnZero.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnZero.setBounds(10, 181, 62, 45);
		panel.add(btnZero);
		
		// ass button decimal
		JButton btnDecimal = new JButton(".");
		// when button zero is clicked the following code will take place
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnDecimalText = txtDisplay.getText() + btnDecimal.getText();
				txtDisplay.setText(btnDecimalText);
			}
		});
		btnDecimal.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		btnDecimal.setBounds(119, 181, 62, 45);
		panel.add(btnDecimal);
		
		// panel to add the function buttons to 
		Panel panel1 = new Panel();
		panel1.setBounds(342, 96, 214, 294);
		Calculator.add(panel1);
		panel1.setLayout(null);
		
		// add button plus
		JButton btnPlus = new JButton("+");
		// when button plus is clicked the following code will happen
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// call the method
				total1 = firstNum(Double.parseDouble(txtDisplay.getText()));
				option = 1;
			}
		});
		btnPlus.setBounds(10, 21, 68, 49);
		panel1.add(btnPlus);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// call the method
				total1 = firstNum(Double.parseDouble(txtDisplay.getText()));
				option = 2;
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSub.setBounds(136, 21, 68, 49);
		panel1.add(btnSub);
		
		// add the multiplication button
		JButton btnMultiply = new JButton("x");
		// when the button is clicked the following code will execute 
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// call the method
				total1 = firstNum(Double.parseDouble(txtDisplay.getText()));
				option = 3;
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMultiply.setBounds(10, 88, 68, 49);
		panel1.add(btnMultiply);
		
		// add the divide button 
		JButton btnDivide = new JButton("\u00F7");
		// when the button is clicked the following code will execute
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// call the method 
				total1 = firstNum(Double.parseDouble(txtDisplay.getText()));
				option = 4;
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDivide.setBounds(136, 90, 68, 44);
		panel1.add(btnDivide);
		
		// add the squareroot button
		JButton btnSqrt = new JButton("\u221A");
		// when the button is clicked the following code will execute
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// get the total1 double to equal the txbox display
				total1 = Double.parseDouble(txtDisplay.getText());
				// double sqrt is 0
				double sqrt = 0.0;
				// sqrt is the squareroot of the number total1
				sqrt = Math.sqrt(total1);
				// display the answer
				txtDisplay.setText(Double.toString(sqrt));
				// sqrt is total so further operations can be doe without retyping the number
				sqrt = total1;
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSqrt.setBounds(10, 159, 68, 49);
		panel1.add(btnSqrt);
		
		// add the power button
		JButton btnPower = new JButton("EXP");
		// when the button is clicked the following code will execute
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// call the method
				total1 = firstNum(Double.parseDouble(txtDisplay.getText()));
				option = 5;
			}
		});
		btnPower.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPower.setBounds(136, 160, 68, 49);
		panel1.add(btnPower);
		
		// add the plus minus button
		JButton btnPlusMinus = new JButton("+/-");
		// when this button in clicked the following code when execute
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// total1 will equal is value multiplied by -1
				total1 = Double.parseDouble(txtDisplay.getText())*-1;
				txtDisplay.setText(Double.toString(total1));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPlusMinus.setBounds(10, 234, 68, 49);
		panel1.add(btnPlusMinus);
		
		// add button equals
				JButton btnEquals = new JButton("=");
				btnEquals.setBounds(10, 241, 270, 42);
				panel.add(btnEquals);
				// when the equal button is clicked the following code will take place
				btnEquals.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// call the method
						total2 = secondNum(Double.parseDouble(txtDisplay.getText()));
						
						// switch case 
						switch (option) {
						// case one is addition it will add the two numbers together
						case 1:
							double add = 0.0;
							add = total1 + total2;
							txtDisplay.setText(Double.toString(add));
							// so you can use the last answer and continue to operate without having to retype it
							add = total1;
							break;
						// case two is subtraction, it will subtract the second number from the first 
						case 2:
							double sub = 0.0;
							sub = total1 - total2;
							txtDisplay.setText(Double.toString(sub));
							// so you can use the last answer and continue to operate without having to retype it
							sub = total1;
							break;
						// case three is multiply 
						case 3:
							double multiply = 0.0;
							multiply = total1*total2;
							txtDisplay.setText(Double.toString(multiply));
							// so you can use the last answer and continue to operate without having to retype it
							multiply = total1;
							break;
						// case four is divide
						case 4:
							double divide = 0.0;
							divide = total1/total2;
							txtDisplay.setText(Double.toString(divide));
							// so you can use the last answer and continue to operate without having to retype it
							divide = total1;
							break;
						// case 5 is exponent 
						case 5:
							double power = 0.0;
							power = Math.pow(total1, total2);
							txtDisplay.setText(Double.toString(power));
							// so you can use the last answer and continue to operate without having to retype it
							power = total1;
							break;
						}
					}
				});
				btnEquals.setFont(new Font("Tahoma", Font.BOLD, 14));

		// add button clear
		JButton btnClear = new JButton("AC");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// clear the program
				total1 = 0.0;
				total2 = 0.0;
				txtDisplay.setText("");
			}
		});
		btnClear.setBounds(136, 234, 68, 49);
		panel1.add(btnClear);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		
			}
}

package jhormelyCalculadoraPoo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class CalculadoraJhormely extends JFrame {

	private JPanel contentPane;
	private JTextField recuadro1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraJhormely frame = new CalculadoraJhormely();
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
	public CalculadoraJhormely() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 472);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn0 = new JButton("1");
		btn0.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.14.08.jpeg"));
		btn0.setBorder(null);
		btn0.setHorizontalTextPosition(SwingConstants.CENTER);
		btn0.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.10.41.jpeg"));
		btn0.setBackground(new Color(255, 228, 225));
		btn0.setForeground(Color.DARK_GRAY);
		btn0.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText(recuadro1.getText()+"1");
			}
		});
		btn0.setBounds(16, 321, 55, 45);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("2");
		btn1.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.14.08.jpeg"));
		btn1.setBorder(null);
		btn1.setHorizontalTextPosition(SwingConstants.CENTER);
		btn1.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.10.41.jpeg"));
		btn1.setBackground(new Color(255, 228, 225));
		btn1.setForeground(Color.DARK_GRAY);
		btn1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText(recuadro1.getText()+"2");
			}
		});
		btn1.setBounds(81, 321, 55, 45);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("3");
		btn2.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.14.08.jpeg"));
		btn2.setBorder(null);
		btn2.setHorizontalTextPosition(SwingConstants.CENTER);
		btn2.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.10.41.jpeg"));
		btn2.setBackground(new Color(255, 228, 225));
		btn2.setForeground(Color.DARK_GRAY);
		btn2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText(recuadro1.getText()+"3");
			}
		});
		btn2.setBounds(146, 321, 55, 45);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("4");
		btn3.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.14.08.jpeg"));
		btn3.setBorder(null);
		btn3.setHorizontalTextPosition(SwingConstants.CENTER);
		btn3.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.10.41.jpeg"));
		btn3.setBackground(new Color(255, 228, 225));
		btn3.setForeground(Color.DARK_GRAY);
		btn3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText(recuadro1.getText()+"4");
			}
		});
		btn3.setBounds(16, 265, 55, 45);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("5");
		btn4.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.14.08.jpeg"));
		btn4.setBorder(null);
		btn4.setHorizontalTextPosition(SwingConstants.CENTER);
		btn4.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.10.41.jpeg"));
		btn4.setBackground(new Color(255, 228, 225));
		btn4.setForeground(Color.DARK_GRAY);
		btn4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText(recuadro1.getText()+"5");
			}
		});
		btn4.setBounds(81, 265, 55, 45);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("6");
		btn5.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.14.08.jpeg"));
		btn5.setBorder(null);
		btn5.setHorizontalTextPosition(SwingConstants.CENTER);
		btn5.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.10.41.jpeg"));
		btn5.setBackground(new Color(255, 228, 225));
		btn5.setForeground(Color.DARK_GRAY);
		btn5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText(recuadro1.getText()+"6");
			}
		});
		btn5.setBounds(146, 265, 55, 45);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("7");
		btn6.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.14.08.jpeg"));
		btn6.setBorder(null);
		btn6.setHorizontalTextPosition(SwingConstants.CENTER);
		btn6.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.10.41.jpeg"));
		btn6.setBackground(new Color(255, 228, 225));
		btn6.setForeground(Color.DARK_GRAY);
		btn6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText(recuadro1.getText()+"7");
			}
		});
		btn6.setBounds(16, 209, 55, 45);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("8");
		btn7.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.14.08.jpeg"));
		btn7.setBorder(null);
		btn7.setHorizontalTextPosition(SwingConstants.CENTER);
		btn7.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.10.41.jpeg"));
		btn7.setBackground(new Color(255, 228, 225));
		btn7.setForeground(Color.DARK_GRAY);
		btn7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText(recuadro1.getText()+"8");
			}
		});
		btn7.setBounds(81, 209, 55, 45);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("9");
		btn8.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.14.08.jpeg"));
		btn8.setBorder(null);
		btn8.setHorizontalTextPosition(SwingConstants.CENTER);
		btn8.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.10.41.jpeg"));
		btn8.setBackground(new Color(255, 228, 225));
		btn8.setForeground(Color.DARK_GRAY);
		btn8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText(recuadro1.getText()+"9");
			}
		});
		btn8.setBounds(146, 209, 55, 45);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("0");
		btn9.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.14.08.jpeg"));
		btn9.setBorder(null);
		btn9.setHorizontalTextPosition(SwingConstants.CENTER);
		btn9.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.10.41.jpeg"));
		btn9.setBackground(new Color(255, 228, 225));
		btn9.setForeground(Color.DARK_GRAY);
		btn9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText(recuadro1.getText()+"0");
			}
		});
		btn9.setBounds(16, 377, 55, 45);
		contentPane.add(btn9);
		
		JButton btn10 = new JButton(".");
		btn10.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.14.08.jpeg"));
		btn10.setBorder(null);
		btn10.setHorizontalTextPosition(SwingConstants.CENTER);
		btn10.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.10.41.jpeg"));
		btn10.setBackground(new Color(255, 228, 225));
		btn10.setForeground(Color.DARK_GRAY);
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText(recuadro1.getText()+".");
			}
		});
		btn10.setBounds(81, 376, 55, 45);
		contentPane.add(btn10);
		
		JButton btn11 = new JButton("/");
		btn11.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.14.08.jpeg"));
		btn11.setBorder(null);
		btn11.setHorizontalTextPosition(SwingConstants.CENTER);
		btn11.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 09.50.39.jpeg"));
		btn11.setForeground(new Color(199, 21, 133));
		btn11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn11.setBackground(new Color(255, 228, 225));
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText(recuadro1.getText()+"/");
			}
		});
		btn11.setBounds(81, 153, 55, 45);
		contentPane.add(btn11);
		
		JButton btn12 = new JButton("*");
		btn12.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.14.08.jpeg"));
		btn12.setBorder(null);
		btn12.setHorizontalTextPosition(SwingConstants.CENTER);
		btn12.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 09.50.39.jpeg"));
		btn12.setForeground(new Color(199, 21, 133));
		btn12.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		btn12.setBackground(new Color(255, 228, 225));
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText(recuadro1.getText()+"*");
			}
		});
		btn12.setBounds(146, 153, 55, 45);
		contentPane.add(btn12);
		
		JButton btn13 = new JButton("-");
		btn13.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.14.08.jpeg"));
		btn13.setBorder(null);
		btn13.setHorizontalTextPosition(SwingConstants.CENTER);
		btn13.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 09.50.39.jpeg"));
		btn13.setForeground(new Color(199, 21, 133));
		btn13.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn13.setBackground(new Color(255, 228, 225));
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText(recuadro1.getText()+"-");
			}
		});
		btn13.setBounds(211, 153, 55, 45);
		contentPane.add(btn13);
		
		JButton btn14 = new JButton("+");
		btn14.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.28.36.jpeg"));
		btn14.setBorder(null);
		btn14.setHorizontalTextPosition(SwingConstants.CENTER);
		btn14.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.21.58.jpeg"));
		btn14.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		btn14.setForeground(new Color(199, 21, 133));
		btn14.setBackground(new Color(255, 228, 225));
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText(recuadro1.getText()+"+");
			}
		});
		btn14.setBounds(211, 209, 55, 157);
		contentPane.add(btn14);
		
		JButton btn17 = new JButton("=");
		btn17.setBorder(null);
		btn17.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.29.44.jpeg"));
		btn17.setHorizontalTextPosition(SwingConstants.CENTER);
		btn17.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.25.02.jpeg"));
		btn17.setForeground(new Color(255, 255, 255));
		btn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena=recuadro1.getText();
				int largo = cadena.length();
				for(int i=0;i<largo;i++) {
					char caracter=cadena.charAt(i);
					if(caracter=='+'){
						String parte1 = cadena.substring(0,i);
						String parte2 = cadena.substring(i+1,largo);
						double resultado=Double.parseDouble(parte1)+Double.parseDouble(parte2);
						recuadro1.setText(Double.toString(resultado));
					}
					if(caracter=='-'){
						String parte1 = cadena.substring(0,i);
						String parte2 = cadena.substring(i+1,largo);
						double resultado=Double.parseDouble(parte1)-Double.parseDouble(parte2);
						recuadro1.setText(Double.toString(resultado));
					}
					if(caracter=='*'){
						String parte1 = cadena.substring(0,i);
						String parte2 = cadena.substring(i+1,largo);
						double resultado=Double.parseDouble(parte1)*Double.parseDouble(parte2);
						recuadro1.setText(Double.toString(resultado));
					}
					if(caracter=='/'){
						String parte1 = cadena.substring(0,i);
						String parte2 = cadena.substring(i+1,largo);
						double resultado=Double.parseDouble(parte1)/Double.parseDouble(parte2);
						double eval = Double.parseDouble(parte2);
						if(eval==0) {
							recuadro1.setText("Indefinido");
						}
						else {
							recuadro1.setText(Double.toString(resultado));
						}
					}
				}
			}
		});
		btn17.setBackground(new Color(255, 228, 225));
		btn17.setFont(new Font("Trebuchet MS", Font.PLAIN, 26));
		btn17.setBounds(146, 377, 120, 45);
		contentPane.add(btn17);
		
		recuadro1 = new JTextField();
		recuadro1.setBackground(new Color(216, 191, 216));
		recuadro1.setForeground(Color.DARK_GRAY);
		recuadro1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		recuadro1.setHorizontalAlignment(SwingConstants.RIGHT);
		recuadro1.setBounds(0, 0, 284, 135);
		contentPane.add(recuadro1);
		recuadro1.setColumns(10);
		
		JButton btn15 = new JButton("C");
		btn15.setRolloverIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 10.14.08.jpeg"));
		btn15.setBorder(null);
		btn15.setHorizontalTextPosition(SwingConstants.CENTER);
		btn15.setIcon(new ImageIcon("C:\\Users\\Cliente\\eclipse\\calculador\\src\\imagenes\\WhatsApp Image 2021-06-07 at 09.50.39.jpeg"));
		btn15.setForeground(new Color(199, 21, 133));
		btn15.setBackground(new Color(255, 228, 225));
		btn15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuadro1.setText("");
			}
		});
		btn15.setBounds(16, 151, 55, 47);
		contentPane.add(btn15);
	}
}
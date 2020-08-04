import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Window.Type;

public class viewFatorial extends JFrame {

	private JPanel contentPane;
	private JTextField resultadoFatorial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewFatorial frame = new viewFatorial();
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
	public viewFatorial() {
		setTitle("Qual o fatorial?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtIgual = new JLabel("=");
		txtIgual.setFont(new Font("Arial Black", Font.BOLD, 30));
		txtIgual.setBounds(154, 125, 29, 16);
		contentPane.add(txtIgual);
		
		resultadoFatorial = new JTextField();
		resultadoFatorial.setEditable(false);
		resultadoFatorial.setBounds(195, 97, 116, 64);
		contentPane.add(resultadoFatorial);
		resultadoFatorial.setColumns(10);
		
		
		JLabel título = new JLabel("Qual o Fatorial?");
		título.setFont(new Font("Calibri", Font.BOLD, 40));
		título.setBounds(59, 30, 310, 42);
		contentPane.add(título);
		
		JSpinner spinValor = new JSpinner();
		spinValor.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				int valorDoSpin = Integer.parseInt(spinValor.getValue().toString());
				int valorDoFatorial = 1;
				int n = valorDoSpin;
				
				for(int i = 1; i <= valorDoSpin;i++) {
					valorDoFatorial = valorDoFatorial * i;
				}
				
				resultadoFatorial.setText(Integer.toString(valorDoFatorial));
			}
		});
		spinValor.setBackground(Color.WHITE);
		spinValor.setFont(new Font("Calibri", Font.BOLD, 36));
		spinValor.setBounds(36, 90, 106, 78);
		contentPane.add(spinValor);
	}
}

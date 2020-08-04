package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class trianguloDoisTestes extends JFrame {

	private JPanel contentPane;
	private JTextField valorA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trianguloDoisTestes frame = new trianguloDoisTestes();
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
	public trianguloDoisTestes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		valorA = new JTextField();
		valorA.setBounds(145, 68, 116, 22);
		contentPane.add(valorA);
		valorA.setColumns(10);
		
		JSlider sliderA = new JSlider();
		sliderA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				valorA.setText(Integer.toString(sliderA.getValue()));
			}
		});
		sliderA.setValue(0);
		sliderA.setBounds(273, 68, 200, 26);
		contentPane.add(sliderA);
	}

}

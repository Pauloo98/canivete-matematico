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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class viewTrinagulo extends JFrame {

	private JPanel contentPane;
	protected JTextField resultado;
	private JTextField valorA;
	private JTextField valorB;
	private JTextField valorC;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewTrinagulo frame = new viewTrinagulo();
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
	public viewTrinagulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		resultado = new JTextField();
		resultado.setBackground(UIManager.getColor("Button.background"));
		resultado.setForeground(Color.RED);
		resultado.setFont(new Font("Arial Black", Font.BOLD, 20));
		resultado.setBounds(178, 307, 291, 60);
		panel.add(resultado);
		resultado.setColumns(10);

		valorA = new JTextField();
		valorA.setBounds(304, 36, 39, 28);
		panel.add(valorA);
		valorA.setColumns(10);

		valorB = new JTextField();
		valorB.setColumns(10);
		valorB.setBounds(304, 77, 39, 28);
		panel.add(valorB);

		valorC = new JTextField();
		valorC.setColumns(10);
		valorC.setBounds(304, 118, 39, 28);
		panel.add(valorC);

		JSlider sliderA = new JSlider();
		sliderA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				valorA.setText(Integer.toString(sliderA.getValue()));
			}
		});
		sliderA.setBounds(355, 36, 200, 26);
		panel.add(sliderA);

		JSlider sliderB = new JSlider();
		sliderB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				valorB.setText(Integer.toString(sliderB.getValue()));
			}
		});
		sliderB.setBounds(355, 79, 200, 26);
		panel.add(sliderB);

		JSlider sliderC = new JSlider();
		sliderC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				valorC.setText(Integer.toString(sliderC.getValue()));
			}
		});
		sliderC.setBounds(355, 118, 200, 26);
		panel.add(sliderC);

		btnNewButton = new JButton("Veja o trinangulo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int catetoA = sliderA.getValue();
				int catetoB = sliderB.getValue();
				int catetoC = sliderC.getValue();

				
				if(catetoA == 0 || catetoB == 0  || catetoC == 0) {
					resultado.setText("Não forma um triângulo");
				}
				else if (catetoA == catetoB && catetoA == catetoC) {
					resultado.setText("Equilatero");
				} else if (catetoA == catetoB && catetoA != catetoC) {
					resultado.setText("Isóceles");
				} else {
					resultado.setText("Escaleno");
				}
			}

		});
		btnNewButton.setBounds(266, 269, 131, 25);
		panel.add(btnNewButton);
		
		JLabel imgTriangulo = new JLabel("");
		imgTriangulo.setIcon(new ImageIcon(viewTrinagulo.class.getResource("/imagem/triangulo.png")));
		imgTriangulo.setBounds(29, 23, 241, 199);
		panel.add(imgTriangulo);
		
		JLabel ladoA = new JLabel("A");
		ladoA.setFont(new Font("Arial Black", Font.PLAIN, 20));
		ladoA.setHorizontalAlignment(SwingConstants.CENTER);
		ladoA.setBounds(51, 83, 25, 22);
		panel.add(ladoA);
		
		JLabel lblC = new JLabel("C");
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblC.setBounds(118, 218, 25, 22);
		panel.add(lblC);
		
		JLabel ladoA_2 = new JLabel("B");
		ladoA_2.setHorizontalAlignment(SwingConstants.CENTER);
		ladoA_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		ladoA_2.setBounds(203, 89, 25, 22);
		panel.add(ladoA_2);
		
		JLabel lblNewLabel = new JLabel("Cateto A");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel.setBounds(567, 36, 77, 28);
		panel.add(lblNewLabel);
		
		JLabel lblCatetoB = new JLabel("Cateto B");
		lblCatetoB.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCatetoB.setBounds(567, 77, 77, 28);
		panel.add(lblCatetoB);
		
		JLabel lblCatetoC = new JLabel("Cateto C");
		lblCatetoC.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCatetoC.setBounds(567, 118, 77, 28);
		panel.add(lblCatetoC);
	}
}

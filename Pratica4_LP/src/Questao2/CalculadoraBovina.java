package Questao2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraBovina extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;
	private JTextField txtQtde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraBovina frame = new CalculadoraBovina();
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
	public CalculadoraBovina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LblValor = new JLabel(" Valor da Arroba ");
		LblValor.setBounds(10, 111, 113, 14);
		contentPane.add(LblValor);
		
		JLabel LblQtde = new JLabel("Quantidade de Arrobas");
		LblQtde.setBounds(10, 136, 139, 14);
		contentPane.add(LblQtde);
		
		JLabel lblNewLabel = new JLabel("Calculadora Bovina");
		lblNewLabel.setBounds(168, 27, 139, 14);
		contentPane.add(lblNewLabel);
		
		txtValor = new JTextField();
		txtValor.setBounds(94, 108, 150, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		txtQtde = new JTextField();
		txtQtde.setBounds(131, 133, 139, 20);
		contentPane.add(txtQtde);
		txtQtde.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular Total a Pagar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int valor = Integer.parseInt(txtValor.getText());
				int Qtde = Integer.parseInt(txtQtde.getText());
				JOptionPane.showMessageDialog(null, "O valor total é " + valor*Qtde );
				
			}
		});
		btnNewButton.setBounds(131, 201, 214, 23);
		contentPane.add(btnNewButton);
	}
}

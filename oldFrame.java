package lab9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class oldFrame extends JInternalFrame {
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public oldFrame() {
		setBounds(0, 0, 586, 451);
		getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("ID : ");
		lblId.setBounds(154, 139, 56, 16);
		getContentPane().add(lblId);
		
		textField = new JTextField();
		textField.setBounds(200, 136, 116, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search!");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i;
				try{
					i = Integer.parseInt(textField.getText().toString());
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(new JFrame(""), "Integer only");
				}
			}
		});
		btnSearch.setBounds(348, 135, 97, 25);
		getContentPane().add(btnSearch);

	}
}

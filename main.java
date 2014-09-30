package lab9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.DesktopPaneUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JDesktopPane;

public class main extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1;
	public newFrame newframe = new newFrame();
	private JDesktopPane desktopPane_1;
	public int total = 0;
	public HashMap<Integer,residentialProperty> a = new HashMap<Integer,residentialProperty>();
	public HashMap<Integer,commercialProperty> b = new HashMap<Integer,commercialProperty>();
	public property n;
	public residentialProperty r;
	public boolean check = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		initComponents();
		createEvents();
	}

	public void createEvents(){
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					newFrame newframe = new newFrame();
					desktopPane_1.add(newframe);
					newframe.show();
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oldFrame frame = new oldFrame();
				desktopPane_1.add(frame);
				frame.show();
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
	public void initComponents(){

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnNewButton = new JButton("New");

		btnNewButton.setBounds(45, 44, 97, 25);
		contentPane.add(btnNewButton);

		btnNewButton_1 = new JButton("Old");


		btnNewButton_1.setBounds(45, 113, 97, 25);
		contentPane.add(btnNewButton_1);

		btnNewButton_2 = new JButton("End");

		btnNewButton_2.setBounds(45, 182, 97, 25);
		contentPane.add(btnNewButton_2);

		desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBounds(149, 41, 586, 451);
		contentPane.add(desktopPane_1);
	}
	public class newFrame extends JInternalFrame {
		private JTextField nameField;
		private JTextField addressField;
		private JTextField nosField;
		private JTextField ageField;
		private JComboBox comboBox;

		private newFrame newframe;

		/**
		 * Create the frame.
		 */
		public newFrame() {
			setTitle("New");
			setIconifiable(true);
			setClosable(true);
			setBounds(0, 0, 586, 451);
			getContentPane().setLayout(null);

			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Property", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(12, 13, 546, 337);
			getContentPane().add(panel);

			JLabel lblName = new JLabel("Name : ");

			nameField = new JTextField();
			nameField.setColumns(10);

			JLabel lblAddress = new JLabel("Address : ");

			addressField = new JTextField();
			addressField.setColumns(10);

			JLabel lblNewLabel = new JLabel("Number of Stories : ");

			nosField = new JTextField();
			nosField.setColumns(10);

			JLabel lblAge = new JLabel("Age : ");

			ageField = new JTextField();
			ageField.setColumns(10);

			JLabel lblPurpose = new JLabel("Purpose : ");

			final JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Residential", "Commercial"}));
			GroupLayout gl_panel = new GroupLayout(panel);
			gl_panel.setHorizontalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_panel.createSequentialGroup()
															.addComponent(lblName)
															.addGap(18)
															.addComponent(nameField))
															.addGroup(gl_panel.createSequentialGroup()
																	.addComponent(lblAddress)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(addressField, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)))
																	.addContainerGap(168, GroupLayout.PREFERRED_SIZE))
																	.addGroup(gl_panel.createSequentialGroup()
																			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
																					.addComponent(lblNewLabel)
																					.addComponent(lblAge)
																					.addComponent(lblPurpose))
																					.addPreferredGap(ComponentPlacement.RELATED)
																					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
																							.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																							.addComponent(ageField)
																							.addComponent(nosField))
																							.addContainerGap(284, Short.MAX_VALUE))))
					);
			gl_panel.setVerticalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
							.addGap(37)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblName)
									.addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(29)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addComponent(lblAddress)
											.addComponent(addressField, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
											.addGap(30)
											.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
													.addComponent(lblNewLabel)
													.addComponent(nosField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
															.addComponent(lblAge)
															.addComponent(ageField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
															.addPreferredGap(ComponentPlacement.UNRELATED)
															.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
																	.addComponent(lblPurpose)
																	.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																	.addContainerGap(50, Short.MAX_VALUE))
					);
			panel.setLayout(gl_panel);

			JButton btnNext = new JButton("Next");
			btnNext.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					check = true;
					if(nameField.getText().length() == 0 || addressField.getText().length() == 0 || nosField.getText().length() == 0 || ageField.getText().length() == 0){
						JOptionPane.showMessageDialog(new JFrame(""), "Something is missing");
					}
					else{
						

						n = new property(++total);
						n.setAddress(addressField.getText());
						try{
							n.setNumberStories(Integer.parseInt(nosField.getText()));
						}
						catch(Exception e1){
							check = false;
							JOptionPane.showMessageDialog(new JFrame(""), "Number of Stories should have the type of integer");
						}

						try{
							n.setAge(Integer.parseInt(ageField.getText()));
						}
						catch(Exception e1){
							check = false;
							JOptionPane.showMessageDialog(new JFrame(""), "Age should have the type of integer");
						}
						if(check && Integer.parseInt(nosField.getText())<0){
							check = false;
							JOptionPane.showMessageDialog(new JFrame(""), "Number of Stories can't be a negative number");
						}
						else if(check && Integer.parseInt(ageField.getText())<0){
							check = false;
							JOptionPane.showMessageDialog(new JFrame(""), "Age can't be a negative number");
						}
						if(comboBox.getSelectedItem().equals("Residential")){
							if(check){
							n.setPurpose(true);
							residentialFrame r = new residentialFrame();
							desktopPane_1.add(r);
							r.show();
							dispose();
							}
							else{
								total--;
							}
						}
						else{
							if(check){
							n.setPurpose(false);
							commercialFrame c = new commercialFrame();
							desktopPane_1.add(c);
							c.show();
							dispose();
							}
							else{
								total--;
							}
						}



					}


				}
			});
			btnNext.setBounds(461, 363, 97, 25);
			getContentPane().add(btnNext);

		}
	}
	
	public class commercialFrame extends JInternalFrame {


		/**
		 * Create the frame.
		 */
		public commercialFrame() {
			setBounds(0, 0, 586, 451);
			getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Commercial", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(12, 13, 410, 238);
			getContentPane().add(panel);
			
			JLabel lblMode = new JLabel("Mode :");
			
			final JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Office", "Retail"}));
			
			JLabel lblFood = new JLabel("Food : ");
			
			final JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
			
			JLabel lblNewLabel = new JLabel("resAlso :");
			
			final JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
			
			JLabel lblNewLabel_1 = new JLabel("Parking : ");
			
			final JComboBox comboBox_3 = new JComboBox();
			comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
			GroupLayout gl_panel = new GroupLayout(panel);
			gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblMode)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblFood)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblNewLabel)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblNewLabel_1)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(268, Short.MAX_VALUE))
			);
			gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGap(26)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblMode))
						.addGap(18)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblFood)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel)
							.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_1)
							.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(51, Short.MAX_VALUE))
			);
			panel.setLayout(gl_panel);
			
			JButton btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					commercialProperty p = new commercialProperty(n);
				if(comboBox.getSelectedItem().equals("Office")){
					p.setMode(0);
				}
				else{
					p.setMode(1);
				}
				
				if(comboBox_1.getSelectedItem().equals("Yes")){
					p.setFood(true);
				}
				else{
					p.setFood(false);
				}
				if(comboBox_2.getSelectedItem().equals("Yes")){
					p.setResAlso(true);
				}
				else{
					p.setResAlso(false);
				}
				if(comboBox_3.getSelectedItem().equals("Yes")){
					p.setParking(true);
				}
				else{
					p.setParking(false);
				}
				b.put(p.getId(), p);
				JOptionPane.showMessageDialog(new JFrame(""), "Successfully Saved");
				dispose();
				}
			});
			btnSave.setBounds(327, 264, 97, 25);
			getContentPane().add(btnSave);

		}

	}

	
	
	public class residentialFrame extends JInternalFrame {
		private JTextField textField;
		private JTextField textField_1;



		/**
		 * Create the frame.
		 */
		public residentialFrame() {
			
			setBounds(0, 0, 586, 451);
			getContentPane().setLayout(null);

			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Residential", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(12, 13, 410, 212);
			getContentPane().add(panel);

			JLabel lblMultiple = new JLabel("Multiple Dwelling : ");

			final JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));

			JLabel lblExtraWaterFaucet = new JLabel("Extra Water faucet : ");

			final JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));

			JLabel lblSizeOfPorch = new JLabel("Size of Porch : ");

			textField = new JTextField();
			textField.setColumns(10);

			JLabel lblNewLabel = new JLabel("Size of Yard : ");

			textField_1 = new JTextField();
			textField_1.setColumns(10);
			GroupLayout gl_panel = new GroupLayout(panel);
			gl_panel.setHorizontalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblMultiple)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_panel.createSequentialGroup()
													.addComponent(lblExtraWaterFaucet)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
													.addGroup(gl_panel.createSequentialGroup()
															.addComponent(lblSizeOfPorch)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
															.addGroup(gl_panel.createSequentialGroup()
																	.addComponent(lblNewLabel)
																	.addPreferredGap(ComponentPlacement.UNRELATED)
																	.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
																	.addContainerGap(176, Short.MAX_VALUE))
					);
			gl_panel.setVerticalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblMultiple)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
											.addComponent(lblExtraWaterFaucet)
											.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
													.addComponent(lblSizeOfPorch)
													.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
													.addGap(18)
													.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
															.addComponent(lblNewLabel)
															.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
															.addContainerGap(79, Short.MAX_VALUE))
					);
			panel.setLayout(gl_panel);

			JButton btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					check = true;
					if(textField.getText().length() !=0 && textField_1.getText().length() != 0){
						r = new residentialProperty(n);
						if(comboBox.getSelectedItem().equals("Yes")){
							r.setMultiple(true);
							
						}
						else{
							r.setMultiple(false);

						}
						if(comboBox_1.getSelectedItem().equals("Yes")){
							r.setExternalWater(true);
						}
						else{
							r.setExternalWater(false);
						}
						try{
							r.setPorchSize(Integer.parseInt(textField.getText()));
						}
						catch(Exception e1){
							check = false;
							JOptionPane.showMessageDialog(new JFrame(""), "Size of Porch should have the type of integer");
						}
						try{
							r.setYardSize(Integer.parseInt(textField_1.getText()));
						}
						catch(Exception e1){
							check = false;
							JOptionPane.showMessageDialog(new JFrame(""), "Size of Yard should have the type of integer");
						}
					}
					if(check && Integer.parseInt(textField.getText())<0){
						check = false;
						JOptionPane.showMessageDialog(new JFrame(""), "Size of Porch can't be a negative number");
					}
					else if(check && Integer.parseInt(textField_1.getText())<0){
						check = false;
						JOptionPane.showMessageDialog(new JFrame(""), "Size of Yard can't be a negative number");
					}
					if(check){
						a.put(r.getId(), r);
						dispose();
						JOptionPane.showMessageDialog(new JFrame(""), "Successfully Saved");
					}
				}
			});
			btnSave.setBounds(322, 238, 97, 25);
			getContentPane().add(btnSave);

		}

	}

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
					int i = 0;
					try{
						i = Integer.parseInt(textField.getText().toString());
					}
					catch(Exception e){
						JOptionPane.showMessageDialog(new JFrame(""), "Integer only");
					}
					if(a.containsKey(i)){
						JOptionPane.showMessageDialog(new JFrame(""), "ID : " + a.get(i).getId()+ " Address : " + a.get(i).getAddress() + " numberStories : " + a.get(i).getNumberStories() + 
							    " Age : " + a.get(i).getAge() + " Purpose : " + "Residential" + " Multiple : " + a.get(i).isMultiple() +
								   " ExternalWater : " + a.get(i).isExternalWater() + " PorchSize : " + a.get(i).getPorchSize()+ " YardSize : " + a.get(i).getYardSize());
						dispose();
					}
					else if(b.containsKey(i)){
						JOptionPane.showMessageDialog(new JFrame(""),"ID : " + b.get(i).getId()+ " Address : " + b.get(i).getAddress() + " numberStories : " + b.get(i).getNumberStories() + 
					    " Age : " + b.get(i).getAge() + " Purpose : " + "Commercial" + " Mode : " + b.get(i).getMode() +
					   " Food : " + b.get(i).isFood() + " ResAlso : " + b.get(i).isResAlso()+ " Parking : " + b.get(i).isParking());
						dispose();
					}
					else{
						JOptionPane.showMessageDialog(new JFrame(""), "Not Found");
						dispose();
					}
				}
			});
			btnSearch.setBounds(348, 135, 97, 25);
			getContentPane().add(btnSearch);

		}
	}

}

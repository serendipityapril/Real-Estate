package lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class writeProperty {
	writeProperty(int id, String address, int nos, int age, boolean purpose){
		String tempString = id + " " + address + " " + nos + " " + age + " " + purpose;
		System.out.println(tempString);
		try{			
			byte[] stringToByte = tempString.getBytes();
		
			File file = new File("property.txt");
	
			PrintWriter writer;
			try {
				writer = new PrintWriter(file);
				writer.print(tempString);
				writer.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}					
	
			
		
		}catch(Exception e1){
			JOptionPane.showMessageDialog(null, e1, "¿À·ù", JOptionPane.ERROR_MESSAGE);			
		}
	}
}
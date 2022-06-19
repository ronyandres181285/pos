package pos;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.*;

public class FrmPrincipal extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(()-> {
			try 
			{
				new FrmPrincipal();
			}
			catch(Exception e) 
			{
				e.getStackTrace();
			}
			
		});
	}
	
	public FrmPrincipal() {
		Toolkit tool= Toolkit.getDefaultToolkit();
		Dimension pant = tool.getScreenSize();
		int x = pant.width;
		int y = pant.height;
		setBounds(0,0,x,y);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("POS");
		
		
		setVisible(true);
	}
}

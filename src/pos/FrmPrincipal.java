package pos;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class FrmPrincipal extends JFrame 
{


	private static final long serialVersionUID = 1L;

	public static void main(String[] args) 
	{
		new FrmPrincipal();
	}

	public FrmPrincipal() 
	{
		Toolkit tool= Toolkit.getDefaultToolkit();
		Dimension pant = tool.getScreenSize();
		int x = pant.width;
		int y = pant.height;
		setBounds((x-600)/2,(y-400)/2,600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("POS    LOGIN");
		
		
		setVisible(true);
		
	}
}

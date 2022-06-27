package pos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class FrmLogin extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contenedor;
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;
	private JCheckBox chbMantenerSesion;
	private JButton btnIngresar;
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(()-> 
		{
				try 
				{
				new FrmLogin();
				} 
				catch (Exception e) 
				{
					e.printStackTrace();		
				}
		});
	}

	public FrmLogin() 
	{
		Toolkit tool= Toolkit.getDefaultToolkit();
		Dimension pant = tool.getScreenSize();
		int x = pant.width;
		int y = pant.height;
		setBounds((x-440)/2,(y-220)/2,440,220);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("POS                 INGRESO DE USUARIO");
		setResizable(false);
		setUndecored(false);
		
		contenedor=new JPanel();
		contenedor.setLayout(null);
		add(contenedor);
		
		JLabel lblUsuario=new JLabel("Usuario");
		lblUsuario.setBounds(170,20,100,20);
		contenedor.add(lblUsuario);
		
		txtUsuario= new JTextField();
		txtUsuario.setBounds(260,20,150,20);
		txtUsuario.addActionListener(new Eventos());
		contenedor.add(txtUsuario);
		
		JLabel lblContrasena=new JLabel("Contraseña");
		lblContrasena.setBounds(170,50,100,20);
		contenedor.add(lblContrasena);
		
		txtContrasena=new JPasswordField();
		txtContrasena.setBounds(260,50,150,20);
		txtContrasena.addActionListener(new Eventos());
		contenedor.add(txtContrasena);
		
		chbMantenerSesion=new JCheckBox("Mantener la sesión iniciada");
		chbMantenerSesion.setBounds(170,80,200,20);
		contenedor.add(chbMantenerSesion);
		
		btnIngresar=new JButton("Ingresar");
		btnIngresar.setBounds(220,120,150,40);
		btnIngresar.addActionListener(new Eventos());
		contenedor.add(btnIngresar);
		
		setVisible(true);		
	}
	
	private class Eventos implements ActionListener
	{
		
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==btnIngresar)
			{
				if(txtUsuario.getText().equals("Admin") && String.valueOf(txtContrasena.getPassword()).equals("12345"))
				{
					
					new FrmPrincipal();
					setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"El usuario o la contraseña son incorrectas.");
				}
		
			}
			else if(e.getSource()==txtUsuario)
			{
				txtContrasena.requestFocus();
			}
			else {
				btnIngresar.requestFocus();		
			}
		}
		
	}
}			


package pos;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.*;

public class FrmPrincipal extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel contenedor;
	private JMenuBar menuBar;
	private JMenu mnReportes;
	private JMenu mnProducto;
	private JMenu mnAdmiInventario;
	private JMenu mnEmpleados;
	private JMenu mnClientes;
	private JMenu mnCuenta;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mniListaProducto;
	private JMenuItem mniCategorias;
	private JMenuItem mniModificadores;
	private JMenuItem mniDescuentos;
	private JMenuItem mniListaEmpleados;
	private JMenuItem mniDerechoAcceso;
	private JMenuItem mniResumenVentas;
	private JMenuItem mniProductoVentas;
	private JMenuItem mniCategoriaVentas;
	private JMenuItem mniEmpleadosVentas;
	private JMenuItem mniTipoPagoVentas;
	private JMenuItem mniIngresos;
	private JMenuItem mniModificadorVentas;
	private JMenuItem mniDescuentosReportes;
	private JMenuItem mniImpuestos;

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
		
		contenedor=new JPanel();
		add(contenedor);
		//Creación de la barra de Menú
		menuBar=new JMenuBar();
		contenedor.add(menuBar);
		//Creación de la pestaña Reportes
		mnReportes=new JMenu("Reportes");
		menuBar.add(mnReportes);

		mniResumenVentas=new JMenuItem("Resumen de Ventas");
		mnReportes.add(mniResumenVentas);

		mniProductoVentas=new JMenuItem("Ventas por Producto");
		mnReportes.add(mniProductoVentas);

		mniCategoriaVentas=new JMenuItem("Ventas por Categoría");
		mnReportes.add(mniCategoriaVentas);

		mniEmpleadosVentas=new JMenuItem("Ventas por Empleado");
		mnReportes.add(mniEmpleadosVentas);

		mniTipoPagoVentas=new JMenuItem("Ventas por tipo de Pago");
		mnReportes.add(mniTipoPagoVentas);

		mniModificadorVentas=new JMenuItem("Ventas por tipo de Pago");
		mnReportes.add(mniModificadorVentas);

		mniIngresos=new JMenuItem("Ingresos");
		mnReportes.add(mniIngresos);

		mniDescuentosReportes=new JMenuItem("Descuentos");
		mnReportes.add(mniDescuentosReportes);

		mniImpuestos=new JMenuItem("Impuestos");
		mnReportes.add(mniImpuestos);
		//Creación de la pestaña Productos
		mnProducto=new JMenu("Productos");
		menuBar.add(mnProducto);

		mniListaProducto=new JMenuItem("Lista de Productos");
		mnProducto.add(mniListaProducto);

		mniCategorias=new JMenuItem("Categorías");
		mnProducto.add(mniCategorias);

		mniModificadores=new JMenuItem("Modificadores");
		mnProducto.add(mniModificadores);

		mniDescuentos=new JMenuItem("Descuentos");
		mnProducto.add(mniDescuentos);
		//Creación de la pestaña Creación de Inventario
		mnAdmiInventario=new JMenu("Administración de Inventario");
		menuBar.add(mnAdmiInventario);
		//Creación de la pestaña Empleados
		mnEmpleados=new JMenu("Empleados");
		menuBar.add(mnEmpleados);

		mniListaEmpleados=new JMenuItem("Lista de Empleados");
		mnEmpleados.add(mniListaEmpleados);

		mniDerechoAcceso=new JMenuItem("Derechos de Acceso");
		mnEmpleados.add(mniDerechoAcceso);
		//Creación de la pestaña Clientes
		mnClientes=new JMenu("Clientes");
		menuBar.add(mnClientes);
		//Creación de la pestaña Cuenta
		mnCuenta=new JMenu("Cuenta");
		menuBar.add(mnCuenta);
		//Creacion de la pestaña Configuración
		mnConfiguracion=new JMenu("Configuración");
		menuBar.add(mnConfiguracion);
		//Creación de la pestaña Ayuda
		mnAyuda=new JMenu("Ayuda");
		menuBar.add(mnAyuda);



		setVisible(true);
	}
}

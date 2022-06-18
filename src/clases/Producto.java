package clases;

public class Producto {
	private String codigo;
	private String descripcion;
	private String categoria;
	private int cantidad;
	private double precio;
	private double costo;
	
	Producto(String codigo,String descripcion,String categoria){
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.categoria=categoria;
		cantidad=0;
		precio=0;
		costo=0;
	}
	
	Producto(String codigo,String descripcion){
		this(codigo,descripcion,"Varios");
	}
	
	
}

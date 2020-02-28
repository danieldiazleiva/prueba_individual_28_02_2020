package prueba_individual;

public class Television extends Electrodomesticos 
{
	int resolucion;
	boolean sintonizador;
	public Television ()
	{
		resolucion=20;
		sintonizador=false;
	}
	public Television (int precio, int peso)
	{
		super(precio,peso);
	}
	
	public Television(int precio, int resolucion, boolean sintonizador, String color, int peso, char consumo) 
	{
		super(precio, color, peso, consumo);
		this.resolucion=resolucion;
		this.sintonizador=sintonizador;
	}
	public double precio_final()
	{
		int presolucion=0;
		double psintonizado=1;
		if(resolucion>40)
		{
			presolucion=50;
		}
		if(sintonizador=true)
		{
			psintonizado=1.3;
		}
		double precio_final=(super.precio_final())*psintonizado+presolucion;
		return precio_final;
	}
	
	

}

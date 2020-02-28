package prueba_individual;

public class Lavadora extends Electrodomesticos
{
	int carga;
	public Lavadora()
	{
		carga=5;
	}
	
	public Lavadora(int peso, int precio)
	{
		super(peso, precio);
	}
	public Lavadora(int precio, int peso, int carga, String color, char consumo) 
	{
		super(precio, color, peso, consumo);
		this.carga=carga;
	}
	public int getCarga() {
		return carga;
	}
	public double precio_final()
	{
		int ppeso=0;
		int pcarga=0;
		
		if(super.peso<20)
		{
			ppeso=10;
		}
		if(super.peso<50&&super.peso>19)
		{
			ppeso=50;
		}
		if(super.peso>49&&super.peso<80)
		{
			ppeso=80;
		}
		if(super.peso>80)
		{
			ppeso=100;
		}
		if(carga>=30)
		{
			pcarga=50;
		}
		double precio_final=super.precio_final()+ppeso+pcarga;
		return precio_final;
	}
	
}

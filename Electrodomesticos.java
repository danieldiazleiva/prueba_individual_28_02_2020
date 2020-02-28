package prueba_individual;

public class Electrodomesticos 
{

	protected int precio;
	private String color; 
	protected int peso;
	protected char consumo;
	public Electrodomesticos()
	{
		precio=100;
		color="blanco"; 
		peso=5;
		consumo='F';
	}
	public Electrodomesticos(int precio, int peso)
	{
		this.precio=precio;
		this.peso=peso;
		color="blanco";
		consumo='F';
				
	}
	public Electrodomesticos(int precio, String color,	int peso, char consumo)
	{
		this.color=color;
		this.peso=peso;
		this.consumo=consumo;
		this.precio=precio;
		
	}
	public int getPrecio() 
	{
		return precio;
	}
	public String getColor() 
	{
		return color;
	}
	public int getPeso() 
	{
		return peso;
	}
	public char getConsumo() 
	{
		return consumo;
	}
	public void setConsumo(char consumo) 
	{
		this.consumo=consumo;
	}
	public void setColor(String color) 
	{
		this.color=color;
	}
	public double precio_final()
	{
		int pconsumo = 0;
		
		switch(getConsumo())
		{
		case 'A':
			pconsumo=100;
			break;
		case 'B':
			pconsumo=80;
			break;
		case 'C':
			pconsumo=60;
			break;
		case 'D':
			pconsumo=50;
			break;
		case 'E':
			pconsumo=30;
			break;
		case 'F':
			pconsumo=10;
			break;
		}
			double precio_final=precio+pconsumo;
			return precio_final;
	}
	public void comprobarConsumo()
	{
		int cont=0;
		char [] cconsumo;
		cconsumo=new char []{'A','B','C','D','E','F'};
		char c=getConsumo();
		for(int i=0;i<6;i++)
		{
		if((c == cconsumo[i]))
		{
			cont=1;
		}
		}
		if(cont==0)
		{
			setConsumo('F');
		}
	}
	public void comprobarColor()
	{
		int cont=0;
		String [] ccolor;
		ccolor=new String []{"blanco","negro","rojo","azul","gris"};
		String c=getColor();
		for(int i=0;i<5;i++)
		{
		if((c == ccolor[i]))
		{
			cont=1;
		}
		}
		if(cont==0)
		{
			setColor("blanco");
		}
	}
}

package prueba_individual;

public class Ejecutable 
{
	public static void main(String[] args) 
	{
		double precio_total=0;
	Electrodomesticos[] producto = new Electrodomesticos[10];
	producto[0]=new Electrodomesticos();
	producto[1]=new Lavadora();
	producto[2]=new Lavadora(200,55,25,"rojo",'C');
	producto[3]=new Lavadora(300,70,35,"azul",'D');
	producto[4]=new Electrodomesticos(600,90);
	producto[5]=new Television(80,21,true,"blanco",15,'A');
	producto[6]=new Television(90,20);
	producto[7]=new Television(100,37,true,"rojo",25,'C');
	producto[8]=new Lavadora(150,20,30,"verde",'X');
	producto[9]=new Television(150,50,true,"gris",35,'F');
	
	for(int i=0; i<10;i++) 
	{
		producto[i].comprobarColor();
		producto[i].comprobarConsumo();
	}
	
	System.out.println("");
	for(int i=0;i<10;i++)
	{
		
		if((producto[i] instanceof Lavadora)==true)
		{
			System.out.println("producto: LAVADORA");
		}
		else
		{
		if((producto[i] instanceof Television)==true)
		{
			System.out.println("producto: TELEVISION");
		}
		else
		{
			System.out.println("producto: ELECTRODOMESTICO");
		}
		}
		System.out.println("color: "+producto[i].getColor());
		System.out.println("peso: "+producto[i].getPeso());
		System.out.println("precio BASE: "+producto[i].getPrecio());
		System.out.println("consumo: "+producto[i].getConsumo());
		System.out.println("");
		System.out.println("________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("");
	
	
		System.out.println("precio producto: "+producto[i].precio_final());
		precio_total=precio_total+producto[i].precio_final();
		System.out.println("");
		System.out.println("________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("");
	
	}
	System.out.println("precio total de los 10 productos: "+precio_total);
	}

}

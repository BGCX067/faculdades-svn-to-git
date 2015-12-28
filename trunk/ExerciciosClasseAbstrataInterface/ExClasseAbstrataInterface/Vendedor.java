public class Vendedor extends Funcionario 
{
	public void aumentarSalario(double valor)
	{
		setSalario(getSalario() + (getSalario() * valor / 100));
	}
	
	public int compareTo(Object obj)
	{
		if (!(obj instanceof Vendedor ))
		 return -1;
		else
		{
		 Vendedor v = (Vendedor)obj;
		 if (getNome().equals(v.getNome()) && getSalario() == v.getSalario())
		  return 0;
		 else
		  return -1;
		}   
	}	
}
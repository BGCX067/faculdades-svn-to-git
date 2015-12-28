public class Gerente extends Funcionario
{
	public void aumentarSalario(double valor)
	{
		setSalario(getSalario() + (getSalario() * (2 * valor) / 100));
	}
	public int compareTo(Object obj)
	{
		if (!(obj instanceof Gerente ))
		 return -1;
		else
		{
		 Gerente g = (Gerente)obj;
		 if (getNome().equals(g.getNome()) && getSalario() == g.getSalario())
		  return 0;
		 else
		  return -1;
		}   
	}
}
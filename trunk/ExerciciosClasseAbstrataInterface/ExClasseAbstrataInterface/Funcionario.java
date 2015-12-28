public abstract class Funcionario implements Comparable
{
	private String nome;
	private double salario;
	
	public abstract void aumentarSalario(double valor);
	
	public double getSalario()
	{
		return salario;
	}
	 public void setSalario(double salario)
	 {
	 	this.salario = salario;
	 }
	 public String getNome()
	{
		return nome;
	}
	 public void setNome(String nome)
	 {
	 	this.nome = nome;
	 }
	 
	 public abstract int compareTo(Object obj);
}
import java.io.*;
import java.text.NumberFormat;
class CarregaFuncionarios
{
	Funcionario[] vet;
	Vendedor v;
	Gerente g;
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	public void carregarVet()
	{
		int limite;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			System.out.println("Entre com o limite: ");
			limite = Integer.parseInt(br.readLine());
			vet = new Funcionario[limite];
			for (int i=0;i<limite;i++)
			{
				if (i < limite / 2)
				{
					v = new Vendedor();
					System.out.println();
					System.out.print("Entre com o nome do Vendedor: ");
					v.setNome(br.readLine());
					System.out.print("Entre com o salario do Vendedor: ");
					v.setSalario(Double.parseDouble(br.readLine()));
					vet[i] = v;
				}
				else
				{
					g = new Gerente();
					System.out.println();
					System.out.print("Entre com o nome do Gerente: ");
					g.setNome(br.readLine());
					System.out.print("Entre com o salario do Gerente: ");
					g.setSalario(Double.parseDouble(br.readLine()));
					vet[i] = g;
				}
			}
		}
		catch(IOException e)
		{
			System.out.println("Erro de I/O");
			System.exit(0);
		}
		
	}
	public void listarFuncionarios()
	{
		for (int i=0;i < vet.length;i++)
		{
			System.out.println();
			System.out.println("Classe: "+vet[i].getClass().getName());
			System.out.println("Nome: "+vet[i].getNome());
			System.out.println("Salario: "+nf.format(vet[i].getSalario()));
			System.out.println();
		}
	}
	public void efetuarAumento(double aumento)
	{
		for (int i=0;i < vet.length;i++)
		{
			vet[i].aumentarSalario(aumento);
		}
		listarFuncionarios();
	}
	public int localizar(Funcionario[] vf,Funcionario f)
	{
		int i, auxI=-1;
		for (i=0;i < vf.length;i++)
		{
			if (vet[i].compareTo(f)==0)
			{
				auxI = i;
				break;
			}	
		}
		if (i < vf.length)
		  System.out.println("O Funcionario se encontra na posicao "+i+" do vetor");
		else
		  System.out.println("O Funcionario nao encontra no vetor!");		 
		return auxI;
	}
}
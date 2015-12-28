import java.io.*;
class TestaExercicio
{
	public static void main(String args[])
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		CarregaFuncionarios cf = new CarregaFuncionarios();
		cf.carregarVet();
		cf.listarFuncionarios();
		cf.efetuarAumento(10);
		try
		{
			Vendedor v = new Vendedor();
			System.out.println();
			System.out.print("Entre com o nome do Vendedor para localizar: ");
			v.setNome(br.readLine());
			System.out.println("Entre com o salario do Vendedor para localizar: ");
			v.setSalario(Double.parseDouble(br.readLine()));
			cf.localizar(cf.vet,v);
		}
		catch(IOException e)
		{
			System.out.println("Erro de I/O");
			System.exit(0);
		}
	}
}
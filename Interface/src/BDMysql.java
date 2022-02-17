
public class BDMysql implements InterfaceBD {

	@Override
	public void conectar() {
		System.out.println("Conectar");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectar");
		
	}

	@Override
	public void executarComando(String Comando) {
		System.out.println("Comando");
		
	}
	
}

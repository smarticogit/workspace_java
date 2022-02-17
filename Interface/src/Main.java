
public class Main {

	public static void main(String[] args) {
		InterfaceBD ibd;
		ibd = new BDMysql();
		
		ibd.conectar();
		ibd.desconectar();
		ibd.executarComando(null);
	}
}

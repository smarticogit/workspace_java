
public class TimeTeste {
	public static void main(String[] args) {
		
		Time t = new Time();
		t.setTime(5,5,8);
		
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
		t.setTime(12,15);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
	}

}

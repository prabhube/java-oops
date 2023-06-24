package multiple;

import org.abstraction.FullyAbctractionOne;

public class FullyAbsta implements FullyAbctractionOne,FullyAbstrctfinal {

	@Override
	public void bank() {
		System.out.println("public sector");
	}

	@Override
	public void rbi() {
		System.out.println("national ");
	}

	@Override
	public void hdfc() {
		System.out.println("private");
	}

	@Override
	public void tmb() {
		System.out.println("tuticorin");
	}

	@Override
	public void name(String name) {
System.out.println(name);		
	}
	public static void main(String[] args) {
		FullyAbsta a=new FullyAbsta();
		a.bank();
		a.hdfc();
		a.name("prabhu");
		a.rbi();
		a.tmb();
	}
}

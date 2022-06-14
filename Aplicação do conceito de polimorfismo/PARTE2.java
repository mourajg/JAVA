>>>
package Partes;
public class mamifero extends animal {
	private String corPelo;
	
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}
	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}
}

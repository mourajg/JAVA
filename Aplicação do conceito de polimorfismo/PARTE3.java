>>>
package Partes;
public class manchester_united extends Oitavas {
	private String cristiano_ronaldo;
	@Override
	public void jogar_em_casa() {
		System.out.println("Old Trafford");
	}
	@Override
	public void jogar_fora_de_casa() {
		System.out.println("Etihad Stadium");
	}
	public String getCristiano_ronaldo() {
		return cristiano_ronaldo;
	}
	public void setCristiano_ronaldo(String cristiano_ronaldo) {
		this.cristiano_ronaldo = cristiano_ronaldo;
	}
}
>>>

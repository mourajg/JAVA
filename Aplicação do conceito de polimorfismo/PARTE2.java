>>>
package Partes;
public class manchester_city extends Oitavas {
	private String erling_haaland;
	@Override
	public void jogar_em_casa() {
		System.out.println("Etihad Stadium");
	}
	@Override
	public void jogar_fora_de_casa() {
		System.out.println("Old Trafford");
	}
	public String getErling_haaland() {
		return erling_haaland;
	}
	public void setErling_haaland(String erling_haaland) {
		this.erling_haaland = erling_haaland;
	}
}
>>>

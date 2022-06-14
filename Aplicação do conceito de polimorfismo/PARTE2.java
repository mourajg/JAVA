>>>
package Partes;
public class manchester_city extends oitavas {
	private String Erling_Haaland;
	
	@Override
	public void jogar_em_casa() {
		System.out.println("Etihad Stadium");
	}
	@Override
	public void jogar_fora_de_casa() {
		System.out.println("Old Trafford");
	}
	public String getErling_Haaland() {
		return Erling_Haaland;
	}
	public void setErling_Haaland(String Erling_Haaland) {
		this.Erling_Haaland = Erling_Haaland;
	}
}
>>>

package Model;

public class TimesMod {
	private String nomeTime;
	private String cidade;
	private String estadio;
	private String material;
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstadio() {
		return estadio;
	}
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Times [nomeTime=" + nomeTime + ", cidade=" + cidade + ", estadio=" + estadio + ", material=" + material
				+ "]";
	}
	
}

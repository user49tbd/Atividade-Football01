package Model;

public class GruposMod {
	private String nomeTime;
	private String grupo;
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	@Override
	public String toString() {
		return "GruposMod [nomeTime=" + nomeTime + ", grupo=" + grupo + "]";
	}
}

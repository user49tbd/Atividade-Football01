package Model;

import java.time.LocalDate;

public class RodadaMod {
	private String timeNomeA;
	private String timeNomeB;
	private int golsA;
	private int golsB;
	private LocalDate data;
	public String getTimeNomeA() {
		return timeNomeA;
	}
	public void setTimeNomeA(String timeNomeA) {
		this.timeNomeA = timeNomeA;
	}
	public String getTimeNomeB() {
		return timeNomeB;
	}
	public void setTimeNomeB(String timeNomeB) {
		this.timeNomeB = timeNomeB;
	}
	public int getGolsA() {
		return golsA;
	}
	public void setGolsA(int golsA) {
		this.golsA = golsA;
	}
	public int getGolsB() {
		return golsB;
	}
	public void setGolsB(int golsB) {
		this.golsB = golsB;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "RodadaMod [timeNomeA=" + timeNomeA + ", timeNomeB=" + timeNomeB + ", golsA=" + golsA + ", golsB="
				+ golsB + ", data=" + data + "]";
	}
}

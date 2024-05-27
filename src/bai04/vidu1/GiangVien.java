package bai04.vidu1;

public class GiangVien extends Nguoi {
	private String masoGV;
	private String chuyennganh;
	private String trinhdo;

	public GiangVien(String hoten, int namsinh, String masoGV, String chuyennganh, String trinhdo) {
		super(hoten, namsinh);
		this.setMasoGV(masoGV);
		this.setChuyennganh(chuyennganh);
		this.setTrinhdo(trinhdo);
	}

	public String getMasoGV() {
		return masoGV;
	}

	public void setMasoGV(String masoGV) {
		this.masoGV = masoGV;
	}

	public String getChuyennganh() {
		return chuyennganh;
	}

	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}

	public String getTrinhdo() {
		return trinhdo;
	}

	public void setTrinhdo(String trinhdo) {
		this.trinhdo = trinhdo;
	}

	public String toString() {
		return "GiangVien [masoGV=" + masoGV + ", chuyennganh=" + chuyennganh + ", trinhdo=" + trinhdo + ", toString()="
				+ super.toString() + "]";
	}

}
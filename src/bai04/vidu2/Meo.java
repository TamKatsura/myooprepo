package bai04.vidu2;

public class Meo extends DongVat {
	private int soluong;
	private String loai;
	private String mau;

	public Meo(String ten, int namsinh, String giong, int soluong, String loai, String mau) {
		super(ten, namsinh, giong);
		this.soluong = soluong;
		this.loai = loai;
		this.mau = mau;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}

	@Override
	public String toString() {
		return "Meo{" + super.toString() + "soluong = " + soluong + ", chungloai = " + loai + ", mau = " + mau + '}';
	}

}
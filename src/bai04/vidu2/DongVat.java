package bai04.vidu2;

import java.time.LocalDate;

public class DongVat {
	private String ten;
	private int namsinh;
	private String giong;

	public DongVat(String ten, int namsinh, String giong) {
		this.ten = ten;
		this.setNamsinh(namsinh);
		this.giong = giong;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		LocalDate ngayhientai = LocalDate.now();
		int namhientai = ngayhientai.getYear();
		if (namsinh > namhientai && namsinh < 1950) {
			System.out.println("Nam sinh khong phu hop");
		} else {
			this.namsinh = namsinh;
		}
	}

	public String getGiong() {
		return giong;
	}

	public void setGiong(String giong) {
		this.giong = giong;
	}

	@Override
	public String toString() {
		return "DongVat{" + "ten = " + ten + ", namsinh = " + namsinh + ", giong = " + giong + '}';
	}

}
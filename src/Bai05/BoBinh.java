package Bai05;

public class BoBinh extends NhanVat {
	private int giao;
	private boolean khien;
	private boolean aogiap;

	public BoBinh(int giao, boolean khien, boolean aogiap, String ten, String id, String gioitinh, String hanhdong,
			int sucmanh) {
		super(ten, id, gioitinh, hanhdong, sucmanh);
		this.giao = giao;
		this.khien = khien;
		this.aogiap = aogiap;
	}

	public int getGiao() {
		return giao;
	}

	public void setGiao(int giao) {
		this.giao = giao;
	}

	public boolean isKhien() {
		return khien;
	}

	public void setKhien(boolean khien) {
		this.khien = khien;
	}

	public boolean isAogiap() {
		return aogiap;
	}

	public void setAogiap(boolean aogiap) {
		this.aogiap = aogiap;
	}

	@Override
	public String toString() {
		return "BoBinh{" + "giao=" + giao + ", khien=" + khien + ", aogiap=" + aogiap + '}';
	}

	@Override
	public void hanhdong() {
		System.out.println("1 punch");
	}

	@Override
	public void sucmanh() {
		System.out.println("1000%");
	}

}
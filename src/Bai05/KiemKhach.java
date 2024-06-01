package Bai05;

public class KiemKhach extends NhanVat {
	private int diemKinhNghiem;
	private String thuatDauKiem;

	public KiemKhach(String id, String ten, String gioiTinh, double nangLuong, int diemKinhNghiem,
			String thuatDauKiem) {
		super(id, ten, gioiTinh, nangLuong);
		this.diemKinhNghiem = diemKinhNghiem;
		this.thuatDauKiem = thuatDauKiem;
	}

	public int getDiemKinhNghiem() {
		return diemKinhNghiem;
	}

	public void setDiemKinhNghiem(int diemKinhNghiem) {
		this.diemKinhNghiem = diemKinhNghiem;
	}

	public String getThuatDauKiem() {
		return thuatDauKiem;
	}

	public void setThuatDauKiem(String thuatDauKiem) {
		this.thuatDauKiem = thuatDauKiem;
	}

	@Override
	public String toString() {
		return "KiemKhach{" + "diemKinhNghiem=" + diemKinhNghiem + ", thuatDauKiem='" + thuatDauKiem + '\'' + "} "
				+ super.toString();
	}

	@Override
	protected void hanhDong() {
		System.out.println("1 hit 1 kill");
	}

	@Override
	protected void sucManh() {
		System.out.println("+max 500% power");
	}
}

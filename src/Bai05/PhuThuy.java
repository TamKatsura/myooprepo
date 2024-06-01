package Bai05;

public class PhuThuy extends NhanVat {
	private String nguyenTo;
	private int sucManhPhuThuy;

	public PhuThuy(String id, String ten, String gioiTinh, double nangLuong, String nguyenTo, int sucManhPhuThuy) {
		super(id, ten, gioiTinh, nangLuong);
		this.nguyenTo = nguyenTo;
		this.sucManhPhuThuy = sucManhPhuThuy;
	}

	public String getNguyenTo() {
		return nguyenTo;
	}

	public void setNguyenTo(String nguyenTo) {
		this.nguyenTo = nguyenTo;
	}

	public int getSucManhPhuThuy() {
		return sucManhPhuThuy;
	}

	public void setSucManhPhuThuy(int sucManhPhuThuy) {
		this.sucManhPhuThuy = sucManhPhuThuy;
	}

	@Override
	public String toString() {
		return "PhuThuy{" + "nguyenTo='" + nguyenTo + '\'' + ", sucManhPhuThuy=" + sucManhPhuThuy + "} "
				+ super.toString();
	}

	@Override
	protected void hanhDong() {
		System.out.println("Dang thi trien phep thuat");
	}

	@Override
	protected void sucManh() {
		System.out.println("Co suc manh phu thuy");
	}

	public void raPhuPhep() {
		System.out.println("Dang su dung nguyen to lua");
	}
}
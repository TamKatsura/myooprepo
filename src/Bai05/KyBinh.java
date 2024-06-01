package Bai05;

public class KyBinh extends NhanVat {
	private String chienKy;
	private int sucChiuDung;

	public KyBinh(String id, String ten, String gioiTinh, double nangLuong, String chienKy, int sucChiuDung) {
		super(id, ten, gioiTinh, nangLuong);
		this.chienKy = chienKy;
		this.sucChiuDung = sucChiuDung;
	}

	public String getChienKy() {
		return chienKy;
	}

	public void setChienKy(String chienKy) {
		this.chienKy = chienKy;
	}

	public int getSucChiuDung() {
		return sucChiuDung;
	}

	public void setSucChiuDung(int sucChiuDung) {
		this.sucChiuDung = sucChiuDung;
	}

	@Override
	public String toString() {
		return "KyBinh{" + "chienKy='" + chienKy + '\'' + ", sucChiuDung=" + sucChiuDung + "} " + super.toString();
	}

	@Override
	protected void hanhDong() {
		System.out.println(this.getTen() + " đang thi triển xung phong tấn công!");
	}

	@Override
	protected void sucManh() {
		System.out.println("Sức mạnh: có sức chịu đựng " + this.getSucChiuDung());
	}

	public void xongPha() {
		System.out.println(this.getTen() + " đang xông pha nhanh chóng với " + this.getChienKy());
	}
}
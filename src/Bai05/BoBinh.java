package Bai05;

public class BoBinh extends NhanVat {
	private int sucManhPhongThu;
	private String giap;
	private int no;

	public BoBinh(String id, String ten, String gioiTinh, double nangLuong, int sucManhPhongThu, String giap) {
		super(id, ten, gioiTinh, nangLuong);
		this.sucManhPhongThu = sucManhPhongThu;
		this.giap = giap;
		this.no = 0;
	}

	public int getSucManhPhongThu() {
		return sucManhPhongThu;
	}

	public void setSucManhPhongThu(int sucManhPhongThu) {
		this.sucManhPhongThu = sucManhPhongThu;
	}

	public String getGiap() {
		return giap;
	}

	public void setGiap(String giap) {
		this.giap = giap;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "BoBinh{" + "sucManhPhongThu=" + sucManhPhongThu + ", giap='" + giap + '\'' + ", no=" + no + "} "
				+ super.toString();
	}

	@Override
	protected void hanhDong() {
		System.out.println("Tap tran");
	}

	@Override
	protected void sucManh() {
		System.out.println("Ky thuat chien dau bo binh");
	}
}

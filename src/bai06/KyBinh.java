package bai06;

public class KyBinh extends NhanVat implements TanCong, DiChuyen {
	private String loaivukhi;

	public KyBinh(String loaivukhi, String ten, String gioitinh, String id) {
		super(ten, gioitinh, id);
		this.loaivukhi = loaivukhi;
	}

	public String getLoaivukhi() {
		return loaivukhi;
	}

	public void setLoaivukhi(String loaivukhi) {
		this.loaivukhi = loaivukhi;
	}

	@Override
	public void hanhdong() {
		System.out.println("Ky Binh tan cong bang vu khi: " + loaivukhi);
	}

	@Override
	public void sucmanh() {
		System.out.println("Ky Binh co suc manh lon");
	}

	@Override
	public void tancongKhongVuKhi() {
		System.out.println("Ky Binh tan cong khong vu khi");
	}

	@Override
	public void tancongCoVuKhi() {
		System.out.println("Ky Binh tan cong co vu khi: " + loaivukhi);
	}

	@Override
	public void sangPhai() {
		System.out.println("Ky Binh di chuyen sang phai");
	}

	@Override
	public void sangTrai() {
		System.out.println("Ky Binh di chuyen sang trai");
	}

	@Override
	public void nhayLen() {
		System.out.println("Ky Binh nhay len");
	}

	@Override
	public void bochay() {
		System.out.println("Ky Binh bo chay");
	}

	@Override
	public String toString() {
		return "KyBinh{" + "loaivukhi=" + loaivukhi + '}';
	}
}

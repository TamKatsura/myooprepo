package bai06;

public class PhuThuy extends NhanVat implements TanCong, DiChuyen {
	private String loaiphapThuat;

	public PhuThuy(String loaiphapThuat, String ten, String gioitinh, String id) {
		super(ten, gioitinh, id);
		this.loaiphapThuat = loaiphapThuat;
	}

	public String getLoaiphapThuat() {
		return loaiphapThuat;
	}

	public void setLoaiphapThuat(String loaiphapThuat) {
		this.loaiphapThuat = loaiphapThuat;
	}

	@Override
	public void hanhdong() {
		System.out.println("Phu Thuy tan cong bang phap thuat: " + loaiphapThuat);
	}

	@Override
	public void sucmanh() {
		System.out.println("Phu Thuy co suc manh lon");
	}

	@Override
	public void tancongKhongVuKhi() {
		System.out.println("Phu Thuy tan cong khong vu khi");
	}

	@Override
	public void tancongCoVuKhi() {
		System.out.println("Phu Thuy tan cong co phap thuat: " + loaiphapThuat);
	}

	@Override
	public void sangPhai() {
		System.out.println("Phu Thuy di chuyen sang phai");
	}

	@Override
	public void sangTrai() {
		System.out.println("Phu Thuy di chuyen sang trai");
	}

	@Override
	public void nhayLen() {
		System.out.println("Phu Thuy nhay len");
	}

	@Override
	public void bochay() {
		System.out.println("Phu Thuy bo chay");
	}

	@Override
	public String toString() {
		return "PhuThuy{" + "loaiphapThuat=" + loaiphapThuat + '}';
	}
}

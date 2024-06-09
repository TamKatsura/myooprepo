package bai06;

public abstract class KiemKhach extends NhanVat implements TanCong, DiChuyen {
	private String loaikiem;
	private int capdo;

	public KiemKhach(String loaikiem, int capdo, String ten, String gioitinh, String id) {
		super(ten, gioitinh, id);
		this.loaikiem = loaikiem;
		this.capdo = capdo;
	}

	public String getLoaikiem() {
		return loaikiem;
	}

	public void setLoaikiem(String loaikiem) {
		this.loaikiem = loaikiem;
	}

	public int getCapdo() {
		return capdo;
	}

	public void setCapdo(int capdo) {
		this.capdo = capdo;
	}

	@Override
	public void sucmanh() {
		System.out.println("X2 nguoi thuong");
	}

	@Override
	public void hanhdong() {
		System.out.println("Tram Phong ");
	}

	@Override
	public void tancongKhongVuKhi() {
		System.out.println("Kiem Khach tan cong khong vu khi");
	}

	@Override
	public void tancongCoVuKhi() {
		System.out.println("Kiem Khach tan cong co vu khi: " + loaikiem);
	}

	@Override
	public void sangPhai() {
		System.out.println("Kiem Khach di chuyen sang phai");
	}

	@Override
	public void sangTrai() {
		System.out.println("Kiem Khach di chuyen sang trai");
	}

	@Override
	public void nhayLen() {
		System.out.println("Kiem Khach nhay len");
	}

	@Override
	public void bochay() {
		System.out.println("Kiem Khach bo chay");
	}

	@Override
	public String toString() {
		return "KiemKhach{" + "loaikiem=" + loaikiem + ", capdo=" + capdo + '}';
	}
}

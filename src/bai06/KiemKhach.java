package bai06;

public class KiemKhach extends NhanVat implements TanCong, DiChuyen {
	private int soKiem;
	private int capDoSuDung;

	public KiemKhach(int soKiem, int capDoSuDung, String ten, String gioitinh, String id) {
		super(ten, gioitinh, id);
		this.soKiem = soKiem;
		this.capDoSuDung = capDoSuDung;
	}

	public int getSoKiem() {
		return soKiem;
	}

	public void setSoKiem(int soKiem) {
		this.soKiem = soKiem;
	}

	public int getCapDoSuDung() {
		return capDoSuDung;
	}

	public void setCapDoSuDung(int capDoSuDung) {
		this.capDoSuDung = capDoSuDung;
	}

	@Override
	public void hanhdong() {
		System.out.println("Kiem Khach Tram Phong");
	}

	@Override
	public void sucmanh() {
		System.out.println("Kiem Khach x2 nguoi thuong");
	}

	@Override
	public void tancongKhongVuKhi() {
		System.out.println("Kiem Khach tan cong khong vu khi");
	}

	@Override
	public void tancongCoVuKhi() {
		System.out.println("Kiem Khach tan cong co vu khi: kiem");
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
		return "KiemKhach{" + "soKiem=" + soKiem + ", capDoSuDung=" + capDoSuDung + ", ten=" + getTen() + ", gioitinh="
				+ getGioitinh() + ", id=" + getId() + '}';
	}

}

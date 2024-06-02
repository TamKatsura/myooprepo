package Bai05;

public class KiemKhach extends NhanVat {
	private int so_kiem;
	private int cap_do_su_dung;

	public KiemKhach(int so_kiem, int cap_do_su_dung, String ten, String id, String gioitinh, String hanhdong,
			int sucmanh) {
		super(ten, id, gioitinh, hanhdong, sucmanh);
		this.so_kiem = so_kiem;
		this.cap_do_su_dung = cap_do_su_dung;
	}

	public int getSo_kiem() {
		return so_kiem;
	}

	public void setSo_kiem(int so_kiem) {
		this.so_kiem = so_kiem;
	}

	public int getCap_do_su_dung() {
		return cap_do_su_dung;
	}

	public void setCap_do_su_dung(int cap_do_su_dung) {
		this.cap_do_su_dung = cap_do_su_dung;
	}

	@Override
	public void hanhdong() {
		System.out.println("Chem");
	}

	@Override
	public void sucmanh() {
		System.out.println("Tram Phong"); // Generated from
											// nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
	}

	@Override
	public void setSucmanh(int sucmanh) {
		System.out.println("no");
	}

}
package Bai05;

public class KyBinh extends NhanVat {
	private boolean guom;
	private boolean giao;
	private boolean cung;
	private boolean ngua;

	public KyBinh(boolean guom, boolean giao, boolean cung, boolean ngua, String ten, String id, String gioitinh,
			String hanhdong, int sucmanh) {
		super(ten, id, gioitinh, hanhdong, sucmanh);
		this.guom = guom;
		this.giao = giao;
		this.cung = cung;
		this.ngua = ngua;
	}

	public boolean isGuom() {
		return guom;
	}

	public void setGuom(boolean guom) {
		this.guom = guom;
	}

	public boolean isGiao() {
		return giao;
	}

	public void setGiao(boolean giao) {
		this.giao = giao;
	}

	public boolean isCung() {
		return cung;
	}

	public void setCung(boolean cung) {
		this.cung = cung;
	}

	public boolean isNgua() {
		return ngua;
	}

	public void setNgua(boolean ngua) {
		this.ngua = ngua;
	}

	@Override
	public void sucmanh() {
		System.out.println("x2");
	}

	@Override
	public void hanhdong() {
		System.out.println("dang xung phong tan cong");
	}

	@Override
	public String toString() {
		return "KyBinh{" + "guom=" + guom + ", giao=" + giao + ", cung=" + cung + ", ngua=" + ngua + '}';
	}

}

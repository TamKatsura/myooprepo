package bailuyentap.model;

public class SinhVien {
	private String hoTen;
	private LopHoc lop;

	/**
	 * @param hoTen
	 * @param lop
	 */
	public SinhVien(String hoTen, LopHoc lop) {
		super();
		setHoTen(hoTen);
		this.lop = lop;
	}

	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	/**
	 * @return the lop
	 */
	public LopHoc getLop() {
		return lop;
	}

	/**
	 * @param lop the lop to set
	 */
	public void setLop(LopHoc lop) {
		this.lop = lop;
	}

	@Override
	public String toString() {
		return "SinhVien [hoTen=" + hoTen + ", lop=" + lop + "]";
	}

	public void addHoaDon(HoaDon hoaDon) {
		// TODO Auto-generated method stub

	}

}
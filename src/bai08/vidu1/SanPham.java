package bai08.vidu1;

public class SanPham {
	private int maSanPham;
	private String tenSanPham;

	/**
	 * @param maSanPham
	 * @param tenSanPham
	 */
	public SanPham(int maSanPham, String tenSanPham) {
		super();
		this.setMaSanPham(maSanPham);
		this.setTenSanPham(tenSanPham);
	}

	/**
	 * @return the maSanPham
	 */
	public int getMaSanPham() {
		return maSanPham;
	}

	/**
	 * @param maSanPham the maSanPham to set
	 */
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	/**
	 * @return the tenSanPham
	 */
	public String getTenSanPham() {
		return tenSanPham;
	}

	/**
	 * @param tenSanPham the tenSanPham to set
	 */
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + "]";
	}

}
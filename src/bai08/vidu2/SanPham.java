package bai08.vidu2;

public class SanPham implements Cloneable {
	private int maSanPham;
	private String tenSanPham;

	/**
	 * @param maSanPham
	 * @param tenSanPham
	 */
	public SanPham(int maSanPham, String tenSanPham) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
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

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
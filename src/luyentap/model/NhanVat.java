package luyentap.model;

public class NhanVat implements HanhDong, Cloneable {

	private String tenNhanVat;
	private int level;

	public NhanVat(String tenNhanVat, int level) {
		this.tenNhanVat = tenNhanVat;
		this.level = level;
	}

	public String getTenNhanVat() {
		return tenNhanVat;
	}

	public void setTenNhanVat(String tenNhanVat) {
		this.tenNhanVat = tenNhanVat;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public void DiChuyen() {
		System.out.println("...");
	}

	@Override
	public void TanCong() {
		System.out.println("...");
	}

	@Override
	public String toString() {
		return "NhanVat{" + "tenNhanVat=" + tenNhanVat + ", level=" + level + '}';
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

package Bai05;

public class NhanVat {
	private String ten;
	private String id;
	private String gioitinh;
	private String hanhdong;
	private int sucmanh;

	public NhanVat(String ten, String id, String gioitinh, String hanhdong, int sucmanh) {
		this.ten = ten;
		this.id = id;
		this.gioitinh = gioitinh;
		this.hanhdong = hanhdong;
		this.sucmanh = sucmanh;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getHanhdong() {
		return hanhdong;
	}

	public void setHanhdong(String hanhdong) {
		this.hanhdong = hanhdong;
	}

	public int getSucmanh() {
		return sucmanh;
	}

	public void setSucmanh(int sucmanh) {
		this.sucmanh = sucmanh;
	}

	public void hanhdong() {
		System.out.println("...");
	}

	public void sucmanh() {
		System.out.println("....");
	}

	@Override
	public String toString() {
		return "NhanVat{" + "ten=" + ten + ", id=" + id + ", gioitinh=" + gioitinh + ", hanhdong=" + hanhdong
				+ ", sucmanh=" + sucmanh + '}';
	}

}
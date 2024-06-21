package bai08.vidu4;

import java.util.ArrayList;

public class HoaDon implements Cloneable {
	private int maHoaDon;
	private ArrayList<SanPham> dssp;

	/**
	 * @param maHoaDon
	 * @param dssp
	 */
	public HoaDon(int maHoaDon, ArrayList<SanPham> dssp) {
		super();
		this.maHoaDon = maHoaDon;
		this.dssp = dssp;
	}

	/**
	 * @return the maHoaDon
	 */
	public int getMaHoaDon() {
		return maHoaDon;
	}

	/**
	 * @param maHoaDon the maHoaDon to set
	 */
	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	/**
	 * @return the dssp
	 */
	public ArrayList<SanPham> getDssp() {
		return dssp;
	}

	/**
	 * @param dssp the dssp to set
	 */
	public void setDssp(ArrayList<SanPham> dssp) {
		this.dssp = dssp;
	}

	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", dssp=" + dssp + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ArrayList<SanPham> dsspmoi = new ArrayList<SanPham>();
		for (SanPham item : this.dssp) {
			SanPham tam = new SanPham(item.getMaSanPham(), item.getTenSanPham());
			dsspmoi.add(tam);
		}
		HoaDon kq = new HoaDon(this.maHoaDon, dsspmoi);
		return kq;
	}

}
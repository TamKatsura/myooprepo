package luyentap.model;

public class CungTen extends VuKhi {

	private int AD;
	private double tanBan;

	public CungTen(int AD, double tanBan) {
		this.AD = AD;
		this.tanBan = tanBan;
	}

	public int getAD() {
		return AD;
	}

	public void setAD(int AD) {
		this.AD = AD;
	}

	public double getTanBan() {
		return tanBan;
	}

	public void setTanBan(double tanBan) {
		this.tanBan = tanBan;
	}

	@Override
	public String toString() {
		return "CungTen{" + "AD=" + AD + ", tanBan=" + tanBan + '}';
	}

	@Override
	public double sucTanCong() {
		return AD * 3;
	}
}
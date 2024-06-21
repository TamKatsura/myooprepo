package BT;

import java.util.ArrayList;

public class KyBinh implements Cloneable {
	private int maKyBinh;
	private ArrayList<VuKhi> dsvk;

	public KyBinh(int maKyBinh, ArrayList<VuKhi> dsvk) {
		super();
		this.maKyBinh = maKyBinh;
		this.dsvk = dsvk;
	}

	public int getMaKyBinh() {
		return maKyBinh;
	}

	public void setMaKyBinh(int maKyBinh) {
		this.maKyBinh = maKyBinh;
	}

	public ArrayList<VuKhi> getDsvk() {
		return dsvk;
	}

	public void setDsvk(ArrayList<VuKhi> dsvk) {
		this.dsvk = dsvk;
	}

	@Override
	public String toString() {
		return "KyBinh [maKyBinh=" + maKyBinh + ", dsvk=" + dsvk + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

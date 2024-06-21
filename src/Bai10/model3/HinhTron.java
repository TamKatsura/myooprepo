package Bai10.model3;

public class HinhTron extends HinhHoc {
	private double bankinh;

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI * bankinh * bankinh;
	}

	public HinhTron(double bankinh) {
		super();
		this.bankinh = bankinh;
	}

	public double getBankinh() {
		return bankinh;
	}

	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}

	@Override
	public String toString() {
		return "HinhTron [bankinh=" + bankinh + ", tinhDienTich()=" + tinhDienTich() + "]";
	}

}

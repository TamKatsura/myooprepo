package luyentap.model;

public class PhuThuy extends NhanVat {

	VuKhi vk;
	private boolean giap;

	public PhuThuy(String tenNhanVat, int level, VuKhi vk, boolean giap) {
		super(tenNhanVat, level);
		this.vk = vk;
		this.giap = giap;
	}

	public VuKhi getVk() {
		return vk;
	}

	public void setVk(VuKhi vk) {
		this.vk = vk;
	}

	public boolean isGiap() {
		return giap;
	}

	public void setGiap(boolean giap) {
		this.giap = giap;
	}

	@Override
	public String toString() {
		return "PhuThuy{" + super.toString() + "vk=" + vk + ", giap=" + giap + '}';
	}

	@Override
	public void TanCong() {
		System.out.println("Ban cau lua");
	}

	@Override
	public void DiChuyen() {
		System.out.println("Cuoi choi bay");
	}

	public double lucChien() {
		return (super.getLevel() * 5) + (vk.sucTanCong() + 2);
	}

}

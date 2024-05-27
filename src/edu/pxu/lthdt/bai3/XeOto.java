package edu.pxu.lthdt.bai3;

import java.time.LocalDate;

public class XeOto {
	private String hangxe;
	private int namsanxuat;
	private float dongco;

	public XeOto(String hangxe, int namsanxuat, float dongco) {
		this.hangxe = hangxe;
		LocalDate date = LocalDate.now();
		int namhientai = date.getYear();

		if (namsanxuat < 1885 || namsanxuat > namhientai) {
			System.out.println("Nam san xuat " + namsanxuat + " khong hop le.");
			this.namsanxuat = namhientai;
		} else {
			this.namsanxuat = namsanxuat;
		}

		if (dongco <= 0) {
			System.out.println("Dong co khong the co cong suat la " + dongco + " kW");
			this.dongco = 1.0f;
		} else {
			this.dongco = dongco;
		}
	}

	public String getHangxe() {
		return hangxe;
	}

	public int getNamsanxuat() {
		return namsanxuat;
	}

	public float getDongco() {
		return dongco;
	}

	public void setHangxe(String hangxe) {
		this.hangxe = hangxe;
	}

	public void setNamsanxuat(int namsanxuat) {
		LocalDate date = LocalDate.now();
		int namhientai = date.getYear();

		if (namsanxuat >= 1885 && namsanxuat <= namhientai) {
			this.namsanxuat = namsanxuat;
		} else {
			System.out.println("Nam san xuat " + namsanxuat + " khong hop le.");
		}
	}

	public void setDongco(float dongco) {
		if (dongco > 0) {
			this.dongco = dongco;
		} else {
			System.out.println("Dong co khong the co cong suat la " + dongco + " kW");
		}
	}

	@Override
	public String toString() {
		return "XeOto{hangxe='" + hangxe + "', namsanxuat=" + namsanxuat + ", dongco=" + dongco + '}';
	}
}

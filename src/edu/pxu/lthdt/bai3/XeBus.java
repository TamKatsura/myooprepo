package edu.pxu.lthdt.bai3;

import java.time.LocalDate;

public class XeBus {
	private String hangxe;
	private int namsanxuat;
	private float dongco;
	private int soghe;

	public XeBus(String hangxe, int namsanxuat, float dongco, int soghe) {
		this.hangxe = hangxe;
		LocalDate date = LocalDate.now();
		int namhientai = date.getYear();

		if (namsanxuat < 1894 || namsanxuat > namhientai) {
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

		if (soghe <= 0) {
			System.out.println("So ghe " + soghe + " khong hop le.");
			this.soghe = 1; //
		} else {
			this.soghe = soghe;
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

	public int getSoghe() {
		return soghe;
	}

	public void setHangxe(String hangxe) {
		this.hangxe = hangxe;
	}

	public void setNamsanxuat(int namsanxuat) {
		LocalDate date = LocalDate.now();
		int namhientai = date.getYear();

		if (namsanxuat >= 1894 && namsanxuat <= namhientai) {
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

	public void setSoghe(int soghe) {
		if (soghe > 0) {
			this.soghe = soghe;
		} else {
			System.out.println("So ghe " + soghe + " khong hop le.");
		}
	}

	@Override
	public String toString() {
		return "XeBus{hangxe='" + hangxe + "', namsanxuat=" + namsanxuat + ", dongco=" + dongco + ", soghe=" + soghe
				+ '}';
	}
}

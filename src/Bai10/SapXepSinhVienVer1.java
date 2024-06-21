package Bai10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Bai10.model.SinhVien;

public class SapXepSinhVienVer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SinhVien> dssv = new ArrayList<SinhVien>();
		dssv.add(new SinhVien("Loc", 10, 20));
		dssv.add(new SinhVien("LNhat", 8, 18));
		dssv.add(new SinhVien("Binh", 9, 19));
		System.out.println(dssv);
		// Sap xep hoten da duoc dinh nghia trong ham compareto lop SinhVien
		Collections.sort(dssv);
		for (SinhVien item : dssv) {
			System.out.println(item);
		}
	}

}

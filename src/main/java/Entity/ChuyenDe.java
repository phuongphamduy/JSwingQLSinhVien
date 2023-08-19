package Entity;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;

public class ChuyenDe {

	private String maCD, tenCD;
	private double hocPhi;
	private int thoiLuong;
	private String hinh, moTa;

	public ChuyenDe() {
		super();
	}

	public ChuyenDe(String maCD, String tenCD, double hocPhi, int thoiLuong, String hinh, String moTa) {
		super();
		this.maCD = maCD;
		this.tenCD = tenCD;
		this.hocPhi = hocPhi;
		this.thoiLuong = thoiLuong;
		this.hinh = hinh;
		this.moTa = moTa;
	}

	@Override
	public String toString() {
		return this.tenCD;
	}

	@Override
	public boolean equals(Object obj) {
		ChuyenDe other = (ChuyenDe) obj;
		return other.getMaCD().equals(this.getMaCD());
	}

	public String getMaCD() {
		return maCD;
	}

	public void setMaCD(String maCD) {
		this.maCD = maCD;
	}

	public String getTenCD() {
		return tenCD;
	}

	public void setTenCD(String tenCD) {
		this.tenCD = tenCD;
	}

	public double getHocPhi() {
		return hocPhi;
	}

	public void setHocPhi(double hocPhi) {
		this.hocPhi = hocPhi;
	}

	public int getThoiLuong() {
		return thoiLuong;
	}

	public void setThoiLuong(int thoiLuong) {
		this.thoiLuong = thoiLuong;
	}

	public String getHinh() {
		return hinh;
	}

	public void setHinh(String hinh) {
		this.hinh = hinh;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

}

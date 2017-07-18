/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

/**
 *
 * @author HM
 */

public class User {
	private String maLH, tenLH;

	public String getMaLH() {
		return maLH;
	}

	public String getTenLH() {
		return tenLH;
	}

	public User(String maLH, String tenLH) {
		this.maLH = maLH;
		this.tenLH = tenLH;
	}
}


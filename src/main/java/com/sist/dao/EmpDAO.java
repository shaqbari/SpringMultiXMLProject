package com.sist.dao;

import com.sist.security.MySecurity;

public class EmpDAO {
	private MySecurity ms;
	
	public void setMs(MySecurity ms) {
		this.ms = ms;
	}
	
	public void select() {
		ms.security();
		System.out.println("������ �б�");
	}
	public void insert() {
		ms.security();
		System.out.println("������ ����");
	}
}

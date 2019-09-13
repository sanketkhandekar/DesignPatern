package com.test.base.designpatern.adapter;

public class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}
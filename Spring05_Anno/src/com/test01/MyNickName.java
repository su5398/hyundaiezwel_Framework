package com.test01;

public class MyNickName {
	
	private NickName nickName;

	public NickName getNickName() {
		return nickName;
	}

	public void setNickName(NickName nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "NickName: " + nickName;
	}
	
	
}

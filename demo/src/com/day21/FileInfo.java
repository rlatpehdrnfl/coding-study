package com.day21;

import java.io.Serializable;

public class FileInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/*참고 현재 코드 정하는 이유는 나중에 웹에서 패치를 할때 404, 200 http 상태코드로 알기때문임
	 * code
	 * 100: 파일 전송을 시작(파일명 전송)	
	 * 110: 파일 내용을 전송
	 * 200:	파일 전송을 종료(파일명 전송)
	 * size : 파일 크기
	 * data : 파일 내용
	 */
	
	private int code;
	private int size;
	private byte[] data = new byte[1024];
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	
	

}











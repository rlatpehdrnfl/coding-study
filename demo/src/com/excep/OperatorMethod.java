package com.excep;

public class OperatorMethod {

	// 20, 30
	public void inputFormat(String str) throws MyException {

		String temp[] = str.split(",");

		if (temp.length != 2) {
			throw new MyException("숫자 입력 형식 오류" + str);
		}

	}

	// 정수, 실수인지 확인
	@SuppressWarnings("unused") // 노란줄 없애려고 쓴거 안써도 됨
	public void number(String str) throws MyException {
		try {

			if (str.indexOf(".") != -1) {// 실수 검사
				double num = Double.parseDouble(str);
			} else {// 정수
				int num = Integer.parseInt(str);
			}

		} catch (NumberFormatException e) {
			throw new MyException("숫자 변환 불가: " + str);

		}

	}

	// 연산자 확인
	public void operator(char oper) throws MyException {

		switch (oper) {
		case '+':
		case '-':
		case '*':
		case '/':

			return;
		default:
			throw new MyException("연산자 오류: " + oper);
		}

	}

}

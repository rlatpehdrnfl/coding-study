package com.excep;

public class OperatorMethod {

	// 20, 30
	public void inputFormat(String str) throws MyException {

		String temp[] = str.split(",");

		if (temp.length != 2) {
			throw new MyException("���� �Է� ���� ����" + str);
		}

	}

	// ����, �Ǽ����� Ȯ��
	@SuppressWarnings("unused") // ����� ���ַ��� ���� �Ƚᵵ ��
	public void number(String str) throws MyException {
		try {

			if (str.indexOf(".") != -1) {// �Ǽ� �˻�
				double num = Double.parseDouble(str);
			} else {// ����
				int num = Integer.parseInt(str);
			}

		} catch (NumberFormatException e) {
			throw new MyException("���� ��ȯ �Ұ�: " + str);

		}

	}

	// ������ Ȯ��
	public void operator(char oper) throws MyException {

		switch (oper) {
		case '+':
		case '-':
		case '*':
		case '/':

			return;
		default:
			throw new MyException("������ ����: " + oper);
		}

	}

}

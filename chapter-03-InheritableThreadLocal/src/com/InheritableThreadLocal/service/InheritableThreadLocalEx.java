package com.InheritableThreadLocal.service;

import java.util.Date;

public class InheritableThreadLocalEx extends InheritableThreadLocal {

	@Override
	protected Object childValue(Object parentValue) {
		// ���߳�˽��ֵ
		return new Date().getTime();
	}

	@Override
	protected Object initialValue() {
		// Ĭ��ֵ
		return new Date().getTime();
	}

}

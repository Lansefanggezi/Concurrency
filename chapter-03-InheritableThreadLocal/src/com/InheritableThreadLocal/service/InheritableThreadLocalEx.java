package com.InheritableThreadLocal.service;

import java.util.Date;

public class InheritableThreadLocalEx extends InheritableThreadLocal {

	@Override
	protected Object childValue(Object parentValue) {
		// 子线程私有值
		return new Date().getTime();
	}

	@Override
	protected Object initialValue() {
		// 默认值
		return new Date().getTime();
	}

}

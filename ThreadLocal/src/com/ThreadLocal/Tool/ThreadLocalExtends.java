package com.ThreadLocal.Tool;

import java.util.Date;

public class ThreadLocalExtends extends ThreadLocal {

	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}

	
}

package com.lingqie.jianwang;

public class SimpleServiceImpl implements SimpleService {

	public String concat(ConcatRequest parameters) {
		// TODO Auto-generated method stub
		return parameters.getS1()+parameters.getS2();
	}

}

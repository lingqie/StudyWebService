package com.lingqie.jianwang;

import java.rmi.RemoteException;

import com.lingqie.jianwang.SimpleServiceStub.ConcatRequest;
import com.lingqie.jianwang.SimpleServiceStub.ConcatResponse;

public class SimpleClient {
	public static void main(String[] args) throws RemoteException {
		SimpleServiceStub service = new SimpleServiceStub("http://localhost:8080/axis2/services/SimpleService");
		ConcatRequest request = new ConcatRequest();
		request.setS1("abc");
		request.setS2("123");
		ConcatResponse response = service.concat(request);
		System.out.println(response.getConcatResponse());
	}
}
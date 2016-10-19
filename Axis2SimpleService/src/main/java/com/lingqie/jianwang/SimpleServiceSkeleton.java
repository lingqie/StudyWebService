
/**
 * SimpleServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.0  Built on : Jan 18, 2016 (09:41:27 GMT)
 */
package com.lingqie.jianwang;

/**
 * SimpleServiceSkeleton java skeleton for the axisService
 */
public class SimpleServiceSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param concatRequest
	 * @return concatResponse
	 */

	public com.lingqie.jianwang.ConcatResponse concat(com.lingqie.jianwang.ConcatRequest concatRequest) {
		String result=concatRequest.getS1()+concatRequest.getS2();
		ConcatResponse response = new ConcatResponse();
		response.setConcatResponse(result);
		return response;
	}

}

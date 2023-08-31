package com.bbagym.app;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface Excute {

	public Result execute(HttpServletRequest request, HttpServletResponse respose) 
			throws IOException, ServerException;
}

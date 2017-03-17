package com.neusoft.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;

@PreMatching
public class RequestFilter implements ContainerResponseFilter{

	@Override
	public void filter(ContainerRequestContext arg0, ContainerResponseContext arg1) throws IOException {
		// TODO Auto-generated method stub
		arg1.getHeaders().add("Access-Control-Allow-Origin", "*");
		arg1.getHeaders().add("Access-Control-Allow-Methods", "*");
		arg1.getHeaders().add("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
	}

	

}

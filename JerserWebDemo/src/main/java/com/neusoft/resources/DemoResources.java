package com.neusoft.resources;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.neusoft.fastjson.FastJsonType;
import com.nuesoft.bean.Demo;

/**
 * Created by yangzhou on 2017/3/13.
 */
@Path("/demo")
public class DemoResources {

    @GET
    @Path("demo")
    public Map<String, Object> demo(HttpServletResponse response) {
    	Map<String, Object> map = new HashMap<String, Object>();
    	map.put("key", 1);
    	map.put("value", "hha");
        return map;
    }

    @POST
    @Path("add")
    public Demo addBean(Demo demo){
    	System.out.println("key:"+demo.getKey());
    	System.out.println("value:"+demo.getValue());
    	return demo;
    }
    
    @GET
    @Path("{value}")
    public String pathParamDemo(@PathParam("value") String value){
    	System.out.println("value:"+value);
    	return value;
    }
    
    @GET
    @Path("queryParamDemo")
    public String queryParamDemo(@QueryParam("value") String value,
            @QueryParam("key") int key){
    	System.out.println("key:"+ key);
    	System.out.println("value:"+ value);  	
    	return key+value;
    }

}

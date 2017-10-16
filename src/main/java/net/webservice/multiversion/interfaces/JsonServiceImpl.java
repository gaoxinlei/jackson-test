package net.webservice.multiversion.interfaces;

import net.webservice.bean.Request;
import net.webservice.bean.Response;

public class JsonServiceImpl  implements JsonService{

	@Override
	public Response v0Service(Request request, Integer id) {
		Response response = new Response();
		System.out.println("reqId:"+id);
		response.setRespCode(200);
		response.setRespContent("响应v0");
		response.setRespId(id);
		response.setRespType("successful");
		return response;
	}

	@Override
	public Response v1Service(Request request, Integer id) {
		Response response = new Response();
		System.out.println("reqId:"+id);
		response.setRespCode(300);
		response.setRespContent("响应v1");
		response.setRespId(id);
		response.setRespType("successful");
		return response;
	}


}

package net.webservice.factory;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.beans.factory.FactoryBean;

import net.webservice.bean.Response;

public class ResponseFactory implements FactoryBean<Response> {

	private Class<?> objectType;
	
	private String wsdl;
	
	@Override
	public Response getObject() throws Exception {
		JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
		factory.setAddress(wsdl);
		factory.setServiceClass(objectType);
		return (Response) factory.create();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return objectType;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

	public void setObjectType(Class<?> objectType) {
		this.objectType = objectType;
	}

	public void setWsdl(String wsdl) {
		this.wsdl = wsdl;
	}


}

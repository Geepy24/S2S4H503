package com.demo.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("json-default")
public class testAction extends ActionSupport {

	private String username ; //����ı�����Ҫ��ҳ�����input���name����ֵһ��
	//����getter��setter����
	private String content ;
	private String data ;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getUsername(){
		return username ;
	}
	public void setUsername(String username){
		this.username = username ;
	}



	@Action(value="test",results= {@Result(name="success",location="/result.jsp")})
	public String execute(){
		System.out.println(username);
		return SUCCESS ;
	}
	@Action(value="ajaxTest",results= {@Result(name="success",type="json",
				params= {"root","data"})})
	public String jsonTest() {
		//�鿴ajax���͵�����
		System.out.println(content);//test ajax+json
		//Ҫ���ص�ǰ�˵����ݣ���װ��jsondata��
		//ƴ��һ��json�ַ�����ʵ����JSONObject�����������������͵Ķ�������Map���ϵĶ���
		//תΪjson����Ȼ����toString���json�ַ�������������򵥵�ƴ��
		data  = "{\"returndata\" : \"success\"}" ;
		return SUCCESS ;
	}
	
	
	
}

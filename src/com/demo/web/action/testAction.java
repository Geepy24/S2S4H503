package com.demo.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("json-default")
public class testAction extends ActionSupport {

	private String username ; //这里的变量名要与页面表单中input框的name属性值一致
	//生成getter、setter方法
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
		//查看ajax发送的数据
		System.out.println(content);//test ajax+json
		//要发回到前端的数据，封装在jsondata中
		//拼接一个json字符串，实际用JSONObject类来将其他数据类型的对象（例如Map集合的对象）
		//转为json对象，然后再toString变成json字符串，这里用最简单的拼接
		data  = "{\"returndata\" : \"success\"}" ;
		return SUCCESS ;
	}
	
	
	
}

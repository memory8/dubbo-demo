package com.dubbo.demo.model;

import java.io.Serializable;
import java.util.Date;

import com.dubbo.demo.client.model.BaseModel;

public class DemoModel extends BaseModel implements Serializable{
	
	private static final long serialVersionUID = -1710194445567885734L;
	
	private Integer id;
	
	private String name;
	
	private Integer sex;
	
	private Date createDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}

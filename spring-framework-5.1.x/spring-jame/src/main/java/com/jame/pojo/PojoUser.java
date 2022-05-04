package com.jame.pojo;

/**
 * @author : Jame
 * @date : 2021-11-18 16:08
 **/
public class PojoUser {

	private Integer id;
	private String name;
	private Integer number;
	private Integer classId;

	public PojoUser() {
	}

	public PojoUser(Integer id, String name, Integer number, Integer classId) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.classId = classId;
	}

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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}
}

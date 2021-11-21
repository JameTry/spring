package com.jame.pojo;

/**
 * @author : Jame
 * @date : 2021-11-17 16:25
 **/
public class Father {
	private Integer id;
	private String name;
	private String high;

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

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	@Override
	public String toString() {
		return "Father{" +
				"id=" + id +
				", name='" + name + '\'' +
				", high=" + high +
				'}';
	}



}

/**
 * 
 */
package com.bean;

/**
 * @author Administrator
 *
 */
public class User {
	private String name;
	private Long id;

	/**
	 * @param id
	 * @param name
	 */
	public User(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public User() {
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + "]";
	}
	
}
/*
 *
 */

package com.wang.spring.model.db;

public class Users implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	
	//columns START
	private Integer id;
	private String name;
	private String password;
	private Integer role;
	private String email;
	private String phone;
	private String apikey;
	private java.util.Date createdAt;
	private java.util.Date updatedAt;
	//columns END

	public Users(){
	}

	public Users(
		Integer id
	){
		this.id = id;
	}

	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return this.password;
	}
	public void setRole(Integer value) {
		this.role = value;
	}
	
	public Integer getRole() {
		return this.role;
	}
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return this.phone;
	}
	public void setApikey(String value) {
		this.apikey = value;
	}
	
	public String getApikey() {
		return this.apikey;
	}
	public void setCreatedAt(java.util.Date value) {
		this.createdAt = value;
	}
	
	public java.util.Date getCreatedAt() {
		return this.createdAt;
	}
	public void setUpdatedAt(java.util.Date value) {
		this.updatedAt = value;
	}
	
	public java.util.Date getUpdatedAt() {
		return this.updatedAt;
	}

}


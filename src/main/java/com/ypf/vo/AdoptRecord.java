package com.ypf.vo;

public class AdoptRecord {
 	private Integer id;

    private String username;
    
    private String tel;

    private String dogName;
    
    private String dogKind;
    
    private String dogSex;

    /**
     * 0:未审核  1:审核通过
     */
    private Integer status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getDogKind() {
		return dogKind;
	}

	public void setDogKind(String dogKind) {
		this.dogKind = dogKind;
	}

	public String getDogSex() {
		return dogSex;
	}

	public void setDogSex(String dogSex) {
		this.dogSex = dogSex;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
    
    
}

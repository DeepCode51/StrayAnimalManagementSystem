package com.ypf.pojo;

public class TUser {
    private Integer id;

    private String username;

    private String password;

    private String record;

    private String tel;

    public TUser() {
		// TODO Auto-generated constructor stub
	}
    
    public TUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



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
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }
}
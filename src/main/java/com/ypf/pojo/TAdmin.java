package com.ypf.pojo;

public class TAdmin {
    private Integer adminid;

    private String password;

    public TAdmin() {
		// TODO Auto-generated constructor stub
	}
    
    public TAdmin(Integer adminid, String password) {
		super();
		this.adminid = adminid;
		this.password = password;
	}

	public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}
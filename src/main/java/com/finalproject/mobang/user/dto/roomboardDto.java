package com.finalproject.mobang.user.dto;

public class roomboardDto {
	
	private int tno;
	private String tname;
	private String ttitle;
	private String titem;
	private String tpicture;
	private String tcontent;
	private String taddress;
	
	public roomboardDto() {}

	public roomboardDto(int tno, String tname, String ttitle, String titem, String tpicture, String tcontent,
			String taddress) {
		this.tno = tno;
		this.tname = tname;
		this.ttitle = ttitle;
		this.titem = titem;
		this.tpicture = tpicture;
		this.tcontent = tcontent;
		this.taddress = taddress;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTtitle() {
		return ttitle;
	}

	public void setTtitle(String ttitle) {
		this.ttitle = ttitle;
	}

	public String getTitem() {
		return titem;
	}

	public void setTitem(String titem) {
		this.titem = titem;
	}

	public String getTpicture() {
		return tpicture;
	}

	public void setTpicture(String tpicture) {
		this.tpicture = tpicture;
	}

	public String getTcontent() {
		return tcontent;
	}

	public void setTcontent(String tcontent) {
		this.tcontent = tcontent;
	}

	public String getTaddress() {
		return taddress;
	}

	public void setTaddress(String taddress) {
		this.taddress = taddress;
	}
	
	

}

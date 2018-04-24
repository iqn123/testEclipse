package com.woniuxy.entities;

public class HouseBookingInfo {

	private Integer id;
	private String area;
	private String cartype;
	private String movedate;
	private String contact;
	private String status;
	private String phone;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getMovedate() {
		return movedate;
	}
	public void setMovedate(String movedate) {
		this.movedate = movedate;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "HouseBookingInfo [id=" + id + ", area=" + area + ", cartype="
				+ cartype + ", movedate=" + movedate + ", contact=" + contact
				+ ", status=" + status + ", phone=" + phone + "]";
	}
	public HouseBookingInfo(String area, String cartype, String movedate,
			String contact, String status, String phone) {
		super();
		this.area = area;
		this.cartype = cartype;
		this.movedate = movedate;
		this.contact = contact;
		this.status = status;
		this.phone = phone;
	}
	public HouseBookingInfo(Integer id, String area, String cartype,
			String movedate, String contact, String status, String phone) {
		super();
		this.id = id;
		this.area = area;
		this.cartype = cartype;
		this.movedate = movedate;
		this.contact = contact;
		this.status = status;
		this.phone = phone;
	}
	public HouseBookingInfo() {
		
	}
}

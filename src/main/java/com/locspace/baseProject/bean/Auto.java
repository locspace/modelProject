package com.locspace.baseProject.bean;

import java.io.Serializable;
import javax.persistence.*;
	
import java.math.BigDecimal;


/**
 * The persistent class for the auto database table.
 * 
 */
@Entity
@NamedQuery(name="Auto.findAll", query="SELECT a FROM Auto a")
public class Auto implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id

	private BigDecimal accx;

	private BigDecimal accy;

	private BigDecimal accz;

	private BigDecimal altitude;

	private BigDecimal heading;

	private String latitude;

	private String longitude;

	private String myloc;

	private BigDecimal pitch;

	private BigDecimal roll;

	private BigDecimal speed;

	private String status;

	private String time;

	private BigDecimal ve;

	private BigDecimal vn;

	private BigDecimal vu;

	public Auto() {
	}

	public BigDecimal getAccx() {
		return this.accx;
	}

	public void setAccx(BigDecimal accx) {
		this.accx = accx;
	}

	public BigDecimal getAccy() {
		return this.accy;
	}

	public void setAccy(BigDecimal accy) {
		this.accy = accy;
	}

	public BigDecimal getAccz() {
		return this.accz;
	}

	public void setAccz(BigDecimal accz) {
		this.accz = accz;
	}

	public BigDecimal getAltitude() {
		return this.altitude;
	}

	public void setAltitude(BigDecimal altitude) {
		this.altitude = altitude;
	}

	public BigDecimal getHeading() {
		return this.heading;
	}

	public void setHeading(BigDecimal heading) {
		this.heading = heading;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMyloc() {
		return this.myloc;
	}

	public void setMyloc(String myloc) {
		this.myloc = myloc;
	}

	public BigDecimal getPitch() {
		return this.pitch;
	}

	public void setPitch(BigDecimal pitch) {
		this.pitch = pitch;
	}

	public BigDecimal getRoll() {
		return this.roll;
	}

	public void setRoll(BigDecimal roll) {
		this.roll = roll;
	}

	public BigDecimal getSpeed() {
		return this.speed;
	}

	public void setSpeed(BigDecimal speed) {
		this.speed = speed;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public BigDecimal getVe() {
		return this.ve;
	}

	public void setVe(BigDecimal ve) {
		this.ve = ve;
	}

	public BigDecimal getVn() {
		return this.vn;
	}

	public void setVn(BigDecimal vn) {
		this.vn = vn;
	}

	public BigDecimal getVu() {
		return this.vu;
	}

	public void setVu(BigDecimal vu) {
		this.vu = vu;
	}

}
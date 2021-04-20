package com.locspace.baseProject.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the view_s6 database table.
 * 
 */
@Entity
@Table(name="view_s6")
@NamedQuery(name="ViewS6.findAll", query="SELECT v FROM ViewS6 v")
public class ViewS6 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
		
	@Column
	private String curr;

	private String currenergysta;

	private String currstate;

	private double energy;

	private int loadstate;

	private int runspeed;

	private BigDecimal time;

	private String volt;

	public ViewS6() {
	}

	public String getCurr() {
		return this.curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public String getCurrenergysta() {
		return this.currenergysta;
	}

	public void setCurrenergysta(String currenergysta) {
		this.currenergysta = currenergysta;
	}

	public String getCurrstate() {
		return this.currstate;
	}

	public void setCurrstate(String currstate) {
		this.currstate = currstate;
	}

	public double getEnergy() {
		return this.energy;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
	}

	public int getLoadstate() {
		return this.loadstate;
	}

	public void setLoadstate(int loadstate) {
		this.loadstate = loadstate;
	}

	public int getRunspeed() {
		return this.runspeed;
	}

	public void setRunspeed(int runspeed) {
		this.runspeed = runspeed;
	}

	public BigDecimal getTime() {
		return this.time;
	}

	public void setTime(BigDecimal time) {
		this.time = time;
	}

	public String getVolt() {
		return this.volt;
	}

	public void setVolt(String volt) {
		this.volt = volt;
	}

}
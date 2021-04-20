package com.locspace.baseProject.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the autochart1 database table.
 * 
 */
@Entity
@Table(name="autochart")
@NamedQuery(name="Autochart.findAll", query="SELECT a FROM Autochart a")
public class Autochart implements Serializable {
	private static final long serialVersionUID = 1L;

	private String accely;

	private String actualengp;

	private String angle;

	private String angleroll;

	private String angratez;

	private String antenna;

	private String brakepedal;

	private String braketrigger;

	private String curr;

	private String currenergysta;

	private String currstate;

	private String curvature;

	private String day;

	private String dgps;

	private String driversdem;

	private String energy;

	private String engrequest;

	private String engspeed;

	private String frontaxlel;

	private String frontaxler;

	private String heading;

	private String height;

	private String imu;

	private String latitude;

	private int loadstate;

	private String longitude;

	private String rearaxlele;

	private int runspeed;

	private String satellites;

	private String speed;

	private String speed2d;

	private String steerwheel;

	private String torque;

	private String triggertime;
	
	@Id
	@Column(name="utc")
	private String utime;

	private String vdcfullyop;

	private String vdcinforma;

	private String velforward;

	private String velocity;

	private String volt;

	private String wav;

	public Autochart() {
	}

	public String getAccely() {
		return this.accely;
	}

	public void setAccely(String accely) {
		this.accely = accely;
	}

	public String getActualengp() {
		return this.actualengp;
	}

	public void setActualengp(String actualengp) {
		this.actualengp = actualengp;
	}

	public String getAngle() {
		return this.angle;
	}

	public void setAngle(String angle) {
		this.angle = angle;
	}

	public String getAngleroll() {
		return this.angleroll;
	}

	public void setAngleroll(String angleroll) {
		this.angleroll = angleroll;
	}

	public String getAngratez() {
		return this.angratez;
	}

	public void setAngratez(String angratez) {
		this.angratez = angratez;
	}

	public String getAntenna() {
		return this.antenna;
	}

	public void setAntenna(String antenna) {
		this.antenna = antenna;
	}

	public String getBrakepedal() {
		return this.brakepedal;
	}

	public void setBrakepedal(String brakepedal) {
		this.brakepedal = brakepedal;
	}

	public String getBraketrigger() {
		return this.braketrigger;
	}

	public void setBraketrigger(String braketrigger) {
		this.braketrigger = braketrigger;
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

	public String getCurvature() {
		return this.curvature;
	}

	public void setCurvature(String curvature) {
		this.curvature = curvature;
	}

	public String getDay() {
		return this.day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getDgps() {
		return this.dgps;
	}

	public void setDgps(String dgps) {
		this.dgps = dgps;
	}

	public String getDriversdem() {
		return this.driversdem;
	}

	public void setDriversdem(String driversdem) {
		this.driversdem = driversdem;
	}

	public String getEnergy() {
		return this.energy;
	}

	public void setEnergy(String energy) {
		this.energy = energy;
	}

	public String getEngrequest() {
		return this.engrequest;
	}

	public void setEngrequest(String engrequest) {
		this.engrequest = engrequest;
	}

	public String getEngspeed() {
		return this.engspeed;
	}

	public void setEngspeed(String engspeed) {
		this.engspeed = engspeed;
	}

	public String getFrontaxlel() {
		return this.frontaxlel;
	}

	public void setFrontaxlel(String frontaxlel) {
		this.frontaxlel = frontaxlel;
	}

	public String getFrontaxler() {
		return this.frontaxler;
	}

	public void setFrontaxler(String frontaxler) {
		this.frontaxler = frontaxler;
	}

	public String getHeading() {
		return this.heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getImu() {
		return this.imu;
	}

	public void setImu(String imu) {
		this.imu = imu;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public int getLoadstate() {
		return this.loadstate;
	}

	public void setLoadstate(int loadstate) {
		this.loadstate = loadstate;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getRearaxlele() {
		return this.rearaxlele;
	}

	public void setRearaxlele(String rearaxlele) {
		this.rearaxlele = rearaxlele;
	}

	public int getRunspeed() {
		return this.runspeed;
	}

	public void setRunspeed(int runspeed) {
		this.runspeed = runspeed;
	}

	public String getSatellites() {
		return this.satellites;
	}

	public void setSatellites(String satellites) {
		this.satellites = satellites;
	}

	public String getSpeed() {
		return this.speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getSpeed2d() {
		return this.speed2d;
	}

	public void setSpeed2d(String speed2d) {
		this.speed2d = speed2d;
	}

	public String getSteerwheel() {
		return this.steerwheel;
	}

	public void setSteerwheel(String steerwheel) {
		this.steerwheel = steerwheel;
	}

	public String getTorque() {
		return this.torque;
	}

	public void setTorque(String torque) {
		this.torque = torque;
	}

	public String getTriggertime() {
		return this.triggertime;
	}

	public void setTriggertime(String triggertime) {
		this.triggertime = triggertime;
	}

	public String getUtime() {
		return this.utime;
	}

	public void setUtime(String utime) {
		this.utime = utime;
	}

	public String getVdcfullyop() {
		return this.vdcfullyop;
	}

	public void setVdcfullyop(String vdcfullyop) {
		this.vdcfullyop = vdcfullyop;
	}

	public String getVdcinforma() {
		return this.vdcinforma;
	}

	public void setVdcinforma(String vdcinforma) {
		this.vdcinforma = vdcinforma;
	}

	public String getVelforward() {
		return this.velforward;
	}

	public void setVelforward(String velforward) {
		this.velforward = velforward;
	}

	public String getVelocity() {
		return this.velocity;
	}

	public void setVelocity(String velocity) {
		this.velocity = velocity;
	}

	public String getVolt() {
		return this.volt;
	}

	public void setVolt(String volt) {
		this.volt = volt;
	}

	public String getWav() {
		return this.wav;
	}

	public void setWav(String wav) {
		this.wav = wav;
	}

}
package com.demoAz.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="devieces")
public class Device {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name", nullable=false, length=100)
	private String name;
	
	@Column(name="descrpition", nullable=false, length=1000)
	private String description;
	
	@Column(name="price", nullable=false)
	private String price;
	
	@Column(name="create_time", nullable=false)
	private String createTime;
	
	// device-type
	@Enumerated(EnumType.STRING)
	@Column(name="device_type", nullable=false)
	private DeviceType devicetype;
	
	
	

}

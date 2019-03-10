package com.boot.srimplespringboot.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zh
 * @ClassName cn.saytime.bean.User
 * @Description
 */
@Data
public class User {

	private int id;
	private String username;
	private int age;
	private Date ctm;

	// Getter Setter
}
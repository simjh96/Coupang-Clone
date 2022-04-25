package com.team1.model;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Component
public class CartDto {
	private String userId;
	private int itemNo;
	private int itemAmount;
	private int price;
	private int shipping;
	private Date regDt;
	private Date modDt;
	private String[] itemArr;
	
	// item dto

	private int no;
	private String imgUrl;
	private String title;
	private String rating;
	private String imgDetailUrl;
}

package com.niit.moonwalkfrontend.model;

public class product {
	private int id;
	   private String name;
	   private String desc;
	   private int price;

	   product(int id, String name,String desc,int price){
	      this.id = id;
	      this.name = name;
	      this.desc=desc;
	      this.price=price;
	   }

	   public int getid() {
	      return id;
	   }

	   public void setid(int id) {
	      this.id = id;
	   }

	   public String getname() {
	      return name;
	   }

	   public void setname(String name) {
	      this.name = name;
	   }
	   public String getdesc(){
		   return desc;
	   }
	   public void setdesc(String desc){
		   this.desc=desc;
	   }
	   public int getprice(){
		   return price;
	   }
	   public void setprice(int price){
		   this.price=price;
	   }
	}


package com.niit.moonwalkfrontend.dao;
import java.util.List;

import com.niit.moonwalkfrontend.model.product;

public interface productDao {
   public List<product> getAllproduct();
   public product getproduct1(int id);
   public product getproduct1(String name);
   public product getproduct(String desc);
   public product getproduct(int price);
}


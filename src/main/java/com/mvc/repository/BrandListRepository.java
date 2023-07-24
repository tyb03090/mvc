package com.mvc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrandListRepository {

	public List<Map<String, String>> selectBrandList() {
		String driverName = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/kd";
		String user = "root";
		String pwd = "kd1824java";
		
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		List<Map<String, String>> brandInfoList = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			
			String sql = "SELECT * FROM BRAND_LIST WHERE 1=1";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Map<String, String> brandList = new HashMap<>();
				
				brandList.put("blNum", rs.getString("BL_NUM"));
				brandList.put("blBrand", rs.getString("BL_BRAND"));
				brandList.put("blType", rs.getString("BL_TYPE"));
				brandList.put("blCountry", rs.getString("BL_COUNTRY"));
				
				brandInfoList.add(brandList);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return brandInfoList;
	}
	
	public static void main(String[] args) {
		BrandListRepository blRepo = new BrandListRepository();
		blRepo.selectBrandList();
	}
}

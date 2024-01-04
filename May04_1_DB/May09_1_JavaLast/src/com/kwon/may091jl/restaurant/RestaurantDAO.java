package com.kwon.may091jl.restaurant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import kiung.kwon.db.manager.KwonDBManager;

// 새로운거 - x
// 기존 배웠던것들 총 정리해서 합쳐서 효율적 실전에 가능하

// java.util.Date : 일반
// java.sql.Date : DB작업때는
//		1) MyBatis에서 java.util.Date씀
// 		2) java.util.Date <-> java.sql.Date 자동 변환

public class RestaurantDAO {
	private int allRestaurantCount;
	private int restaurantPerPage;

	private static final RestaurantDAO RDAO = new RestaurantDAO();

	private RestaurantDAO() {
		restaurantPerPage = 5;
	}

	public static RestaurantDAO getRdao() {
		return RDAO;
	}

	public int getAllPageCount() {
		return (int) Math.ceil(allRestaurantCount / (double) restaurantPerPage);
	}

	public void setAllRestaurantCount() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KwonDBManager.connect("jdbc:oracle:thin:@195.168.9.43:1521:xe", "kwon", "1");
			String sql = "select count(*) from may09_restaurant";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			allRestaurantCount = rs.getInt("count(*)");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			KwonDBManager.close(con, pstmt, rs);
		}
	}

	public ArrayList<Restaurant> get(int pageNo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = KwonDBManager.connect("jdbc:oracle:thin:@195.168.9.43:1521:xe", "kwon", "1");
			
			int start = (pageNo - 1) * restaurantPerPage + 1;
			int end = restaurantPerPage * pageNo;
					
			String sql
					= "select * "
					+ "from ( "
					+ "	select rownum as rn, r_name, r_start, r_addr "
					+ "	from ( "
					+ "		select *  "
					+ "		from may09_restaurant "
					+ "		order by r_name "
					+ "	) "
					+ ") "
					+ "where rn >= ? and rn <= ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();

			ArrayList<Restaurant> restaurants = new ArrayList<>();
			while (rs.next()) {
				restaurants.add(
						new Restaurant(rs.getString("r_name"), rs.getDate("r_start"), rs.getString("r_addr"), null));
			}
			return restaurants;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			KwonDBManager.close(con, pstmt, rs);
		}
	}

	public String reg(Restaurant r) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = KwonDBManager.connect("jdbc:oracle:thin:@195.168.9.43:1521:xe", "kwon", "1");

			String sql = "insert into may09_restaurant values(?, to_date(?, 'YYYYMMDD'), ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, r.getName());
			pstmt.setString(2, r.getStart2());
			pstmt.setString(3, r.getAddr());

			if (pstmt.executeUpdate() == 1) {
				allRestaurantCount++;
				return "성공";
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return "실패";
		} finally {
			KwonDBManager.close(con, pstmt, null);
		}
	}
}

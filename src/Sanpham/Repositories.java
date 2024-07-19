package Sanpham;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kingo
 */
public class Repositories {
    private static Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    
    public ArrayList<Model_sanpham> getAll(){
        sql="SELECT MaSanPham,ThuongHieu,TenSanPham,NgayTao,SoLuongSP,NguoiChinhSua,NguoiTao,NgayChinhSua FROM SanPham;";
        
        ArrayList<Model_sanpham> Listsp = new ArrayList<>();
        try{
        con=DBConnect.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
          String masp;
     String thuonghieu;
     String tensp;
     String ngaytao;
     String soluong;
     String nguoichinhsua;
     String nguoitao;
     String ngaychinhsua;
    
            masp=rs.getString(1);
            thuonghieu=rs.getString(2);
            tensp=rs.getString(3);
            ngaytao=rs.getString(4);
            soluong=rs.getString(5);
            nguoichinhsua=rs.getString(6);
            nguoitao=rs.getString(7);
            ngaychinhsua=rs.getString(8);
            
            Listsp.add(new Model_sanpham(masp, thuonghieu, tensp, ngaytao, soluong, nguoichinhsua, nguoitao, ngaychinhsua));
        }
        return Listsp;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        
    }
}

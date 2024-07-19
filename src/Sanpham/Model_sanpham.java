package Sanpham;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kingo
 */
public class Model_sanpham {
    private String masp;
    private String thuonghieu;
    private String tensp;
    private String ngaytao;
    private String soluong;
    private String nguoichinhsua;
    private String nguoitao;
    private String ngaychinhsua;

    public Model_sanpham() {
    }

    public Model_sanpham(String masp, String thuonghieu, String tensp, String ngaytao, String soluong, String nguoichinhsua, String nguoitao, String ngaychinhsua) {
        this.masp = masp;
        this.thuonghieu = thuonghieu;
        this.tensp = tensp;
        this.ngaytao = ngaytao;
        this.soluong = soluong;
        this.nguoichinhsua = nguoichinhsua;
        this.nguoitao = nguoitao;
        this.ngaychinhsua = ngaychinhsua;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getThuonghieu() {
        return thuonghieu;
    }

    public void setThuonghieu(String thuonghieu) {
        this.thuonghieu = thuonghieu;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getNguoichinhsua() {
        return nguoichinhsua;
    }

    public void setNguoichinhsua(String nguoichinhsua) {
        this.nguoichinhsua = nguoichinhsua;
    }

    public String getNguoitao() {
        return nguoitao;
    }

    public void setNguoitao(String nguoitao) {
        this.nguoitao = nguoitao;
    }

    public String getNgaychinhsua() {
        return ngaychinhsua;
    }

    public void setNgaychinhsua(String ngaychinhsua) {
        this.ngaychinhsua = ngaychinhsua;
    }

    
    
    public Object[] toDaTaRow(){
    return new Object[] {this.getMasp(),this.getThuonghieu(),this.getTensp(),this.getNgaytao(),this.getSoluong(),this.getNguoichinhsua(),this.getNguoitao(),this.getNgaychinhsua()};
}
}
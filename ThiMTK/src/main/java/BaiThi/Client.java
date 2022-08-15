/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiThi;

/**
 *
 * @author L_DELL
 */
public class Client implements Stream.IThongBao{

    @Override
    public void ThongBaoToiClient(User t) {
        System.out.println("User: "+t+" vua moi duoc them vao danh sach!");
    }
    
}

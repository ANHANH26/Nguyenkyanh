/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import MAIN.MainScreen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

/**
 *
 * @author ADMIN
 */
public class Screen extends JFrame {

    private JLabel noteTile;
    private JPanel pnTaiKhoan;
    private JPanel pnMatKhau;
    private JButton btnDangnhap;
    private JButton btnQuenMatKhau;
    private JButton btnDangky;
    private Register register;
    private Forget forget;
    private Image image;
    private BufferedImage strPathAndFileName;
    BufferedImage subImange;
    private MainScreen mainScreen;

    public Screen(String title) {
        this.setTitle(title);
        Log_in();

    }

    public void Log_in() {
        this.setSize(500, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        //this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel tilelayout = new JPanel(new BorderLayout(5, 5));
        //PHẦN LOGO
        JPanel pnAbove = new JPanel();
        pnAbove.setPreferredSize(new Dimension(500, 80));
        noteTile = new JLabel("LOG IN");
        noteTile.setFont(new Font("Tahoma", Font.BOLD, 40));
        //noteTile.setForeground(Color.green);//mÃ u chá»¯
        pnAbove.add(noteTile);
        tilelayout.add(pnAbove, BorderLayout.NORTH);
        //
        //PHẦN NHẬP THÔNG TIN
        JPanel pnCenter = new JPanel();
        pnCenter.setPreferredSize(new Dimension(500, 5));
        pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
        pnTaiKhoan = new JPanel();
        pnTaiKhoan.add(new JLabel("Tài khoản: "));
        pnTaiKhoan.add(new JTextField(20));
        pnCenter.add(pnTaiKhoan);
        pnMatKhau = new JPanel();
        pnMatKhau.add(new JLabel("Mật Khẩu: ")).setPreferredSize(new Dimension(72, 20));
        pnMatKhau.add(new JTextField(20));
        pnCenter.add(pnMatKhau);
        tilelayout.add(pnCenter, BorderLayout.CENTER);
        //KẾT THÚC PHẦN NHẬP THÔNG TIN
        //CÁC NÚT
        JPanel pnUnder = new JPanel();
        pnUnder.setPreferredSize(new Dimension(500, 100));
        btnDangnhap = new JButton("ĐĂNG NHẬP");
        btnQuenMatKhau = new JButton("QUÊN MẬT KHẢU");
        btnDangky = new JButton("ĐĂNG KÝ");
        pnUnder.add(btnDangnhap);
        pnUnder.add(btnQuenMatKhau);
        pnUnder.add(btnDangky);
        tilelayout.add(pnUnder, BorderLayout.SOUTH);
        //KÊT THÚC
        //ADD VÀ ĐƯA LÊN MÀN HÌNH 
        this.add(tilelayout);
        this.setupActions();
        this.setVisible(true);

    }

    private void setupActions() {
        btnDangky.addActionListener((ActionEvent actionEvent) -> {
            this.register = register == null ? new Register("ĐĂNG KÝ THÔNG TIN") : register;
            this.setVisible(false);
        });
        btnQuenMatKhau.addActionListener((ActionEvent actionEvent) -> {
            this.forget = forget == null ? new Forget() : forget;
            this.setVisible(false);
        });
    }

    public static void main(String[] args) {
        //new Screen("ĐĂNG NHẬP").setVisible(true);
        MainScreen mainScreen = new MainScreen();
        mainScreen.setVisible(true);

    }
}

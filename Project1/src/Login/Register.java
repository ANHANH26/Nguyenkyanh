/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

    private JLabel pnLogo;
    private JPanel pnHoTen;
    private JPanel pntuoi;
    private JPanel pnNgaySinh;
    private JPanel pnTaiKhoan;
    private JPanel pnMatKhau;
    private JPanel pnNhapLaiMk;
    private JButton btnDangky;
    private Screen screen;

    public Register(String title) {
        this.setTitle(title);
        setResizable(false);
        this.setSize(500, 500);
        setLocationRelativeTo(null);
        this.setVisible(true);
        // this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel titleRegister = new JPanel(new BorderLayout(5, 5));
        //tiêu đề
        JPanel pnNORTH = new JPanel();
        pnNORTH.setPreferredSize(new Dimension(500, 100));
        pnLogo = new JLabel("ĐĂNG KÝ THÔNG TIN");
        pnLogo.setBorder(new EmptyBorder(5, 150, 0, 0));
        pnLogo.setFont(new Font("Tahoma", Font.BOLD, 20));
        pnNORTH.add(pnLogo);
        titleRegister.add(pnLogo, BorderLayout.NORTH);
        //nhập thông tin
        JPanel pnCenter = new JPanel();
        pnCenter.setPreferredSize(new Dimension(500, 500));
        pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
        pnHoTen = new JPanel();
        pnHoTen.add(new JLabel("Họ tên:")).setPreferredSize(new Dimension(90, 20));
        pnHoTen.add(new JTextField(20));
        pnCenter.add(pnHoTen);

        pntuoi = new JPanel();
        pntuoi.add(new JLabel(" Tuổi: ")).setPreferredSize(new Dimension(90, 20));
        pntuoi.add(new JTextField(20));
        pnCenter.add(pntuoi);

        pnNgaySinh = new JPanel();
        pnNgaySinh.add(new JLabel("Ngày Sinh: ")).setPreferredSize(new Dimension(90, 20));
        pnNgaySinh.add(new JTextField(20));
        pnCenter.add(pnNgaySinh);

        pnTaiKhoan = new JPanel();
        pnTaiKhoan.add(new JLabel("Tài Khoản:")).setPreferredSize(new Dimension(90, 20));
        pnTaiKhoan.add(new JTextField(20));
        pnCenter.add(pnTaiKhoan);

        pnMatKhau = new JPanel();
        pnMatKhau.add(new JLabel("Mật Khẩu:")).setPreferredSize(new Dimension(90, 20));
        pnMatKhau.add(new JTextField(20));
        pnCenter.add(pnMatKhau);

        pnNhapLaiMk = new JPanel();
        pnNhapLaiMk.add(new JLabel("Nhập lại mật khẩu:")).setPreferredSize(new Dimension(90, 20));
        pnNhapLaiMk.add(new JTextField(20));
        pnCenter.add(pnNhapLaiMk);

        titleRegister.add(pnCenter, BorderLayout.CENTER);
        //các nút bấm
        JPanel pnUnder = new JPanel();
        pnUnder.setPreferredSize(new Dimension(500, 200));
        btnDangky = new JButton("Đăng Ký ");
        pnUnder.add(btnDangky);
        titleRegister.add(pnUnder, BorderLayout.SOUTH);

        this.add(titleRegister);
        this.setupActions();
    }

    private void setupActions() {
        btnDangky.addActionListener((ActionEvent actionEvent) -> {
            this.screen = screen == null ? new Screen("Đăng ký thông tin") : screen;
            this.setVisible(false);
        });
    }
}

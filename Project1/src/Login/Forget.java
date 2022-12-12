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

public class Forget extends JFrame {

    private JLabel notLogo;
    private JPanel pnHoten;
    private JPanel pnNgaySinh;
    private JPanel pnTaikhoan;
    private JButton btnKiemtra;
    private JButton btnQuayLai;
    private Screen screen;

    public Forget() {
        this.setSize(500, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel titleForget = new JPanel(new BorderLayout(5, 5));

        //logo
        JPanel pnNORTH = new JPanel();
        pnNORTH.setPreferredSize(new Dimension(500, 100));
        notLogo = new JLabel("QUÊN MẬT KHẨU");
        notLogo.setBorder(new EmptyBorder(5, 150, 0, 0));
        notLogo.setFont(new Font("Tahoma", Font.BOLD, 20));
        pnNORTH.add(notLogo);
        titleForget.add(notLogo, BorderLayout.NORTH);
        //nhap thon tin
        JPanel pnCenter = new JPanel();
        pnCenter.setPreferredSize(new Dimension(500, 50));
        pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
        pnHoten = new JPanel();
        pnHoten.add(new JLabel("Họ tên:")).setPreferredSize(new Dimension(90, 10));
        pnHoten.add(new JTextField(20));
        pnCenter.add(pnHoten);

        pnNgaySinh = new JPanel();
        pnNgaySinh.add(new JLabel("Ngay Sinh:")).setPreferredSize(new Dimension(90, 10));
        pnNgaySinh.add(new JTextField(20));
        pnCenter.add(pnNgaySinh);

        pnTaikhoan = new JPanel();
        pnTaikhoan.add(new JLabel("Tai khoan:")).setPreferredSize(new Dimension(90, 10));
        pnTaikhoan.add(new JTextField(20));
        pnCenter.add(pnTaikhoan);

        titleForget.add(pnCenter, BorderLayout.CENTER);

        //nút bấm
        JPanel pnUnder = new JPanel();
        pnUnder.setPreferredSize(new Dimension(500, 100));
        pnUnder.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnKiemtra = new JButton("KIỂM TRA");
        pnUnder.add(btnKiemtra);

        btnQuayLai = new JButton("QUAY LẠI");
        pnUnder.add(btnQuayLai);
        titleForget.add(pnUnder, BorderLayout.SOUTH);
        this.add(titleForget);
        this.setUpAction();
    }

    private void setUpAction() {
        btnQuayLai.addActionListener((ActionEvent actionEvent) -> {
            this.screen = screen == null ? new Screen("LOG IN") : screen;
            this.setVisible(false);
        });
    }
}

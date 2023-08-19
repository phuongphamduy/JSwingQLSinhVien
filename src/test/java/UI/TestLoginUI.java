package UI;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DAO.NhanVienDAO;
import Entity.NhanVien;
import Utils.Auth;

public class TestLoginUI {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Đăng nhập");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        JLabel labelMaNV = new JLabel("Mã nhân viên:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        panel.add(labelMaNV, constraints);

        final JTextField txtMaNV = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        panel.add(txtMaNV, constraints);

        JLabel labelMatKhau = new JLabel("Mật khẩu:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.WEST;
        panel.add(labelMatKhau, constraints);

        final JPasswordField txtMatKhau = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        panel.add(txtMatKhau, constraints);

        JButton btnDangNhap = new JButton("Đăng nhập");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(btnDangNhap, constraints);

        frame.getContentPane().add(panel, BorderLayout.CENTER);

        frame.setVisible(true);

        btnDangNhap.addActionListener(new ActionListener() {
        	NhanVienDAO dao = new NhanVienDAO();
            public void actionPerformed1(ActionEvent e) {
                String manv = txtMaNV.getText();
                String matKhau = new String(txtMatKhau.getPassword());
                NhanVien nhanvien = dao.selectById(manv);
                if (nhanvien == null) {
                    JOptionPane.showMessageDialog(frame, "Sai tên đăng nhập !");
                } else if (!matKhau.equals(nhanvien.getMatKhau())) {
                    JOptionPane.showMessageDialog(frame, "Sai mật khẩu !");
                } else {
                    Auth.user = nhanvien; // user = manv
                    frame.dispose();
                }
            }

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
    }
}

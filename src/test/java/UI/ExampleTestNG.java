//package UI;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class ExampleTestNG {
//    private DoiMatKhauJDialog doimk = new DoiMatKhauJDialog();
//
//    @Test
//    public void testDoiMatKhauWithBlankMaNV() {
//        DoiMatKhauJDialog.txtMaNV.setText("");
//        DoiMatKhauJDialog.txtMatKhau.setText("old_password");
//        DoiMatKhauJDialog.txtMatKhauMoi.setText("new_password");
//        DoiMatKhauJDialog.txtMatKhauMoi2.setText("new_password");
//
//        DoiMatKhauJDialog.doiMatkhau();
//
//        Assert.assertEquals(MsgBox.getMessage(DoiMatKhauJDialog), "Vui lòng nhập tên đăng nhập trước!");
//    }
//
//    @Test
//    public void testDoiMatKhauWithIncorrectMaNV() {
//        DoiMatKhauJDialog.txtMaNV.setText("incorrect_ma_nv");
//        DoiMatKhauJDialog.txtMatKhau.setText("old_password");
//        DoiMatKhauJDialog.txtMatKhauMoi.setText("new_password");
//        DoiMatKhauJDialog.txtMatKhauMoi2.setText("new_password");
//
//        DoiMatKhauJDialog.doiMatkhau();
//
//        Assert.assertEquals(MsgBox.getMessage(DoiMatKhauJDialog), "Sai tên đăng nhập!");
//    }
//
//    @Test
//    public void testDoiMatKhauWithIncorrectOldPassword() {
//        DoiMatKhauJDialog.txtMaNV.setText("correct_ma_nv");
//        DoiMatKhauJDialog.txtMatKhau.setText("incorrect_old_password");
//        DoiMatKhauJDialog.txtMatKhauMoi.setText("new_password");
//        DoiMatKhauJDialog.txtMatKhauMoi2.setText("new_password");
//
//        DoiMatKhauJDialog.doiMatkhau();
//
//        Assert.assertEquals(MsgBox.getMessage(DoiMatKhauJDialog), "Sai mật khẩu hiện tại!");
//    }
//
//    @Test
//    public void testDoiMatKhauWithMismatchedConfirmation() {
//        DoiMatKhauJDialog.txtMaNV.setText("correct_ma_nv");
//        DoiMatKhauJDialog.txtMatKhau.setText("old_password");
//        DoiMatKhauJDialog.txtMatKhauMoi.setText("new_password");
//        DoiMatKhauJDialog.txtMatKhauMoi2.setText("mismatched_password_confirmation");
//
//        DoiMatKhauJDialog.doiMatkhau();
//
//        Assert.assertEquals(MsgBox.getMessage(DoiMatKhauJDialog), "Xác nhận mật khẩu không đúng!");
//    }
//
//    @Test
//    public void testDoiMatKhauSuccessfully() {
//        DoiMatKhauJDialog.txtMaNV.setText("correct_ma_nv");
//        DoiMatKhauJDialog.txtMatKhau.setText("old_password");
//        DoiMatKhauJDialog.txtMatKhauMoi.setText("new_password");
//        DoiMatKhauJDialog.txtMatKhauMoi2.setText("new_password");
//
//        DoiMatKhauJDialog.doiMatkhau();
//
//        Assert.assertEquals(MsgBox.getMessage(DoiMatKhauJDialog), "Đổi mật khẩu thành công!");
//    }
//}

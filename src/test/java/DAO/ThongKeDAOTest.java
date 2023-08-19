package DAO;

import DAO.ThongKeDAO;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class ThongKeDAOTest {

	private ThongKeDAO thongKeDAO;

	@BeforeClass
	public void setUp() {
		thongKeDAO = new ThongKeDAO();
	}

	@Test
	public void testGetBangDiem() {
		List<Object[]> result = thongKeDAO.getBangDiem(1); // Sửa mã khóa học
		Assert.assertNotNull(result);
		Assert.assertTrue(result.size() > 0);
	}

	@Test
	public void testGetLuongNguoiHoc() {
		List<Object[]> result = thongKeDAO.getLuongNguoiHoc();
		Assert.assertNotNull(result);
		Assert.assertTrue(result.size() > 0);
	}

	@Test
	public void testGetDiemChuyenDe() {
		List<Object[]> result = thongKeDAO.getDiemChuyenDe();
		Assert.assertNotNull(result);
		Assert.assertTrue(result.size() > 0);
	}

	@Test
	public void testGetDoanhThu() {
		List<Object[]> result = thongKeDAO.getDoanhThu(2018); // Sửa năm
		Assert.assertNotNull(result);
		Assert.assertTrue(result.size() > 0);
	}
}

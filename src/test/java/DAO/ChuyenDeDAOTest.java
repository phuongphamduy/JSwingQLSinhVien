package DAO;

import org.testng.Assert;
import org.testng.annotations.*;
import Entity.ChuyenDe;
import java.util.List;

public class ChuyenDeDAOTest {

    private ChuyenDeDAO chuyenDeDAO;

    @BeforeClass
    public void setUp() {
        chuyenDeDAO = new ChuyenDeDAO();
    }

    @AfterClass
    public void tearDown() {
        chuyenDeDAO = null;
    }

    @Test (priority = 1)
    public void testInsert() {
        ChuyenDe chuyenDe = new ChuyenDe("CD001", "Chuyen de Test", 1000000, 24, "test.png", "Mo ta chuyen de Test");
        chuyenDeDAO.insert(chuyenDe);

        ChuyenDe result = chuyenDeDAO.selectById("CD001");
        Assert.assertEquals(chuyenDe, result);
    }

    @Test (priority = 2)
    public void testUpdate() {
        ChuyenDe chuyenDe = chuyenDeDAO.selectById("CD001");
        chuyenDe.setTenCD("Chuyen de Test Updated");
        chuyenDeDAO.update(chuyenDe);

        ChuyenDe result = chuyenDeDAO.selectById("CD001");
        Assert.assertEquals(chuyenDe, result);
    }

    @Test (priority = 3)
    public void testSelectById() {
        ChuyenDe chuyenDe = chuyenDeDAO.selectById("CD001");
        Assert.assertNotNull(chuyenDe);
        Assert.assertEquals(chuyenDe.getTenCD(),"Chuyen de Test Updated");
    }
    @Test
    public void testDelete() {
        chuyenDeDAO.delete("CD001");

        ChuyenDe result = chuyenDeDAO.selectById("CD001");
        Assert.assertNull(result);
    }

    @Test
    public void testSelectAll() {
        List<ChuyenDe> chuyenDeList = chuyenDeDAO.selectAll();
        Assert.assertNotNull(chuyenDeList);
        Assert.assertTrue(chuyenDeList.size() > 0);
    }
}


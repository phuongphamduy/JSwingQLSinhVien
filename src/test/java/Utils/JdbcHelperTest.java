package Utils;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcHelperTest {
    @Test
    public void testUpdate() {
        int result = JdbcHelper.update("INSERT INTO Students VALUES (?, ?, ?)", "John", "Doe", 20);
        Assert.assertEquals(result, 1, "Insert should affect 1 row");
    }

    @Test
    public void testQuery() throws SQLException {
        ResultSet rs = JdbcHelper.query("SELECT * FROM Students WHERE FirstName = ?", "John");
        Assert.assertTrue(rs.next(), "Result set should have at least one row");
        Assert.assertEquals(rs.getString("LastName"), "Doe", "Last name should match inserted value");
        Assert.assertFalse(rs.next(), "Result set should have only one row");
    }

    @Test
    public void testValue() {
        Object result = JdbcHelper.value("SELECT COUNT(*) FROM Students");
        Assert.assertNotNull(result, "Result should not be null");
        Assert.assertTrue(result instanceof Integer, "Result should be an instance of Integer");
    }
}

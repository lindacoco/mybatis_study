package mybatis_study.jdbc;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;



public class HikariCPFactoryTest {
    private static final Log log = LogFactory.getLog(HikariCPFactoryTest.class);


	@Test
	public void testGetDataSource() {
		HikariCPFactory factory = new HikariCPFactory();
		DataSource ds = factory.getDataSource();
		Assert.assertNotNull(ds);
		log.trace(ds.toString());
		
		
		
		try{
			Connection con = ds.getConnection();
			log.trace(ds.toString());
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}

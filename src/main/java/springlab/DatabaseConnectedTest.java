package springlab;
import static org.junit.Assert.*;

import org.junit.Test;

import springlab.dao.CloDao;
import springlab.entity.Clo;


public class DatabaseConnectedTest {

	@Test
	public void test() {
		CloDao clodao = new CloDao();

		// Add new clo
		Clo clo = new Clo();
		clo.setName("CLO 1");
		clo.setDescription("Design efficient solutions for algorithmic problems");
		clo.setPlo("2");
		clodao.addClo(clo);

		assertTrue(clodao
					.getCloById(1)
					.getDescription()
					.equalsIgnoreCase("Design efficient solutions for algorithmic problems"));
	}

}

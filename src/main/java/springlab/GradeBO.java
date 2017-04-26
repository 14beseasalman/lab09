
package springlab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import springlab.dao.CloDao;
import springlab.entity.Clo;


public class GradeBO {
	@Autowired
	private CloDao clodao_property;
	
	
	public static void main(String[] args) {
		GradeBO gbo = new GradeBO();
		System.out.println(gbo.getGradebookClosCSV());
		
	}
	String getGradebookClosCSV(){
		List<Clo> clos = clodao_property.getAllClos();
		String CSVHeader = "cloId,name,description,plo,btLevel\n";
		String CSVBody = "";
		
		for(Clo clo: clos){
			CSVBody +=clo.toCSV() + "\n";
			
			System.out.println();
		}
		
		
		return (CSVHeader+CSVBody).trim();
	}
	
	public CloDao getClodao_property() {
		return clodao_property;
	}
	
	public void setClodao_property(CloDao clodao_property) {
		this.clodao_property = clodao_property;
	}


}
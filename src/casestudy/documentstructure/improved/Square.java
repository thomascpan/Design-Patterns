package casestudy.documentstructure.improved;

public class Square extends WorldObject{

	private String specification;
	
	public Square(String specification){
		this.specification = specification;
	}
	
	
	
	
	@Override
	public void print() {
		System.out.println(specification);
	}




	@Override
	public String getName() {
		return specification;
	}

	
	
}

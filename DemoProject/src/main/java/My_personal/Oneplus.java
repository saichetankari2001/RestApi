package My_personal;

public class Oneplus implements Mobiles {

	Color color;
	
	Oneplus(){
		System.out.println("Oneplus constructor added");
	}
	
	Oneplus(Color colorobj){
	 this.color = colorobj;
		
	}
	
	@Override
	public void getmodelandcolour() {
		System.out.println("Model : 9pro");
		color.getOnepluscolor();

	}

}

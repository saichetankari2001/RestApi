package My_personal;

public class Iphone implements Mobiles {

	Color color;
	
	Iphone(Color colorObj){
		this.color = colorObj;
		
	}
	
	@Override
	public void getmodelandcolour() {
		System.out.println("Model : 13pro");
		color.getIphonecolor();

	}

}

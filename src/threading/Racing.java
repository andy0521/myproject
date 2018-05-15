package threading;

import java.util.List;
import java.util.ArrayList;

public class Racing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Horse> horses=new ArrayList<>();
		for (int i=0 ;i<=8;i++){
			
		
		Horse h = new Horse();
	horses.add(h);

		h.start();

		}
	}

}

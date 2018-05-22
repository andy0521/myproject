package threading;

import java.util.Random;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class Snow extends Thread{

int x;
int y=800;
Random r = new Random();
public Snow(){
	x=r.nextInt();
}
@Override
public void run (){
	for (int i=800;i>=0;i--){
		y=y-1;
		int movement = r.nextInt(3)-	1;
	
	x=x-movement;
	System.out.println(new String (new char[x]).replace("\0"," "));
	System.out.println("1");
	}
}
	

}

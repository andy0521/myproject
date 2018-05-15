package threading;

public class Horse extends Thread {
	@Override
	public void run(){
		
		for (int i=0;i<=100;i++){
			System.out.println (getName()+":"+i);
			try {
				sleep(50);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	

}

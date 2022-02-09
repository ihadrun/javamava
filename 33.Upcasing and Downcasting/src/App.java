class Machine{
	public void start() {
		System.out.println("machine started");
	}
}
class Camera extends Machine{
	
	public void start() {
		System.out.println("camera started");
	}
	public void snap() {
		System.out.println("Photo take.");
	}
}
public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1= new Camera();
		machine1.start();
		camera1.start();	
		camera1.snap();
		
		//upcasting
		
		Machine machine2 = camera1;
		machine2.start();

		
		
		
		// TODO Auto-generated method stub

	}

}

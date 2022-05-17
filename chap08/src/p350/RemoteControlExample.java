package p350;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl1 rc = null;
		
		rc = new Television();
		rc.turnoOn();
		rc.turnoOff();
		
		rc = new Audio();
		rc.turnoOn();
		rc.turnoOff();
		
	}

}

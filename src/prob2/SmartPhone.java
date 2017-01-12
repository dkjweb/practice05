package prob2;

public class SmartPhone extends MusicPhone {
	@Override
	public void execute( String function ) {
		if ( function.equals("앱") ) {
			runApp();
			return;
		}
		
		super.execute( function );
	}

	private void runApp() {
		System.out.println("어플리케이션 실행");
	}
}

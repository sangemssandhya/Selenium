import java.util.Date;

public class CaptureTimeStamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Time=new Date().toString().replace(" ", "_").replace(":", "_");
		System.out.println(Time);

	}

}

package dateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateTime {

	public static void main(String[] args) {
		String dateTime = "Wed Oct 12 13:39:00 CST 2011";
		Date date = new Date("Wed Oct 12 13:39:00 CST 2011");
		String dateTimeStr =  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
		System.out.println(dateTimeStr);

	}
}

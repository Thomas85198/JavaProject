import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTIme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//輸入的是import java.util.Date
		Date currentDate = new Date();
		System.out.println(currentDate);
		
		//設定時間樣式
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		//輸入現在時間並套用樣式
		System.out.println(timeFormat.format(currentDate));
		
		//日期
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(dateFormat.format(currentDate));
		//設定一週星期幾
		SimpleDateFormat dayOftheWeekFormat = new SimpleDateFormat("EEE");
		System.out.println(dayOftheWeekFormat.format(currentDate));
		//設定時間AM PM
		SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
		System.out.println(clockFormat.format(currentDate));
		
		
	}

}

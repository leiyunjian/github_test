import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Lei on 2016/10/19.
 */
public class GitHub {
	public static void main(String[] args) {
		System.out.println("init master");
		System.out.println("commit master  second");
		System.out.println("commit branchone first");
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(format.format(date));
		System.out.println("commit master thrid");
	}
}

import com.phone.*;
public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	OSFactory obj=new OSFactory();
	OS os=obj.getInstance("Open");
	os.spec();
	}

}

package weekend.week3.day2;

public class JavaConnection2 extends MySqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection2 jc2=new JavaConnection2();
		jc2.executeQuery();
		jc2.connect();
		jc2.disconnect();
		jc2.executeQuery();
	}

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Concrete class - connection successfull");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Concrete class - connection terminated");
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Concrete class - update success");
	}

}

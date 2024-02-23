package weekend.week3.day2;

public class JavaConnection implements DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
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

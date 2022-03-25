package step;

public class Sample {
	public void name(String name) {
System.out.println(name);
	}
	public void age(int age) {
System.out.println(age);
	}
	public void email(String email) {
System.out.println(email);
	}
	public void phoneNumber(long mob) {
System.out.println(mob);
	}
public static void main(String[] args) {
	Sample s=new Sample();
	s.name("Prasathsing");
	s.age(24);
	s.email("prasathprakash17@gmail.com");
	s.phoneNumber(9047754505l);
	
}
}

package day03;
 abstract class cat{
	 abstract public void speak();
	
}
 class cat01 extends cat{
	public void speak() {
			System.out.println("è����");
		}
	}

 abstract class dog{
	void speak() {
		System.out.println("���Թ�ͷ");
	}
}

public class dongwu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      cat01 s=new cat01();
//        s.speak();
//        dog w=new dog();
//        w.speak();
	}

}

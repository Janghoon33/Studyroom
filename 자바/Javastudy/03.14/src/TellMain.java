
public class TellMain {

	public static void main(String[] args) {
		
		Tell t1 = new Tell();
		
		t1.call();
		t1.click();
		t1.send();
		
		Folder f1 = new Folder();
		
		f1.call();
		//오버라이딩된 메소드는 상속 받은 메소드가 아니라 새롭게 재정의한 메소드의 기능만 사용되어진다
		f1.click();
		f1.send();
		
		Slider s1 = new Slider();
		s1.sliderOpen();
		
		SmartPhone sm1 = new SmartPhone();
		sm1.smartOpen();
		sm1.call();
		sm1.send();
		
		//업캐스팅 : 자식클래스 타입에서 부모 클래스 타입으로 바꾸는것
		//부모 Tell, Folder, Slider, SmartPhone
		//특징1 : 업캐스팅 된후에는 상위 클래스에 있는것만 사용 가능
		System.out.println("===================");
		Tell t2 = f1;
		t2.call();
		t2.send();
		//특징 2 : 오버라이딩된 메소드는 업캐스팅하더라도 새롭게 정의한 기능을 수행시킨다
		t2.click();
		//t2.folderopen(); -> folderOpen은 Folder클래스의 고유 기능이 때문에 사용안됨
	}

}

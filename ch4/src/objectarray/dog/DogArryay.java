package objectarray.dog;

public class DogArryay {
	
	public static void main(String[] args) {
		// Dog 인스턴스 4개를 생성해서 배열에 저장하고
		// 정보를 출력하세요(get()함수 사용)
		Dog[] dogs = new Dog[4];
		
		
		// 배열에 저장(입력)
		dogs[0] = new Dog("구름" ,"푸들");
		dogs[1] = new Dog("초코" ,"시츄");
		dogs[2] = new Dog("루이" ,"비숑");
		dogs[3] = new Dog("베베" ,"포메");
	
		// 전체 출력
		for(int i = 0; i < dogs.length; i++) {
		System.out.println(dogs[i].showDogInfor());

		}
		System.out.println("====================");
	
		//향상된 for문
		for(Dog dog : dogs) {
			System.out.println(dog.getName()+ "," + dog.getType());
		}
	}
}
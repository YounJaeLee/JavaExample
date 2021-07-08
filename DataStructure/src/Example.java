import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {
	public static void main(String[] args) {
		// 1. 강아지와 고양이를 키우는 사람의 목록을 저장하고 싶다.
		// 2. "강아지", "고양이"라는 key로 목록에 접근하고 싶다.
		// 3. 키우는 사람의 목록은 순서가 보장되어있어야 한다
		// 4. 동명이인이 있을 수 있기 때문에 중복은 허용한다
		// 5. 입력값으로 이름 배열, 키우는 동물 배열이 주어진다, 길이는 같다
		
		List<String> people = Arrays.asList(new String[]{ "가나다", "라마바", "사아자", "차카타", "파하가", "나다라", "가나다" });
		List<String> pets = Arrays.asList(new String[]{ "강아지", "강아지", "고양이", "고양이", "고양이", "고양이", "강아지" });
	}
}
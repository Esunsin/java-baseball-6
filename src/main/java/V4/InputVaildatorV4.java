package V4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputVaildatorV4 {

	public void validate(String input, List<Integer> computer) {

		//숫자만 들어와야 한다
		//세자리 숫자만 들어와야 한다
		//중복된 숫자는 들어올 수 없다

		if (input.length() != computer.size()) {
			throw new IllegalArgumentException("잘못된 입력입니다.");
		}
		if(!checkDuplicate(input)){
			throw new IllegalArgumentException("잘못된 입력입니다.");
		}

	}

	private boolean checkDuplicate(String str){
		Map<Character, Integer> check = new HashMap<>();
		for(char c : str.toCharArray()){
			check.put(c,check.getOrDefault(c,0) + 1);
			if(check.get(c) > 1) return false;
		}
		return true;
	}
}

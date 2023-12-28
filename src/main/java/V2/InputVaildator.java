package V2;

public class InputVaildator {

	public void validate(int input) {

		//숫자만 들어와야 한다
		//세자리 숫자만 들어와야 한다
		//중복된 숫자는 들어올 수 없다


		if (input < 100 || input > 999) {
			throw new IllegalArgumentException("세자리 숫자만 입력 가능합니다.");
		}
		if (input % 10 == input / 10 % 10 || input / 10 % 10 == input / 100 || input % 10 == input / 100) {
			throw new IllegalArgumentException("중복된 숫자는 입력할 수 없습니다.");
		}
	}
}

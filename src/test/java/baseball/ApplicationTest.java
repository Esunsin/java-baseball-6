package baseball;

import V2.Ball;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
    @Test
    void 게임종료_후_재시작() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("246", "135", "1", "597", "589", "2");
                    assertThat(output()).contains("낫싱", "3스트라이크", "1볼 1스트라이크", "3스트라이크", "게임 종료");
                },
                1, 3, 5, 5, 8, 9
        );
    }

    @Test
    void 예외_테스트() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("1234"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    void ball_is_equal(){
        Ball ball1 = new Ball(1,1);
        Ball ball2 = new Ball(1,1);

        Boolean result = ball1.isSameBall(ball2);

        assertThat(result).isTrue();
    }

    @Test
    void ball_is_not_equal(){
        Ball ball1 = new Ball(1,1);
        Ball ball2 = new Ball(1,2);
        assertThat(ball1 == ball2).isTrue();
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}

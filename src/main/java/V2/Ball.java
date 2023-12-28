package V2;

import java.util.Objects;

class Ball {

    private int number;
    private int order;

    public Ball(int number, int order) {
        if (1 > number && 9 < number) {
            throw new IllegalArgumentException("number는 1부터 9까지만 가능합니다");
        }
    }

    private Boolean isSameNumber (Ball target) {
        return target.number == this.number;
    }

    private Boolean isSameOrder (Ball target) {
        return target.order == this.order;
    }

    public Boolean isBall (Ball target) {
        return target.number == this.number && !(target.order == this.order);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return number == ball.number && order == ball.order;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, order);
    }
}

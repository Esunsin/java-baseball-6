package V2;

import java.util.Objects;

class Ball {

    private int number;
    private int order;

    @Override
    public String toString() {
        return "Ball{" +
                "number=" + number +
                ", order=" + order +
                '}';
    }

    public Ball(int number, int order) {
        this.number= number;
        this.order = order;
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

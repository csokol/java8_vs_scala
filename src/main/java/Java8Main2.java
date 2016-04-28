import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Java8Main2 {

    public static void main(String[] args) {
        List<String> msgs = Arrays.asList("msg1", "msg2", "msg3");

        BiFunction<Builder, ? super String, Builder> acc = (b, msg) -> {
            b.add(msg);
            return b;
        };

        BinaryOperator<Builder> combiner = (b1, b2) -> {
            return new Builder();
        };

        Builder builder = msgs.stream().reduce(new Builder(), acc, combiner);

        System.out.println(builder);
    }

}

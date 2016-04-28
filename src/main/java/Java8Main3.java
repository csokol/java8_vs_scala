import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Java8Main3 {

    public static void main(String[] args) {
        List<String> msgs = Arrays.asList("msg1", "msg2", "msg3");

        BiFunction<ImmutableBuilder, ? super String, ImmutableBuilder> acc = (b, msg) -> {
            return b.add(msg);
        };

        BinaryOperator<ImmutableBuilder> combiner = (b1, b2) -> {
            return new ImmutableBuilder();
        };

        ImmutableBuilder builder = msgs.stream().reduce(new ImmutableBuilder(), acc, combiner);

        System.out.println(builder);
    }

}

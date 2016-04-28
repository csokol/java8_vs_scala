import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Java8Main1 {

    public static void main(String[] args) {
        List<String> msgs = IntStream.range(1, 10000)
            .mapToObj(i -> "msg" + i).collect(toList());

        BiFunction<ImmutableBuilder, ? super String, ImmutableBuilder> acc = (b, msg) -> {
            System.out.println(Thread.currentThread().getId());
            return b.add(msg);
        };
        BinaryOperator<ImmutableBuilder> combiner = (builder1, builder2) -> {
            return builder1.addAll(builder2);
        };

        ImmutableBuilder b = msgs.stream().parallel().reduce(new ImmutableBuilder(), acc,
            combiner);

        System.out.println(b);


    }



}

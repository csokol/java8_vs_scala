import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Java8Main4Parallel {

    public static void main(String[] args) {
        List<String> msgs = IntStream.range(0, 100000).mapToObj(i -> "msg" + i).collect(toList());

        BiFunction<ImmutableBuilder, String, ImmutableBuilder> acc = (b, msg) -> {
//            System.out.println(Thread.currentThread().getId());
            return b.add(msg);
        };

        BinaryOperator<ImmutableBuilder> combiner = (b1, b2) -> {
            return b1.addAll(b2);
        };

        long t0 = System.currentTimeMillis();
        ImmutableBuilder builder = msgs.stream().parallel()
            .reduce(new ImmutableBuilder(), acc, combiner);
        long t1 = System.currentTimeMillis();

        System.out.println(t1 - t0);

//        System.out.println(builder);

//        Java8Main4.main(new String[]{});
    }

}

import java.util.Arrays;
import java.util.List;

public class Java8Main1 {

    public static void main(String[] args) {
        Builder builder = new Builder();

        List<String> msgs = Arrays.asList("msg1", "msg2", "msg3");

        msgs.stream().forEach(msg -> builder.add(msg));
        System.out.println(msgs);
    }

}

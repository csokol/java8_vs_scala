import java.util.ArrayList;
import java.util.List;

public class ImmutableBuilder {

    private List<String> msgs = new ArrayList<>();

    public ImmutableBuilder() {
    }

    public ImmutableBuilder(List<String> msgs) {
        this.msgs = msgs;
    }

    public ImmutableBuilder add(String msg) {
        ArrayList<String> msgs = new ArrayList<>();
        msgs.addAll(this.msgs);
        msgs.add(msg);
        return new ImmutableBuilder(msgs);
    }

    public ImmutableBuilder addAll(List<String> msgs2) {
        ArrayList<String> msgs = new ArrayList<>();
        msgs.addAll(this.msgs);
        msgs.addAll(msgs2);
        return new ImmutableBuilder(msgs);
    }

    public ImmutableBuilder addAll(ImmutableBuilder builder) {
        return this.addAll(builder.msgs);
    }

    @Override
    public String toString() {
        return "Builder{" +
            "msgs=" + msgs +
            '}';
    }
}

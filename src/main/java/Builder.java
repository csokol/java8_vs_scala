import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Builder {

    private List<String> msgs = Collections.synchronizedList(new ArrayList<>());

    public void add(String msg) {
        this.msgs.add(msg);
    }

    public void addAll(List<String> msgs) {
        this.msgs.addAll(msgs);
    }

    @Override
    public String toString() {
        return "Builder{" +
            "msgs=" + msgs +
            '}';
    }

    public List<String> getMsgs() {
        return msgs;
    }
}

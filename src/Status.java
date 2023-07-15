import java.util.Arrays;
import java.util.List;

public enum Status {

    SUCCESS(200), FAILED(400), BLOCK, REJECT(500);

    private int i;
    Status() {
        this.i = i;
    }
    Status(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

class Main {
    public static void main(String[] args) {
        List<Status> s = List.of(Status.values());
        Status.BLOCK.setI(403);
        s.stream().forEach(s1 -> System.out.println(s1.ordinal() + ": " + s1 + " : "  + s1.getI()));

    }
}

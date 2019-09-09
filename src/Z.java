
class X {

    Y y = new Y();

    public X() {
        System.out.print("X");
    }
}

class Y {

    public Y() {
        System.out.print("Y");
    }
}

public class Z extends X {

    Y y = new Y();

    public Z() {
        System.out.print("Z");
    }

    public static void main(String[] args) {
        new Z();
    }
}
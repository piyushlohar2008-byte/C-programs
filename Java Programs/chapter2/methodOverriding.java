public class methodOverriding {
    public static void main(String[] args) {
        override2 v1 = new override2();
        v1.run();
        System.out.println();
        override v2 = new override();
        v2.run();
    }
}

class override {
    void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }
    }
}

class override2 extends override {
    void run() {
        int i = 1;
        while(i <= 5) {
            System.out.print(i+" ");
            i++;
        }
    }
}
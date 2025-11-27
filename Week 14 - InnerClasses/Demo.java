public class Demo {
    public static void main(String[] args) {
        OuterClass OC = new OuterClass();
        OC.testMethodOC();

        OuterClass.innerClass ICOBJ = OC.new innerClass();
        ICOBJ.testPublicMethodInnerClass();

    }
}

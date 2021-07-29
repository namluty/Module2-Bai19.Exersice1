public class ClassExampleTest {
    private static ClassExample classExample;
    public static final String[] validClass = new String[]{"C0318G","A1222K","P1111M"};
    public static final String[] invalidClass = new String[]{"M0318G","P0323A","B1315C"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String classes : validClass) {
            boolean isvalid = classExample.validate(classes);
            System.out.println("Class is " + classes + " is valid: " + isvalid);
        }
        for (String classes : invalidClass) {
            boolean isvalid = classExample.validate(classes);
            System.out.println("Class is " + classes + " is valid: " + isvalid);
        }
    }
}

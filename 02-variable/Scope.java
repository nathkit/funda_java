public class Scope {
    public static void main (String[] args) {
        Float outsideFloat = 7.5f;
        {
            Float insideFloat = 8.5f;
            System.out.println("Inside Float: " + insideFloat);
            System.out.println("Outside Float(inside): " + outsideFloat);
        }

        System.out.println("Outside Float: " + outsideFloat);
    }
}

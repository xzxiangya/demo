public class ComputeFactory {

    private static final Sub sub = new Sub();
    private static final Add add = new Add();

    public static Computable getComputable(char symbol) {
        switch (symbol) {
            case '+':
                return add;
            case '-':
                return sub;
            default:
                throw new IllegalArgumentException();
        }
    }
}

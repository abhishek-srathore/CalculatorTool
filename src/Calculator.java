public class Calculator {
    private Addition addition;

    public Calculator() {
        this.addition = new Addition();
    }

    public int add(int a, int b) {
        return addition.add(a, b);
    }
}
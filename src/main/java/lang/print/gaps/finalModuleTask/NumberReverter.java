package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int n = 0;
        while (number > 0) {
            n = n * 10;
            n = n + (number % 10);
            number = number / 10;
        }
        System.out.println(n);
    }
}

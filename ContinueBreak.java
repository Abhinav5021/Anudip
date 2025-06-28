public class ContinueBreak {
    @SuppressWarnings("UnnecessaryContinue")
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 100; i++) {
            if (i == 9) {
                System.out.println("Skipped due to Continue");
                continue;
            } else if (i == 15) {
                System.out.println("Ended due to Break");
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}

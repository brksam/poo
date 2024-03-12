import java.text.NumberFormat;

public class formataNUM {
    public static void main(String[] args) {
        System.out.println(NumberFormat.getCurrencyInstance().format(1234567890));

        double vetor[] = {532.34, 5434.23, 8923.456, 1883.345};
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        for (int a = 0; a < vetor.length; a ++) {
            if ( a != 0)
                System.out.print(" - ");

            System.out.print(nf.format(vetor[a]));
        }

    }
}

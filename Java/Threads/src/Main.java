import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // 1'den 10000'e kadar sayıları ekleyelim
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        // 4 eşit parçaya ayırma işlemi
        int chunkSize = 2500;
        ArrayList<Integer> chunk1 = new ArrayList<>(numbers.subList(0, chunkSize));
        ArrayList<Integer> chunk2 = new ArrayList<>(numbers.subList(chunkSize, 2 * chunkSize));
        ArrayList<Integer> chunk3 = new ArrayList<>(numbers.subList(2 * chunkSize, 3 * chunkSize));
        ArrayList<Integer> chunk4 = new ArrayList<>(numbers.subList(3 * chunkSize, 4 * chunkSize));

        // Tek ve çift sayıları bulacak Thread'leri oluşturalım
        OddNumberFinder oddNumberFinder1 = new OddNumberFinder(chunk1);
        OddNumberFinder oddNumberFinder2 = new OddNumberFinder(chunk2);
        OddNumberFinder oddNumberFinder3 = new OddNumberFinder(chunk3);
        OddNumberFinder oddNumberFinder4 = new OddNumberFinder(chunk4);

        EvenNumberFinder evenNumberFinder1 = new EvenNumberFinder(chunk1);
        EvenNumberFinder evenNumberFinder2 = new EvenNumberFinder(chunk2);
        EvenNumberFinder evenNumberFinder3 = new EvenNumberFinder(chunk3);
        EvenNumberFinder evenNumberFinder4 = new EvenNumberFinder(chunk4);

        // Thread'leri başlatalım
        oddNumberFinder1.start();
        oddNumberFinder2.start();
        oddNumberFinder3.start();
        oddNumberFinder4.start();

        evenNumberFinder1.start();
        evenNumberFinder2.start();
        evenNumberFinder3.start();
        evenNumberFinder4.start();

        // Thread'lerin işlerinin bitmesini bekleyelim
        try {
            oddNumberFinder1.join();
            oddNumberFinder2.join();
            oddNumberFinder3.join();
            oddNumberFinder4.join();

            evenNumberFinder1.join();
            evenNumberFinder2.join();
            evenNumberFinder3.join();
            evenNumberFinder4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Sonuçları gösterelim
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        oddNumbers.addAll(oddNumberFinder1.getOddNumbers());
        oddNumbers.addAll(oddNumberFinder2.getOddNumbers());
        oddNumbers.addAll(oddNumberFinder3.getOddNumbers());
        oddNumbers.addAll(oddNumberFinder4.getOddNumbers());

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.addAll(evenNumberFinder1.getEvenNumbers());
        evenNumbers.addAll(evenNumberFinder2.getEvenNumbers());
        evenNumbers.addAll(evenNumberFinder3.getEvenNumbers());
        evenNumbers.addAll(evenNumberFinder4.getEvenNumbers());

        System.out.println("Tek Sayılar: " + oddNumbers);
        System.out.println("Çift Sayılar: " + evenNumbers);
    }
}

class OddNumberFinder extends Thread {
    private ArrayList<Integer> numbers;
    private ArrayList<Integer> oddNumbers;

    public OddNumberFinder(ArrayList<Integer> numbers) {
        this.numbers = numbers;
        this.oddNumbers = new ArrayList<>();
    }

    @Override
    public void run() {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
    }

    public ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }
}

class EvenNumberFinder extends Thread {
    private ArrayList<Integer> numbers;
    private ArrayList<Integer> evenNumbers;

    public EvenNumberFinder(ArrayList<Integer> numbers) {
        this.numbers = numbers;
        this.evenNumbers = new ArrayList<>();
    }

    @Override
    public void run() {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
    }

    public ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Arraylisti daha iyi anlamak amacıyla yapılan bir proje
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Girilicek Satır Sayısı : ");
            int numLines = in.nextInt();
            List<List<Integer>> lines = new ArrayList<>();

            for(int i = 0; i < numLines; i++){
                List<Integer> line = new ArrayList<Integer>();
                System.out.print((i+1)+". Satır ");
                System.out.print("Girilicek eleman sayısı : ");
                int numIntegers = in.nextInt();
                if(numIntegers == 0) lines.add(null);
                else{
                    for(int j = 0; j < numIntegers; j++){
                        System.out.print((j+1)+". Eleman ");
                        line.add(in.nextInt());
                    }
                    lines.add(line);
                    System.out.println("Satır Eklendi");
                }
            }
            System.out.print("Sorgu Sayısı : ");
            int querySize = in.nextInt();
            for (int i = 0; i < querySize; i++) {
                System.out.print("Sorgulanıcak Satır : ");
                int x = in.nextInt() -1;
                System.out.print("Sorgulanıcak Eleman Sütunu: ");
                int y = in.nextInt() -1;
                try{
                    System.out.println(lines.get(x).get(y));
                }catch(Exception e){
                    System.out.println("ERROR!");
                }

            }
    }
}
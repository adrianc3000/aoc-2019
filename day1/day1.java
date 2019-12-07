import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class day1 {

    public static void main(String[] args){
        try {
            
            File textOne = new File("D:\\Uni\\aoc-2019\\day1\\day1.txt");
            Scanner sc = new Scanner(textOne);
            List<Integer> list = new ArrayList<Integer>();

            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                int line = Integer.parseInt(data);
                list.add(line);
            }
            sc.close();

            int total = 0;
            for (int i = 0; i < list.size(); i++) {
                total = total + (list.get(i) / 3) - 2;
            }
            System.out.println(total);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
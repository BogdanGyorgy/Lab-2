import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        BufferedReader flux_in;
        flux_in = new BufferedReader(new InputStreamReader(new FileInputStream("src/Lab2/judete.txt")));
        String [] judete = flux_in.lines().toArray(String[]::new);

        Arrays.sort(judete);
        System.out.println("Judete ordonate ");
        for( String judet : judete)
        {
            System.out.println(judet);
        }

        System.out.println("Introduceti un judet pe care doriti sa l cautati : ");
        String judetCautat=scanner.nextLine();
        int pozitie=Arrays.binarySearch(judete, judetCautat);
        if(pozitie>=0)
        {
            System.out.println("Judetul :  "+ judetCautat + " se afla pe pozitia " + pozitie);
        }
        else
        {
            System.out.println("Judetul :  "+ judetCautat + " nu a fost gasit" );
        }

        scanner.close();
    }
    }

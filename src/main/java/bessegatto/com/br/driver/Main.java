package bessegatto.com.br.driver;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero do contrato: ");
        int number = sc.nextInt();
        System.out.print("Data: ");
        LocalDate data = LocalDate.parse(sc.nextLine(),sdf);
        System.out.print("Valor do contrato: ");
        double valor = sc.nextDouble();
        System.out.print("Quantidade de parcelas: ");
        int parcelas = sc.nextInt();

    }
}
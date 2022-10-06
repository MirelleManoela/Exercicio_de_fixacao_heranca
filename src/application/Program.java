package application;

import entities.Product;
import entities.ImportedProduct;
import  entities.usedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();


        for (int i = 1 ; i<=n ; i++){
            System.out.println("Product #"+ i + " data:" );

            System.out.print("Comm, used or imported (c/u/i): ");
            char ch = sc.next().charAt(0);


            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ch == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                list.add(new ImportedProduct(name, price, customsFee));
            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new usedProduct(name, price, date));

            }else {
                list.add(new Product(name, price));
        }
        }
        System.out.println();
        System.out.println("PRICE TAGS");

        for (Product prod : list){
         System.out.println(prod.priceTag());
        }
    }

}

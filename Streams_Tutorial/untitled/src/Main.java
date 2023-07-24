import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.*;

import static java.util.Map.entry;

public class Main {


    public static void main(String[] args) {
        Exercises exercises = new Exercises();
        List<Product> products = getProducts();

      /*  List<Product> iPhones = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains("iphone")) {
                iPhones.add(product);
            }
        }
        iPhones.forEach(System.out::println);*/

        List<Product> ex1 = products.stream().filter(p -> p.getName().toLowerCase().contains("iphone")).collect(Collectors.toList());
        System.out.println("--------------");
        ex1.forEach(System.out::println);


        List<String> ex2 = products.stream()
                //comment out filter if you want all phones
                //.filter(p -> p.getName().toLowerCase().contains("iphone"))
                .map(p -> p.getAttributes().get("colour"))
                //.distinct()
                // use if you want to eliminate duplicates
                .collect(Collectors.toList());
        ex2.forEach(System.out::println);

       /* OptionalDouble ex3 = products.stream()
                .filter(p->p.getName().toLowerCase().contains("iphone"))
                .mapToDouble(x -> x.getPrice() - (x.getPrice() * x.getDiscount()))
                .average();*/

        Double ex3 = products.stream()
                .filter(p->p.getName().toLowerCase().contains("iphone"))
                .mapToDouble(x -> x.getPrice() - (x.getPrice() * x.getDiscount()))
                .average()
                .orElse(-1);



        //double a = ex3.orElse(-1);
        //double a = ex3.getAsDouble();
        System.out.println(Math.round(ex3 * 100.0)/100.0);
        System.out.printf("%.2f", ex3);

        List<Product> ex4 = products.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .collect(Collectors.toList());

        ex4.forEach(System.out::println);



        System.out.println("-------------");
        Product ex5 = products.stream()
                .max(Comparator.comparing(Product::getPrice)).get();
        System.out.println(ex5);

        System.out.println("-------------");
        Product ex6 = products.stream()
                .min(Comparator.comparing(p->p.getPrice())).get();
        System.out.println(ex6);

        Map<String, List<String>> ex7 = products.stream()
                .collect(
                        Collectors.groupingBy(p -> p.getAttributes().getOrDefault("colour", "No Colour"), Collectors.mapping(Product::getName, Collectors.toList()))
                );
        //ex7.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("-------");
        products.parallelStream().forEach(p -> System.out.println(p.getName() + " " + Thread.currentThread().getName()));
        System.out.println("-------");
        products.stream().forEach(p -> System.out.println(p.getName() + " " + Thread.currentThread().getName()));
        System.out.println("-------");


        for(Map.Entry<String, List<String>> item : ex7.entrySet()){
            //List<String> list = item.getValue();
            for (String str : item.getValue()){
                System.out.println("Key = "+ item.getKey() + " | String = "+ str);
            }
        }

        System.out.println("---list2---");
        List<Product> list2 = exercises.nonIPhoneProducts(products);


        System.out.println("---list3---");
        List<Product> list3 = exercises.sixPointOneInchesScreenSizeProducts(products);

        System.out.println("---dub4---");
        Double dub4 = exercises.sixPointOneInchesScreenSizeIPhoneAveragePriceExcludingDiscount(products);
        System.out.println(dub4);

        System.out.println("---dub5---");
        Double dub5 = exercises.sixPointOneInchesScreenSizeIPhoneAveragePriceIncludingDiscount(products);

        System.out.println("---prod---");
        Product prod = exercises.productWithMaxDiscountInDollars(products);
        System.out.println(prod);
    }

    protected static List<Product> getProducts(){
        List<Product> products = new ArrayList<>();

        Map<String, String> productAttributes1 = new HashMap<String, String>(){{
            put("colour", "black");
            put("screen size", "4.7 inches");
        }};

        products.add(new Product("IPhone 8 64GB Black", 280, 0.05, productAttributes1));

        Map<String, String> productAttributes2 = new HashMap<String, String>() {{
            put("colour", "red");
            put("screen size", "6.1 inches");
        }};
        products.add(new Product("IPhone XR 64GB Red", 370, 0.03, productAttributes2));

        Map<String, String> productAttributes3 = new HashMap<String, String>() {{
            put("colour", "green");
            put("screen size", "6.1 inches");
        }};
        products.add(new Product("IPhone 13 128GB Green", 1000, 0, productAttributes3));

        Map<String, String> productAttributes4 = new HashMap<String, String>() {{
            put("colour", "black");
            put("screen size", "6.7 inches");
        }};
        products.add(new Product("Google Pixel 6 Pro 128 GB", 800, 0, productAttributes4));

        Map<String, String> productAttributes5 = new HashMap<String, String>() {{
            put("colour", "white");
            put("screen size", "6.3 inches");
        }};
        products.add(new Product("Samsung Galaxy Note10 Plus 256GB", 410, 0.07, productAttributes5));

        return products;
    }
}
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

    public class Exercises {

            public List<Product> nonIPhoneProducts(List<Product> products) {
                // TODO return products which don't contain a word iphone
                // (P.S. use toLowerCase() to match all the cases like iPhone, IPhone, etc.)
               List<Product> list = products.stream().filter(x -> !x.getName().toLowerCase().contains("iphone")).toList();
               list.forEach(System.out::println);
               return list;
            }

            public List<Product> sixPointOneInchesScreenSizeProducts(List<Product> products) {
                // TODO return products which have "6.1 inches" screen size as part of their attributes
             List<Product> list = products.stream()
                     .filter(x -> x.getAttributes().get("screen size").contains("6.1")).toList();
                //toList() returns an immutable list


             list.forEach(System.out::println);

              /* List<Product> list = products.stream()
                       .filter(x -> x.getAttributes().get("screen size").contains("6.1"))
                       .collect(Collectors.toList());
               list.forEach(System.out::println);*/
               return list;
            }

            public double sixPointOneInchesScreenSizeIPhoneAveragePriceExcludingDiscount(List<Product> products) {
                // TODO return the average price without considering the discount of the iphones which have 6.1 inches screen size

                Double output = products.stream()
                        .filter(x -> x.getName().toLowerCase().contains("iphone"))
                        .filter(x -> x.getAttributes().get("screen size").contains("6.1"))
                        .mapToDouble(x -> x.getPrice())
                        .average()
                        .orElse(-1);
                return output;

            /*    Double average = products.stream()
                        .filter(x -> x.getAttributes().get("screen size").contains("6.1") && x.getName().toLowerCase().contains("iphone"))
                        .mapToDouble(x -> x.getPrice())
                        .average()
                        .orElse(-1);
                return average;*/
               /* return products.stream()
                        .filter(p -> p.getName().toLowerCase().contains("iphone"))
                        .filter(iPhone -> iPhone.getAttributes().get("screen size").equals("6.1 inches"))
                        .mapToDouble(iphone -> iphone.getPrice()).average().orElse(-1);*/
            }

            public double sixPointOneInchesScreenSizeIPhoneAveragePriceIncludingDiscount(List<Product> products) {
                // TODO return the average price after applying the discount of the iphones which have 6.1 inches screen size
                Predicate<Product> pred1 = x -> x.getName().toLowerCase().contains("iphone");
                Predicate<Product> pred2 = x -> x.getAttributes().get("screen size").contains("6.1");
                Predicate<Product> pred3 = pred1.and(pred2);
                Double output = products.stream()
                        .filter(pred3)
                        .mapToDouble(x -> x.getPrice() * (1.00 - x.getDiscount()))
                        .average()
                        .orElse(-1);
                System.out.println(output);
                return output;
            }

            public Product productWithMaxDiscountInDollars(List<Product> products) {
                // TODO return the product which has the greatest discount in the dollars equivalent
                Product output = products.stream()
                        .max(Comparator.comparing(x->x.getPrice() * x.getDiscount()))
                        .get();
                return output;
            }
        }


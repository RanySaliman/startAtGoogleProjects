package Day5.Client;


import Day5.Exc2.Item;
import Day5.Exc2.Stock;
import Day5.Exc2.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        for (int i = 0; i < 6; i++) {
            stock.addGeneratedRandomItemByExpDate();
        }
        System.out.println("My stock - \n" + stock.toString());

        List<Item> getExpiredItemsList = stock.getExpiredItemsList();
        System.out.println("Expired Items List -");
        printItemList(getExpiredItemsList);

        Item getClosestExpDateItem = stock.getClosestExpDateItem();
        System.out.println("\nClosest Expired Date Item - \n" + getClosestExpDateItem.toString());

        List<Item> getItemsSortedAlphabetically = stock.getItemsSortedAlphabetically();
        System.out.println("\nItems Sorted Alphabetically -");
        printItemList(getItemsSortedAlphabetically);

        Item getItemByName = stock.getItemByName("Salmon");
        if(getItemByName != null){
            System.out.println("\nItems By Name Salmon- \n" + getItemByName.toString());
        }

        List<String> getNamesAboveWeight = stock.getNamesAboveWeight(5.0);
        if(getNamesAboveWeight.size() > 0){
            System.out.println("\nNames Above Weight 5.0 -");
            for(String s: getNamesAboveWeight){
                System.out.println(s);
            }
        }

        Map<Type, Integer> getMapItemsSum = stock.getMapItemsByTypeSum();
        System.out.println("\nMap Items By Type And Sum -");
        for(Map.Entry m : getMapItemsSum.entrySet()){
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }

    public static void printItemList(List<Item> items){
        for(Item item: items){
            System.out.println(item.toString());
        }
    }
}

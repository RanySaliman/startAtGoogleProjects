package Day5.Exc2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stock {

        private static List<Item> itemList;
        public Stock(){
            this.itemList = new ArrayList<>();
        }

        private static Item generateRandomItem(){
            Type enums = Type.getRandomType();
            return new Item(enums.getRandomItemName(), enums, Random.getRandomDate(), Random.getRandomWeight());
        }

        public void addGeneratedRandomItemByExpDate(){
            Item itemToAdd = generateRandomItem();
            int size = itemList.size();
            for(int i = 0; i < size; i++){
                if(itemToAdd.getDate().isBefore(itemList.get(i).getDate())){
                    itemList.add(i, itemToAdd);
                    return;
                }
            }
            itemList.add(itemToAdd);
        }

        public List<Item> getExpiredItemsList(){
            Stream<Item> expiredItem = itemList.stream().filter(item -> item.getDate().isBefore(LocalDate.now()));
            return expiredItem.collect(Collectors.toList());
        }

        public Item getClosestExpDateItem(){
            int itemIndex = getExpiredItemsList().size();
            return itemList.get(itemIndex);
        }

        public List<Item> getItemsSortedAlphabetically(){
            List<Item> list = new ArrayList<>();
            for(Item item:itemList){
                list.add(item);
            }
            list.sort(Comparator.comparing(Item::getName));
            return list;
        }

        public Item getItemByName(String name){
            Optional<Item> itemByName = itemList.stream().filter(item -> item.getName() == name).findFirst();
            if(!itemByName.isPresent()){
                System.out.println(name + " is not in stock");
                return null;
            }
            return itemByName.get();
        }

        public List<String> getNamesAboveWeight(double weight){
            Stream<Item> itemsAboveWeight = itemList.stream().filter(item -> item.getWeight() >= weight);
            List<String> namesAboveWeight = itemsAboveWeight.map(item -> item.getName()).collect(Collectors.toList());
            if (namesAboveWeight.size() == 0){
                System.out.println("There are no items above weight " + weight);
            }
            return namesAboveWeight;
        }

        public Map<Type, Integer> getMapItemsByTypeSum(){
            Map<Type,Integer> map = new HashMap<>();
            for(Type type : Type.values()){
                int count = (int)(itemList.stream().filter(item -> item.getType() == type).count());
                map.put(type, count);
            }
            return map;
        }

        public String toString(){
            StringBuilder items = new StringBuilder();
            for(Item item: itemList){
                items.append(item.toString() + "\n");
            }
            return items.toString();
        }
    }


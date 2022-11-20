import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    earnings = 0;
    itemList = new ArrayList<Item>();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    if (index < itemList.size()) {
      earnings += itemList.get(index).getCost();
      System.out.printf("%s has been sold at %d", itemList.get(index).getName(), itemList.get(index).getCost());
    }
    else {
      System.out.printf("There are only %i items in the store.", itemList.size());
    }
  }
  public void sellItem(String name){
    boolean itemCheck = false;
    int c = 0;
    while (c < itemList.size()) {
      if (itemList.get(c).getName() == name) {
        itemCheck = true;
        break;
      }
      c++;
    }
    if (itemCheck) {
      earnings += itemList.get(c).getCost();
      System.out.printf("%s has been sold at %d", itemList.get(c).getName(), itemList.get(c).getCost());
    }
    else {
      System.out.printf("The store doesn't sell this item.");
    }
  }
  public void sellItem(Item i){
    if (itemList.contains(i)) {
      earnings += i.getCost();
      System.out.printf("%s has been sold at %d", i.getName(), i.getCost());
    }
    else {
      System.out.printf("The store doesn't sell this item.");
    }
  }
  public void addItem(Item i){
    itemList.add(i);
  }
  public void filterType(String type){
    System.out.println("Items with type \"" + type + "\": ");
    for(Item i : itemList) {
      if (i.getType() == type) {
        System.out.println(i.getName());
      }
    }
  }
  public void filterCheap(double maxCost){
    System.out.println("Items with cost lower than or equal to " + maxCost + ": ");
    for(Item i : itemList) {
      if (i.getCost() <= maxCost) {
        System.out.println(i.getName());
      }
    }
  }
  public void filterExpensive(double minCost){
    System.out.println("Items with cost higher than or equal to " + minCost + ": ");
    for(Item i : itemList) {
      if (i.getCost() <= minCost) {
        System.out.println(i.getName());
      }
    }
  }
  public static void printStats(){
    for(Store s : storeList) {
      System.out.println("Store:" + s.getName() + ", Earnings: " + s.getEarnings());
    }
  }
}

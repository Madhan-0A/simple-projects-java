import java.util.*;
class item {

    int id;
    String name;
    int price;

    item(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
}
public class supermarket {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of items: ");
    int n = sc.nextInt();

    List<item> items = new ArrayList<>();

    for(int i = 0; i < n; i++){
        System.out.println(i+1+".Enter the item id: ");
        int id = sc.nextInt();

        System.out.println(i+1+".Enter the item name: ");
        String name = sc.next();

        System.out.println(i+1+".Enter the item price: ");
        int price = sc.nextInt();

        items.add(new item(id, name, price));
    }

    bubblesort(items);

    //print sorted list
    System.out.println("\n--- Sorted Item List ---");
    for(int i = 0; i < items.size(); i++){
        item s = items.get(i);
        System.out.println(i+1+".Item: "+s.name+" (ID: "+s.id+") - Price: "+s.price);
    }   
  }
    public static void bubblesort(List<item> items){
      int n = items.size();
      

      //bubble sort
      for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(items.get(j).name.compareTo(items.get(j+1).name)>0){  //compareTo 10.compareTo(20) = -1; 20.compareTo(10) = 1;
                //swap
                item temp = items.get(j);
                items.set(j,items.get(j+1));
                items.set(j+1,temp);
            }
          
        }
      }
    }
   
}

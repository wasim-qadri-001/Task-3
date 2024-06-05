import java.util.ArrayList;
import java.util.Scanner;
class Todo{
    private ArrayList<String> items;
    public Todo(){
        items=new ArrayList<>();
    }
    public void addItem(String item){
        items.add(item);
        System.out.println("The "+item+" is added to the to-do list");
    }
    public void removeItem(int index){
        if(index>=0 && index<items.size()){
        String removedItem=items.remove(index-1);
        System.out.println("The "+removedItem+" is removed from the to-do list");
        }
        else{
            System.out.println("Invalid index. Item cannot be removed!!!");
        }
    }
    public void viewList(){
        if(items.isEmpty()){
            System.out.println("The to-do list is Empty!!!");
        }
        else{
            System.out.println("The items in to-do list are:");
            for(int i=0;i<items.size();i++){
                System.out.println((i+1)+"."+items.get(i));
            }
        }
    }
}
class TodoList{
    public static void main(String args[]){
        Todo t=new Todo();
        Scanner s=new Scanner(System.in);
        boolean exit=false;
        while(!exit){
        System.out.println("Choose an Option");
        System.out.println("1.Add Item");
        System.out.println("2.Remove Item");
        System.out.println("3.View List");
        System.out.println("4.Exit");
        int choice =s.nextInt();
        switch(choice){
            case 1 : System.out.println("Enter the item to add:");
                     String item=s.next();
                     t.addItem(item);
                     break;
            case 2 :System.out.println("Enter the index of the item you want to remove:");
                    int index=s.nextInt();
                    t.removeItem(index);
                    break;
            case 3 :t.viewList();
                    break;
            case 4 :exit=true;
                    System.out.println("Exiting...!");
                    break;
            default:System.out.println("Invalid Choice ! Choose Again!!!");
        }
        }
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;



    
class Arraylist{
public static void main(String args[]){


ArrayList<Integer>list1 = new ArrayList<>();
list1.add(9);
list1.add(10);
list1.add(11);


// list1.add(3,61);
// list1.remove(2);
// list1.ensureCapacity(15);or ArrayList<Integer>list1 = new ArrayList<>(15);
//9,12,34,61,56,22,75,36,10,11
ArrayList<Integer>list2 = new ArrayList<>(Arrays.asList(12,34,56,22,75,36));
// list1.addAll(list2);//start from last 
list1.addAll(1, list2);//start from this index
// System.out.println(list1.indexOf(34));//return index number
System.out.println(list1.lastIndexOf(34));
list1.sort((obj1,obj2)->obj1-obj2);


ArrayList<String> names = new ArrayList<>();
names.add("rahul");
names.add("amit");
names.add("sneha");

names.replaceAll(str -> str.toUpperCase());

System.out.println(names);

// ListIterator<Integer>listiterator = list1.listIterator(4);//start from index
// ListIterator<Integer>listiterator = list1.listIterator();
// while(listiterator.hasNext()){

//     System.out.println("Listiterator :"+listiterator.next());
//     }

// Iterator<Integer>iterator = list1.iterator();//iterator advantage safe for elements remove without any exception
// while(iterator.hasNext()){
// iterator.remove(34);
// System.out.println("literator :"+ iterator.next());
// }
// for(Integer i:list1){//if you use for loop instead of iterator and romove elemets throws exception 
//     if(i==11){//enter values not index number
//     list1.remove(i);

//     System.out.println(i);
// }


// }


// list1.forEach(obj-> System.out.println(obj));
// list1.clear();
// System.out.println(list1.clone());
// System.out.println(list1);
// if(list1.contains(100)){
//     System.out.println("100 is present in list1");
// }
// else{
//     System.out.println("100 not present");
// }

for(int i = 0;i<list1.size();i++){
System.out.print(list1.get(i)+" ");
   
    }
System.out.println();

// ArrayList<Integer>x = new ArrayList<>(10);//9
// Scanner sc = new Scanner(System.in);


// for(int i = 0;i<11;i++){
// System.out.println("Enter number to store in arraylist");
// int n = sc.nextInt();
// x.add(n);
// }
// for(int i = 0;i<11;i++){
// // System.out.println(x.get(i));
// System.out.print(x.get(i));

// }
// System.out.println();

}

}
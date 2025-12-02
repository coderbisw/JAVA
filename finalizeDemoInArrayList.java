import java.lang.reflect.Array;
import java.util.ArrayList;

class FinalizeDemo{
    String name;
    FinalizeDemo(String name){
        this.name = name;
    }
   
    @SuppressWarnings({"deprecation", "removal"})
    @Override
    protected void finalize() throws Throwable{
     
     System.out.println("Finalize called :"+name);
    }
}

class finalizeDemoInArrayList{
public static void main(String args[]){
ArrayList<FinalizeDemo>list = new ArrayList<>();
list.add(new FinalizeDemo("Banana"));
list.add(new FinalizeDemo("Apple"));
list.add(new FinalizeDemo("Papaya"));
list.add(new FinalizeDemo("Orange"));
list.clear();
System.gc();
System.out.println(System.console());

try {
    Thread.sleep(100);  // Give GC time
} catch (Exception e) {

}

}
}
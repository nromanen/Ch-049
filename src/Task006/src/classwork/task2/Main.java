package classwork.task2;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by valer on 04.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer,String> employeeMap=new TreeMap<>();
        employeeMap.put(1,"First");
        employeeMap.put(2,"Second");
        employeeMap.put(3,"Third");
        employeeMap.put(4,"Forth");
        employeeMap.put(5,"Fifth");
        employeeMap.put(6,"Sixth");
        employeeMap.put(7,"Seventh");
        System.out.println(employeeMap);

        Scanner cin=new Scanner(System.in);
        int ID=cin.nextInt();

        ArrayList<String> buf=new ArrayList<>();
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()){
            if(entry.getKey()==ID){
                buf.add(entry.getValue());
            }
        }
        if (buf.size()>0){
            System.out.println(buf);
        }else{
            System.out.println("Non key");
        }

        String name=cin.nextLine();
        ArrayList<String> tmp=new ArrayList<>();
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()){
            if(entry.getValue().equals(name)){
                tmp.add(entry.getKey().toString());
            }
        }
        if (tmp.size()>0){
            System.out.println(tmp);
        }else{
            System.out.println("Non value");
        }

    }
}

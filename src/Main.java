
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void print(int index, Object object) {
        System.out.println(String.format("{%d}, %s", index, object.toString()));
    }







    public static void demoOperation() {
        print(1, 5 / 2);
        print(2, 5 % 2);
        print(3, 5 * 2);
        print(4, 5 - 2);
        print(5, 1 ^ 1);
        print(6, 5 & 2);
        print(7, 5 | 2);
        print(8, 5 << 2);
        print(9, 5 >> 2);
        print(10, 5 >>> 2);
        print(11, 5 != 2);
    }
    public static void democontrolFlow() {
        int score = 65;
        if (score > 80)
            print(1, "A");
        else if (score >65 ){
            print(2, "B");
        }else
            print(3, "C");
        String grade = "B";
        switch (grade) {
            case "A" :
                print(4,"优秀");
                break;
            case "B" :
                print(5, "良好");
                break;
            case "C" :
                print(6, "及格");
        }
        for (int i = 0; i < 5; i++){
            if (i == 1)
                continue;
            if (i == 4)
                break;
            if (i % 2 == 1)
                print(7,"i % 2 = 1");
            print(9, i);
        }
        String str = "hello";
        for (char c : str.toCharArray()){
            print(1,c);
        }
        int target = 20;
        int cur = 0;
        while (cur < target){
            cur += 1;
            print(1,cur);
            if (cur == 10)
                break;
        }

    }
    public static void demoString(){
        String str = "hello Evan!";
        print(1,str.charAt(1));
        print(2, str.indexOf("E"));
        print(3,str.codePointAt(2));
        print(4,str.concat("$$"));
        print(5,str.compareTo("heell"));
        print(6,str.compareTo("hello Evan!"));
        print(7,str.compareToIgnoreCase("Hello Evan!"));
        print(8, str.contains("hello"));
        print(9,str.endsWith("van!"));
        print(10,str.startsWith("hel"));
        print(11, str.lastIndexOf("!"));
        print(12,str.toUpperCase());
        print(13, str.replace("Evan", "Sylar"));
        print(14, str.replaceAll("l","m"));
        print(15,str.replaceAll("h|o", "r"));

    }
    public static void demoMap(){
        Map<String, String> map = new HashMap<>();
        int i = 0;
        while ( i < 4){
            map.put(String.valueOf(i), String.valueOf(i * i));
            i++;
        }
        for (Map.Entry<String,String> entry : map.entrySet()) {
            //print(1,entry.getKey() + ":" + entry.getValue());
            print(1,entry);
        }
        print(2,map.keySet());
        print(3,map.values());
    }
    public static void demoCommon(){
        Random random = new Random();
        random.setSeed(1);
        for (int i = 1; i < 4 ; i++){
            print(i,random.nextInt());
        }

        List<Integer> list = Arrays.asList(new Integer[]{1,2,3,4,5});
        Collections.shuffle(list);
        print(1,list);
        Date date = new Date();
        print(1,date);
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss yyyy/mm/dd");
        print(1,dateFormat.format(date));
        print(2,DateFormat.getDateInstance(DateFormat.DATE_FIELD).format(date));

    }
    public static Animal demoAnimal(){
        return new Human("LiLei",12,"China");
    }
    public static void demoClass(){
        Talking animal = new Animal("wang", 12);
        animal.say();
        animal = new Human("zhangsan",12,"China");
        animal.say();
    }
    public static void main(String[] args) {
       // System.out.pri lntln("Hello World!");
        //demoOperation();
        //democontrolFlow();
        //demoString();
        //demoMap();


        //demoAnimal();

        demoCommon();
        //demoClass();
    }
}

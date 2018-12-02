import java.util.*;

public class Main {
    private static int massSize = 200000;
    private static User[] mass ;
    private static ArrayList arr = new ArrayList();
    private static LinkedList lin = new LinkedList();
    private static HashSet hSet = new HashSet();
    private static TreeSet tSet = new TreeSet();
    private static HashMap hMap = new HashMap();
    private static TreeMap tMap = new TreeMap();


    private static long[][] info = new long[6][3];

    public static void main(String[] args) {
        generate();
        printTable();

    }

    public static void printTable(){
        info[0][0] = addElementsToList(arr);
        info[0][2] = getElementsFromList(arr);
        info[0][1] = remElementsFromList(arr);
        info[1][0] = addElementsToList(lin);
        info[1][2] = getElementsFromList(lin);
        info[1][1] = remElementsFromList(lin);
        info[2][0] = addElementsToSet(hSet);
        info[2][2] = getElementsFromSet(hSet);
        info[2][1] = remElementsFromSet(hSet);
        info[3][0] = addElementsToSet(tSet);
        info[3][2] = getElementsFromSet(tSet);
        info[3][1] = remElementsFromSet(tSet);
        info[4][0] = addElementsToMap(hMap);
        info[4][2] = getElementsFromMap(hMap);
        info[4][1] = remElementsFromMap(hMap);
        info[5][0] = addElementsToMap(tMap);
        info[5][2] = getElementsFromMap(tMap);
        info[5][1] = remElementsFromMap(tMap);

        System.out.println("-------------------------------------------------------");
        System.out.println("               add      remove      getElement");
        System.out.println("-------------------------------------------------------");
        System.out.println("Arraylist        " + info[0][0] + "     " + info[0][1]+ "     " + info[0][2]);
        System.out.println("Linkedlist       " + info[1][0] + "      " + info[1][1]+ "        " + info[1][2]);
        System.out.println("HashSet          " + info[2][0] + "     " + info[2][1]+ "       " + info[2][2]);
        System.out.println("TreeSet          " + info[3][0] + "      " + info[3][1]+ "        " + info[3][2]);
        System.out.println("HashMap          " + info[4][0] + "     " + info[4][1]+ "        " + info[4][2]);
        System.out.println("TreeMap          " + info[5][0] + "     " + info[5][1]+ "       " + info[5][2]);
    }


    public static void generate(){
        mass = new User[massSize];
        for (int i = 0; i < massSize;i++){
            mass[i] = new User();
        }
    }

    public static long addElementsToList(List list){
        long t1 = System.currentTimeMillis();
        for (int i = 0;i < mass.length;i++){
            list.add(mass[i]);
        }
        long t2 = System.currentTimeMillis();
        return t2-t1;
    }
    public static long addElementsToSet(Set set){
        long t1 = System.currentTimeMillis();
        for (int i = 0;i < mass.length;i++){
            set.add(mass[i]);
        }
        long t2 = System.currentTimeMillis();
        return t2-t1;
    }
    public static long addElementsToMap(Map map){
        long t1 = System.currentTimeMillis();
        for (int i = 0;i < mass.length;i++){
            map.put(new Date(), mass[i]);
        }
        long t2 = System.currentTimeMillis();
        return t2-t1;
    }

    public static long remElementsFromList(List list){
        long t1 = System.currentTimeMillis();
        for (int i = 0;i < mass.length;i++){
            list.remove(mass[i]);
        }
        long t2 = System.currentTimeMillis();
        return t2-t1;
    }
    public static long remElementsFromSet(Set set){
        long t1 = System.currentTimeMillis();
        for (int i = 0;i < mass.length;i++){
            set.remove(mass[i]);
        }
        long t2 = System.currentTimeMillis();
        return t2-t1;
    }
    public static long remElementsFromMap(Map map){
        long t1 = System.currentTimeMillis();
        for (int i = 0;i < mass.length;i++){
            map.remove(new Date(), mass[i]);
        }
        long t2 = System.currentTimeMillis();
        return t2-t1;
    }
    public static long getElementsFromList(List list){
        long t1 = System.currentTimeMillis();
        for (int i = 0;i < mass.length;i++){
            list.get(i);
        }
        long t2 = System.currentTimeMillis();
        return t2-t1;
    }
    public static long getElementsFromSet(Set set){
        long t1 = System.currentTimeMillis();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            iterator.next();
        }
        long t2 = System.currentTimeMillis();
        return t2-t1;
    }
    public static long getElementsFromMap(Map map){
        long t1 = System.currentTimeMillis();
        for (int i = 0;i < mass.length;i++){
            map.get(new Date());
        }
        long t2 = System.currentTimeMillis();
        return t2-t1;
    }
}

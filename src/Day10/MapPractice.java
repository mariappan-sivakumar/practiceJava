package Day10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 100);
        hashMap.put("b", 200);
        hashMap.put("c", 300);
        hashMap.put("d", 400);
        for (Map.Entry<String, Integer> element : hashMap.entrySet()) {
            System.out.print(element.getKey() + ": ");
            System.out.println(element.getValue());
        }
        System.out.println(hashMap);
//      To change element in the hashmap
        hashMap.put("c", 500);
        System.out.println("Hashmap after change: " + '\n' + hashMap);
//      To remove element in the Hashmap
        hashMap.remove("d");
        System.out.println("HashMap after remove 'd': " + '\n' + hashMap);

        hashMap.putIfAbsent("a", 200);//add value if the key is not in the hashmap. thus this line will not update "a"
        hashMap.putIfAbsent("d", 500);// but "d" is not in the hashmap so, it is added.
        System.out.println("HashMap after using putIfAbsent" + '\n' + hashMap);
        System.out.println("Does hashmap have 'a' as a key: " + hashMap.containsKey("a"));
        System.out.println("Does hashmap have 'A' as a key: " + hashMap.containsKey("A"));
        System.out.println("Does hashmap have '100' as a value: " + hashMap.containsValue(100));
        System.out.println("Does hashmap have '1000' as a value: " + hashMap.containsValue(1000));
        System.out.println("Entry set of hashmap: " + hashMap.entrySet());
        System.out.println("Key Set of hashmap: " + hashMap.keySet());
        System.out.println("Values in hashmap: " + hashMap.values());
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("e", 100);
        hashMap1.put("f", 200);
        hashMap1.put("g", 300);
        hashMap1.put("d", 400);
        hashMap.putAll(hashMap1);
        System.out.println("Hashmap is going to get appended: " + hashMap);
        System.out.println("Hashmap to be append on another hashmap" + hashMap1);
        System.out.println(hashMap);//value of the key 'd' is updated according to the hashmap1.
        int k = hashMap.getOrDefault("a", 10);
        int l = hashMap.getOrDefault("h", 10);
//        get or default method to get the value of the keys a,h where h is not in the map so, it returns the default value
        System.out.printf("Get or default value result of a, h: %d, %d%n", k, l);
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "L");
        map1.put(2, "M");
        map1.put(3, "N");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "B");
        map2.put(2, "G");
        map2.put(3, "R");

        // print map details
        System.out.println("HashMap1: " + map1);

        System.out.println("HashMap2: " + map2);

        // provide value for new key which is absent using computeIfAbsent method
        map2.forEach((key, value) -> map1.merge(key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + ", " + v2));
        // print new mapping
        System.out.println("New HashMap: " + map1);
        hashMap.compute("a", (key,value)-> value + 10);
        System.out.println(hashMap);
        hashMap.computeIfPresent("b",(key,value)->value+20);
        System.out.println(hashMap);
        hashMap.computeIfAbsent("i",key->hashMap.get("a")+20);
        System.out.println(hashMap);

        System.out.println('\n'+"Linked hash Map"+'\n');
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("Mari",5);
        linkedHashMap.put("balaji",6);
        linkedHashMap.put("raj",7);
        linkedHashMap.put("jeya",8);
        System.out.println(linkedHashMap);
        linkedHashMap.put("Mari",1);
        System.out.println(linkedHashMap);
        linkedHashMap.remove("raj");
        System.out.println(linkedHashMap);

        System.out.println('\n'+"TreeMap"+'\n');
        TreeMap<String,Integer> treeMap=new TreeMap<>();
        treeMap.put("mari",1);
        treeMap.put("balaji",2);
        treeMap.put("raj",3);
        treeMap.put("jeya",4);
        System.out.println(treeMap);
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.headMap("jeya"));
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.subMap("jeya","raj"));
        System.out.println(treeMap.subMap("jeya",true,"raj",true));
        System.out.println(treeMap.tailMap("jeya"));
        System.out.println(treeMap.tailMap("jeya",false));
        System.out.println(treeMap.values());
        System.out.println(treeMap.containsKey("mari"));
        System.out.println(treeMap.containsValue(5));
        System.out.println(treeMap.entrySet());
        System.out.println(treeMap.isEmpty());
    }


}

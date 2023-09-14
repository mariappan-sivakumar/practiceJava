import java.util.*;

public class RepeatedLetter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();

        long startTime= System.nanoTime();
        name=name.toLowerCase();
        Set<Character> letter=new LinkedHashSet<>();
        for(int i=0; i< name.length();i++){
            letter.add(name.charAt(i));
        }
        Map<Character,Integer> map=new HashMap<>();
        for(Character ch:letter){
            int temp=0;
            for(int i=0;i<name.length();i++){
                if (name.charAt(i)==ch){
                    temp+=1;
                }
            map.put(ch,temp);
            }
        }
        System.out.println(map);
        long endTime=System.nanoTime();
        System.out.println(endTime-startTime);
    }
}
package Day8;

import java.util.ArrayList;
import java.util.List;

public class NestedList {
    public static void main(String[] args) {
        List<List<Integer>> nestedList= new ArrayList<>();
        int count=0;
        for (int i = 0; i < 4; i++) {
            List<Integer> innerList=new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                innerList.add(count);
                count++;
            }
            nestedList.add(innerList);
        }
        System.out.println(nestedList);
        System.out.println(nestedList.get(1).get(2));
        nestedList=setValue(nestedList,1,2,5);
        System.out.println(nestedList);
    }
    public static List<List<Integer>> setValue(List<List<Integer>> nestedList,int row,int column, int value){
        List<Integer> inner =nestedList.get(row);
        inner.set(column,value);
        nestedList.set(row,inner);
        return nestedList;
    }
}

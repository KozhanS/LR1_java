import java.util.ArrayList;
import java.util.Arrays;

public class NumberOperations {
    public static void main(String[] args) {
        ArrayList<Float> Nums = new ArrayList<>(Arrays.asList(10f, 20.5f, 30f, 40.7f, 50f, 60.3f, 70f, 80.1f, 90f, 100.9f));
        ArrayList<Number> NewNums = new ArrayList<>();
        int a = 158;
        float b = 653.324f;
        long time = System.currentTimeMillis();
        double elem = 543.34;
        byte c = -126;
        NewNums.add(a);
        NewNums.add(b);
        NewNums.add(time);
        NewNums.add(elem);
        NewNums.add(c);
        System.out.format("NewNums arrayList: " + NewNums + "\n");

        System.out.print("Int values: ");
        for(int i =0; i < NewNums.size(); i++){
            System.out.print(NewNums.get(i).intValue());
            if (i < NewNums.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.print("\n");

        System.out.print(".2f values: ");
        for(int i =0; i < NewNums.size(); i++){
            System.out.printf("%.2f", NewNums.get(i).floatValue());
            if (i < NewNums.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.print("\n");

        ArrayList<Integer> IntList = new ArrayList<Integer>();
        ArrayList<Double> DoubleList = new ArrayList<Double>();
        ArrayList<Float> FloatList = new ArrayList<Float>();
        ArrayList<Long> LongList = new ArrayList<Long>();
        ArrayList<Byte> ByteList = new ArrayList<Byte>();

        for (Number newNum : NewNums) {
            if (newNum instanceof Integer) IntList.add(newNum.intValue());
            else if (newNum instanceof Float) FloatList.add(newNum.floatValue());
            else if (newNum instanceof Double) DoubleList.add(newNum.doubleValue());
            else if (newNum instanceof Long) LongList.add(newNum.longValue());
            else if (newNum instanceof Byte) ByteList.add(newNum.byteValue());
        }
        System.out.format("IntList: " + IntList + " FloatList: " + FloatList + " DoubleList: " + DoubleList + " LongList: " + LongList + " ByteList: " + ByteList + "\n");

        System.out.print("(Num + 10)/2 with initial List: ");
        for(float Num : Nums){
            System.out.printf("%.3f ", (Num+10)/2);
        }
        System.out.print("\n");

        System.out.print("(Num + 10)/2 with New List: ");
        for(Number NewNum : NewNums){
            System.out.printf("%.3f ", (NewNum.floatValue()+10)/2);
        }
        System.out.print("\n");
//        System.out.println(Nums);
        }
    }
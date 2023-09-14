public class Average {
    private int num1,num2,num3;

    public Average(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public Average(int num1, int num2) {
        this(num1,num2,0);

    }

    public Average(int num1) {
//        this.num1 = num1;
        this(num1,0,0);
    }

    public Average(){
        this(0,0,0);
    }
    public int getAverage(){
        int average=0;
        if(num1==0&&num2==0&&num3==0){
            average=0;
        }
        else if (num2==0&&num3==0){
            average=num1;
        } else if (num3 == 0) {
            average=(num1+num2)/2;
        } else {
            average=(num1+num2+num3)/3;
        }
        return average;
    }
    public static int average(int... numbers){
        int count=0;
        int sum=0;
        for(int number: numbers){
            count++;
            sum+=number;
        }
        return sum/count;
    }
}

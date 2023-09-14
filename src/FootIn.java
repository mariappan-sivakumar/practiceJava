public class FootIn {
    int foot;
    int inch;

    public FootIn(int foot, int inch) {
        this.foot = foot;
        this.inch = inch;
    }

    @Override
    public String toString() {
        return foot+" ft. "+inch+"in.";
    }

    public static FootIn addDistance(FootIn a,FootIn b){
        int addFoot=a.foot+ b.foot;
        int addIn=a.inch+b.inch;
        while (addIn>=12){
            addIn-=12;
            addFoot++;
        }
        return new FootIn(addFoot,addIn);
    }
}

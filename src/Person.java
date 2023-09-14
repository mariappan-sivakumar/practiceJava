public class Person {
    public static void main(String[] args) {
        Mobile normal=new Mobile();
        Mobile smartPhone=new Mobile(){
            public void call(){
                System.out.println("Group call, video call");
            }
        };
        normal.call();
        smartPhone.call();
    }

}

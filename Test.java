public class Test {
    int num1;
    int num2;
    public void add(){
     System.out.println(num1+num2);
    }
    public static void main(String[]args){
        Test T1=new Test();
        T1.num1=10;
        T1.num2=30;
        T1.add();
    }
}

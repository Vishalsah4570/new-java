public class Test2 {
    static String Institute="Qspider";
    String name;
    int age;
    long Mobile;
    public void Info(){
        System.out.println("Institute: "+Institute+"\n"+"Student Name: "+name+"\n"+"My Age "+age+"\n"+Mobile );
    }
    public static void main(String args[]){
        Test2 T=new Test2();
        T.name="Vishal Sah";
        T.age=24;
        T.Mobile=6289530080L;
        T.Info(); 
    }
}

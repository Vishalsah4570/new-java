public class Bunk {
    int a=20;
    public void display(){
        System.out.println("I am display()");
    }
    public static void main(String args[]){
        new Bunk().display();
        System.out.println(new Bunk().a);
    }
}

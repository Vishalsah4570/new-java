public class Iteratefac {
    public static void main(String args[]){
        int num=123;
       
        while(num>0){
            int last =num%10;
            int i=1; int fac=1;
            while(i<=last){
                fac=fac*i;
                i++;
            }
        System.out.println(fac);
        num=num/10;    
        }
    }
}

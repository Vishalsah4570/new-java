public class CharAtFunction {
    public static void main(String args[]){
        String n="vishal ";
        String n1="sah";
        String Fulln=n+n1;
        System.out.println(Fulln);
        System.out.println(Fulln.length());
        System.out.println(Fulln.charAt(4));
        if(n.compareTo(n1)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        if(n==n1){
            System.out.println("String are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}

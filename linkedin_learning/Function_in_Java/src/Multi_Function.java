public class Multi_Function {
    public static void multiplications(int n1, int n2){
        int M = n1 * n2;
        System.out.println("Multiplication Of "+n1+" & "+n2+" is "+M);
    }

    public static void main(String[] args) {
        multiplications(10,20);
        multiplications(30,99);
        multiplications(20,0);
    }
}

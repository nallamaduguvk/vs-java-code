public class advcalc {
    public int add(int a, int b){
        return a+b;
     }
     public int sub(int a ,int b){
        return a-b;
     }
     public int multi(int a, int b){
        return a*b;
    
     }
     public int div(int a, int b)
     {
        return a/b;
     }
        public static void main(String[] args) {
            advcalc obj = new advcalc();
            
            int r1 = obj.add(4, 3);
            int r2 = obj.sub(9, 85);
            int r3 = obj.multi(8, 25);
            int r4 = obj.div(8, 24);
            System.out.println(r1+" "+r2+" "+r3+" "+r4 );
        }
    }

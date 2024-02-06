class human
{
        private int age = 24;
        private String name ="karthik";
        public int getAge()
        {
            return age;
        }
        public String getName()
        {
            return name;
        }

}



public class object {
    public static void main(String[] args) {
        human obj = new human();
        System.out.println(obj.getAge() + " : "+obj.getName());
    }
    
}

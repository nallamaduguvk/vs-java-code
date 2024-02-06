class human
{
        private int age;
        private String name ="karthik";
        public int setAge()
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
        System.out.println(obj.setAge() + " : "+obj.getName());
    }
    
}

public class arraydemo {
    public static void main(String args[]){
        String[] friendNames = {"Raj", "priyanshu", "Suraj", "David", "satyam"};
        friendNames[3] = "ROHIT";
          for (int i = 0; i < friendNames.length; i++) {

            System.out.println(friendNames[i]);
        }
    }
}

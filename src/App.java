public class App {
    public static void main(String[] args) throws Exception {
        String s = "We wil meet *asdklahj asklh asd* friend *asdklj asdhkjh* in New Vegas!";
        String temp = "";
        boolean delete = false;

        for (char c : s.toCharArray())        {
            if (c == '*')
            {
                delete = !delete;
            }
            else{
                if (!delete)
            {
                temp += c;
            }
            }
        }
        System.out.println("Before: "+s);
        System.out.println("After: "+temp);
    }
}

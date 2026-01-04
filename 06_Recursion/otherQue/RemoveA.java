public class RemoveA {
    public static void main(String[] args) {
        remove("bacacd","");

        System.out.println(remove1("bacacd"));
    }

    private static void remove(String given, String res){
        if(given.isEmpty()){
            System.out.println(res);
            return;
        }

        char ch = given.charAt(0);

        if(ch == 'a'){
            remove(given.substring(1),res);
        }else{
            remove(given.substring(1),res+ch);
        }
    }

    private static String remove1(String given){
        if(given.isEmpty()){
            return "";
        }

        char ch = given.charAt(0);

        if(ch == 'a'){
            return remove1(given.substring(1));
        }else{
            return ch+remove1(given.substring(1));
        }
    }
}

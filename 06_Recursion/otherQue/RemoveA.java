public class RemoveA {
    public static void main(String[] args) {
        remove("bacacd","");

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


}

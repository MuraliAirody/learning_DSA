import java.util.HashMap;

public class StringToNumber {
    public static void main(String[] args) {
        String num = Solution1.convert("zero double six eight triple four");
        System.out.println(num);
    }
}


class Solution1{
    public static String convert(String s){
        HashMap<String,String>  map = new HashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        map.put("zero", "0");

       String[] sArray = s.split(" ");
       String ans = "";
       for(int i=0;i<sArray.length;i++){
          if(sArray[i].toLowerCase().equals("double")){
            ans=ans+map.get(sArray[i+1].toLowerCase())+map.get(sArray[i+1].toLowerCase());
            i++;
          }
          else if(sArray[i].toLowerCase().equals("triple")){
            ans=ans+map.get(sArray[i+1].toLowerCase())+map.get(sArray[i+1].toLowerCase())+map.get(sArray[i+1].toLowerCase());
            i++;
          }else{
            ans=ans+map.get(sArray[i].toLowerCase());
          }
       }

       return ans;
    }
}
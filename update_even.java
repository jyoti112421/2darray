
public class update_even {
    public static void main(String[] args) {
      
        String s = "jyoti";
        String Str=" ";
        for(int i=0;i<=s.length();i++){
            if(i%2==0){
                Str+='a';

            }
                else{
                    Str+=s.charAt(i);

                }
                System.out.println(Str);
            }

        }


    }
    


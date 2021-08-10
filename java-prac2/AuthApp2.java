public class AuthApp2 {
    
    public static void main(String[] args){
            // 코딩짤때는 한줄짜고 확인하고 그러한 작업이 필요함.
        String id = "egoing";
        String inputId = args[0];

        String pass ="1111";
        String pass2 ="2222";
        String Inputpass = args[1];

        System.out.println("Hi.");
        boolean isRightPass = (Inputpass.equals(pass) ||Inputpass.equals(pass2));
        if(inputId.equals(id) && isRightPass )  { 
                System.out.println("Master!");
            }
        else{
            System.out.println("Who Are You??");
        }
    }
}

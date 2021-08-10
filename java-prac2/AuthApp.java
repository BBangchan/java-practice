public class AuthApp {
    
    public static void main(String[] args){
            // 코딩짤때는 한줄짜고 확인하고 그러한 작업이 필요함.
        String id = "egoing";
        String inputId = args[0];

        String pass ="1111";
        String Inputpass = args[1];

    
        System.out.println("Hi.");

        //if(inputId == id){
        // if(inputId.equals(id)){ //inputId.equals(id)가 반환하는 것은 boolean이다.
        //     if(inputPass.equals(pass)){
        //         System.out.println("Master!");
        //     }
        //     else{
        //         System.out.println("Wrong passWord!");
        //     }
        // }
        // else{
        //     System.out.println("Who Are You??");
        // }
        if(inputId.equals(id) && Inputpass.equals(pass)){ 
                System.out.println("Master!");
            }
        else{
            System.out.println("Who Are You??");
        }
    }
}


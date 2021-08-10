public class LoopApp{

    public static void main(String[] args){

        System.out.println(1);
        System.out.println("=== while ===");
        int i = 0;
        while(i < 3) {    // 자유도가 높은 코드이다.  i의 값이 어떠한 이유로 바뀌면 while문이 바뀌게 실행될 수 있다.
            System.out.println(2); // 간섭으로 인해 코드가 망가질 수 있다.
            System.out.println(3);
            //i = i + 1;
            i += 1;
        }
        
        System.out.println("=== for ===");
        // 필수적인 요소들이 하나로 응집되어 있어서 문제가 생길 가능성이 적고, 의도파악이 쉽다.
        for(int j =0; j < 3; j++){   // for문은 무조건 j=0이 한번 실행된다. 그다음 j < 3을 체크한다.
            System.out.println(2); // 그다음 출력하고 j++이 실행되서 j가 1이되고 다시 j < 3이 체크되도록 약속이 되어있다.
            System.out.println(3);
        }

        System.out.println(4);

    }
}
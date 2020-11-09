public class Main{

    public static class Conta{
        String Agencia;
        String Conta;
        Float Saldo;
        public Conta(String a, String b, Float c){
            this.Agencia = a;
            this.Conta = b;
            this.Saldo = c;
        }
        public void deposito(Float valor){
            Saldo = Saldo + valor;
        }
        public Boolean saque(Float valor){
            if (Saldo - valor >= 0) {      
                Saldo = Saldo - valor;
                return true;
              }
              return false;
        }
        @Override
        public String toString(){
            return "(Agencia:" + Agencia + ", Conta: " + Conta + ", Saldo: " + Saldo + ")";
        }
    }

    public static class MatchTest{
        String a;
        public MatchTest(int x){
            if (x == 1){
                this.a = "um";
            }else{
                this.a = "Eh um numero";
            }
        }
        public MatchTest(String a){
            if(a == "dois"){
                this.a = "2";
            }else if(a == "tres"){
                this.a = "3";
            }else if(a == "quatro"){
                this.a = new Conta("12345", "12345", 1000f).toString();
            }else{
                this.a = "Eh uma string";
            }
        }
        public MatchTest(Conta a){
            this.a = "Eh uma conta";
        }
        @Override
        public String toString(){
            return a;
        }
    }
    public static void main(String args[]){
        System.out.println(new MatchTest("dois"));
        System.out.println(new MatchTest(1));
        System.out.println(new MatchTest(5));
        System.out.println(new MatchTest("tres"));
        System.out.println(new MatchTest("quatro"));
    }

}
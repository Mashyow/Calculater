public class Test20 {



    int summa(int a, int b, int c){
            int result = a+b+c;
            return result;
        }

        int srArfm(int a1, int b1, int c1){
            int result2 = summa(a1,b1,c1)/3;
            return result2;
        }
}

class Test21{
   public static void main(String[] args){
    Test20 t = new Test20();
    int sTCH = t.summa(1,2,3); //обращаемся к методу
    System.out.println(sTCH);
    int srArfm1 = t.srArfm(10,20,30);//обращаемся к методу
    System.out.println(srArfm1);
}
}
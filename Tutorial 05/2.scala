import scala.io.StdIn.readInt
object Q2 extends App{

    def primeNo(num:Int,n:Int=2):Int= n match{
        case x if(n==num)=>num
        case x if(num%n==0)=>0
        case x if(num%n!=0)=>primeNo(num,n+1)
    }

    def primeSeq(N:Int):Unit={
        if(N>1){
            primeSeq(N-1);
            if(primeNo(N-1)!=0){
                println(N-1);
            }
        }
    }

    printf("Enter number: ");
    var N=readInt();
    primeSeq(N);
}

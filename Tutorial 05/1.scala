import scala.io.StdIn.readInt
object Q1 extends App{

    def primeNo(num:Int,n:Int=2):Boolean= n match{
        case x if(n==num)=>true
        case x if(num%n==0)=>false
        case x if(num%n!=0)=>primeNo(num,n+1)
    }

    printf("Enter number: ");
    var a=readInt();

    printf("%b",primeNo(a));

}

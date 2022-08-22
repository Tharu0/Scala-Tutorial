import scala.io.StdIn.readInt
object Q4 extends App{

    def isEven(n:Int):Boolean=n match{
        case 0=>true
        case _=>isOdd(n-1)
    }

    def isOdd(n:Int):Boolean= !(isEven(n))

    printf("Enter number: ")
    var a=readInt();
    printf("%b",isEven(a));
}

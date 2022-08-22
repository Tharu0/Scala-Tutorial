import scala.io.StdIn.readInt
object Q3 extends App{
    def SUM(n:Int,sum:Int=0):Int=n match{
        case x if(x==1) => x;
        case x if(x>1) => x+SUM(x-1)
    }
    printf("Enter number: ")
    var n=readInt();
    println(SUM(n));
}

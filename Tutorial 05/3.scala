import scala.io.StdIn.readInt
object Q3 extends App{
    def SUM(n:Int,sum:Int=0):Int=n match{
        case 0 =>0;
        case _ => n+SUM(n-1)
    }
    printf("Enter number: ")
    var n=readInt();
    println(SUM(n));
}

import scala.io.StdIn.readInt
object Q5 extends App{
    def SUM(n:Int):Int=n match{
        case x if(x==1) => 0;
        case x if(x==2) => x;
        case x if(x%2==0) => x+SUM(x-2);
        case x if(x%2==1) => SUM(x-1);
    }
    printf("Enter number: ")
    var n=readInt();
    println(SUM(n-1));
}

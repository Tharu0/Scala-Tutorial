import scala.io.StdIn.readInt
object Q6 extends App{
    def fib(n:Int):Int=n match{
        case 0 => 0
        case x if x==1 => 1
        case _ => fib(n-1)+fib(n-2)
    }

    def fibseq(n:Int):Unit={ //No return type
        if(n>0){
            fibseq(n-1)
            println(fib(n));
        }
    }

    printf("Enter number: ")
    var n=readInt();
    fibseq(n);
}

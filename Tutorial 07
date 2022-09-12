class rational (a:Int, b:Int){
    def numer=a;
    def denom=b;
    def neg=new rational(-this.numer,this.denom)
    override def toString ="["+numer+":"+denom+"]"
}

object Q1 extends App{
    val x=new rational(4,5)
    val result=x.neg
    println("negative value: "+result.numer+"/"+result.denom)
}

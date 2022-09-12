class rational(a:Int, b:Int){
    def numer=a;
    def denom=b;
    def sub(r:rational)=new rational(numer*r.denom - r.numer*denom, r.denom*denom)
    override def toString ="["+numer+":"+denom+"]"
}

object Q2 extends App{
    val x=new rational(3,4)
    val y=new rational(5,8)
    val z=new rational(2,7)
    val result=x.sub(y).sub(z)
    println("Answer: "+result.numer+"/"+result.denom)
}

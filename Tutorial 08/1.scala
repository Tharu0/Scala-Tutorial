import scala.math._

case class Point(a:Double, b:Double){
    def x: Double=a
    def y: Double=b

    override def toString = "(" + x + "," + y + ")"

    def +(point:Point) = Point(this.x+point.x,this.y+point.y) 

    def move(dx:Double, dy:Double)=Point((x+dx),(y+dy)) 

    def distance(point:Point)= sqrt(pow(point.x-x,2)+pow(point.y-y,2))

    def invert()=Point(y,x)
}

object Q1 extends App{
    val p1=Point(4,5)    
    val p2=Point(5,6)

    println("Add two given points: "+(p1+p2))
    println("New point is "+ p1.move(3,6))
    println("Distance point: "+p1.distance(p2)) //p1-p2
    println("Invert: "+p2.invert())

}

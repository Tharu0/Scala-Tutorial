object Q4 extends App{
	def total(a:Int):Double=a*24.95
	def discount(b:Double):Double=b*0.4 
	def shippingCost(a:Int):Double=a match{
            case x if x>=50 => 3*50+(a-50)*.75
            case x if x<50 => 3*a
        }
	var amount=total(60)
	printf("%.3f",amount-discount(amount)+shippingCost(60))
}

object Q5 extends App{

    def toUpper(name:String):String={
        name.toUpperCase()
    }

    def toLower(name:String):String={
        name.toLowerCase()
    }

    def formatNames(name: String)(function: String => String):String={
        function(name)
    }

    printf(formatNames("Benny")(toUpper(_))) 
    printf("\n")

    val str1="Niroshan"
    val str2=str1.substring(0,2)
    printf(formatNames(str2)(toUpper(_))+"roshan")
    printf("\n")

    printf(formatNames("Saman")(toLower(_)))
    printf("\n")

    val str3="Kumara"
    val str4=str3.substring(5)
    printf("Kumar"+formatNames(str4)(toUpper(_)))

}
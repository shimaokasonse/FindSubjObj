import scala.io.Source

object FindObj{
  def main(args:Array[String]){
    val idset = Source.fromFile(args(0)).getLines.toSet
    val s = Source.stdin
    for (line <- s.getLines){ 
      if (idset contains line.split("\t")(2)){
	println(line)}
    }
  }
}

import scala.io.Source

object FindSubj{
  def main(args:Array[String]){
    val idset = Source.fromFile(args(0)).getLines.toSet
    val s = Source.stdin
    for (line <- s.getLines){ 
      if (idset contains line.split("\t")(0)){
	println(line)}
    }
  }
}

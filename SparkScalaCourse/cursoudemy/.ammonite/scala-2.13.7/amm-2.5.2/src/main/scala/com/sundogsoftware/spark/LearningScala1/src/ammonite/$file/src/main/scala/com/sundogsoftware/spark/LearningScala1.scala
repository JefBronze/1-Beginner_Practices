
package ammonite
package $file.src.main.scala.com.sundogsoftware.spark
import _root_.ammonite.interp.api.InterpBridge.{
  value => interp
}
import _root_.ammonite.interp.api.InterpBridge.value.{
  exit,
  scalaVersion
}
import _root_.ammonite.interp.api.IvyConstructor.{
  ArtifactIdExt,
  GroupIdExt
}
import _root_.ammonite.compiler.CompilerExtensions.{
  CompilerInterpAPIExtensions,
  CompilerReplAPIExtensions
}
import _root_.ammonite.runtime.tools.{
  browse,
  grep,
  time,
  tail
}
import _root_.ammonite.compiler.tools.{
  desugar,
  source
}
import _root_.mainargs.{
  arg,
  main
}
import _root_.ammonite.repl.tools.Util.{
  PathRead
}


object LearningScala1{
/*<script>*/val hello: String = "Hola!"

   // VARIABLES are mutable
   var helloThere: String = hello
   /*<amm>*/val res_2 = /*</amm>*/helloThere = hello + " There!"
   /*<amm>*/val res_3 = /*</amm>*/println(helloThere)

   val immutableHelloThere = hello + " There"
   /*<amm>*/val res_5 = /*</amm>*/println(immutableHelloThere)

   // Data Types

   val numberOne: Int = 1
   val truth: Boolean = true
   val letterA: Char = 'a'
   val pi: Double = 3.14159265
   val piSinglePrecision: Float = 3.14159265f
   val bigNumber: Long = 123456789
   val smallNumber: Byte = 127

   /*<amm>*/val res_13 = /*</amm>*/println("Here is a mess: " + numberOne + truth + letterA + pi + bigNumber)

   /*<amm>*/val res_14 = /*</amm>*/println(f"Pi is about $piSinglePrecision%.3f")
   /*<amm>*/val res_15 = /*</amm>*/println(f"Zero padding on the left: $numberOne%05d")

   /*<amm>*/val res_16 = /*</amm>*/println(s"I can use the s prefix to use variables like $numberOne $truth $letterA")

   /*<amm>*/val res_17 = /*</amm>*/println(s"The s prefix isn't limited to variables; I can include any expression. Like ${1+2}")

   val theUltimateAnswer: String = "To life, the universe, and everything is 42."
   val pattern = """.* ([\d]+).*""".r
   val pattern(answerString) = theUltimateAnswer
   val answer = answerString.toInt
   /*<amm>*/val res_22 = /*</amm>*/println(answer)

   // Booleans
   val isGreater = 1 > 2
   val isLesser = 1 < 2
   val impossible = isGreater & isLesser
   val anotherWay = isGreater || isLesser

   val picard: String = "Picard"
   val bestCaptain: String = "Picard"
   val isBest: Boolean = picard == bestCaptain

   // EXERCISE
   // Write some code that takes the value of pi, doubles it, and then prints it within a string with
   // three decimal places of precision to the right.
/*</script>*/ /*<generated>*/
def $main() = { scala.Iterator[String]() }
  override def toString = "LearningScala1"
  /*</generated>*/
}

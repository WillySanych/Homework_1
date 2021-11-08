import scala.io.StdIn

object Main extends App{

  val pyramidService = new PyramidService

  print("Enter pyramid length: ")
  val length = StdIn.readDouble()

  print("Enter pyramid width: ")
  val width = StdIn.readDouble()

  print("Enter pyramid height: ")
  val height = StdIn.readDouble()

  val pd = PyramidData(length, width, height)

  val res = pyramidService.volume(pd)
  println("Pyramid volume = " + res)

  println("Press ENTER to exit the program.")
  StdIn.readLine()

}

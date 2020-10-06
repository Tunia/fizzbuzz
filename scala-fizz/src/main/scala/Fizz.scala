import cats.effect._

object Fizz extends IOApp {

  override def run(args: List[String]): IO[ExitCode] =
    args.map(_.toInt) match {
      case List(i) =>
        fs2.Stream
          .range(1, i + 1)
          .evalMap(x =>
            IO {
              List(5, 3).map(x % _) match {
                case List(0, 0) => println("FizzBuzz")
                case List(0, _) => println("Buzz")
                case List(_, 0) => println("Fizz")
                case _          => println(x)
              }
            }
          )
          .compile
          .drain
          .as(ExitCode.Success)
    }
}

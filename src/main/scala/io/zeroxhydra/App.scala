package io.zeroxhydra

import cats.effect.{IO, IOApp}
import io.zeroxhydra.console.impl.TerminalImpl

object App extends IOApp.Simple {

  type Effect[T] = IO[T]

  val terminal = new TerminalImpl[Effect]()

  val run: IO[Unit] =
    for {
      _ <- terminal.print("Hello, enter you name")
      name <- terminal.read()
      _ <- terminal.clearScreen()
      _ <- terminal.print(s"Hello $name")
    } yield ()

}

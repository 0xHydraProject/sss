package io.zeroxhydra.console.impl

import cats.effect.Async
import cats.effect.std.Console
import io.zeroxhydra.console.Terminal

case class TerminalImpl[F[_]]()(implicit c: Console[F], F: Async[F]) extends Terminal[F] {

  override def read(): F[String] = Console[F].readLine

  override def print(s: String): F[Unit] = Console[F].println(s)

  override def clearScreen(): F[Unit] = F.pure(println("\u001b[H\u001b[2J"))
}

package io.zeroxhydra.console

trait Terminal[F[_]] {

  def read(): F[String]

  def print(s: String): F[Unit]

  def clearScreen(): F[Unit]

}
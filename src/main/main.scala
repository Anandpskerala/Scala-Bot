import info.mukel.telegrambot4s.api.RequestHandler
import info.mukel.telegrambot4s.api.declarative.Commands
import info.mukel.telegrambot4s.api.{Polling, TelegramBot}

import scala.util.Try
import scala.concurrent.Future


object RunBot extends TelegramBot with Polling with Commands {
  lazy val token = "bot token"

  onCommand("/start") { implicit msg => reply("Hello World!") }
  
}


object BotApp extends App {
  RunBot.run()
}

import com.bot4s.telegram.api.RequestHandler
import com.bot4s.telegram.api.declarative.Commands
import com.bot4s.telegram.api.{Polling, TelegramBot}

import scala.util.Try
import scala.concurrent.Future
import slogging._


object RunBot extends TelegramBot 
  with Polling
  with Commands {


  lazy val token = "bot token"

  onCommand("/start") { implicit msg => 
    replyMd("*Hello World!*")
  }
  
}


object BotApp extends App {
  LoggerConfig.factory = PrintLoggerFactory()
  LoggerConfig.level = LogLevel.DEBUG
  
   // To run the bot
  RunBot.run()
  println("Successfully started the bot.\nLicensed under MIT by @Anandpskerala")
}

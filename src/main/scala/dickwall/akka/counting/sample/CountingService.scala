package dickwall.akka.counting.sample

import dickwall.akka.counting.config.ConfigModule

/**
 * A simple service that can increment a number. Also demonstrated is injecting 
 * a Typesafe config into the service.
 */
class CountingService(implicit configModule: ConfigModule) {
  val incrementBy = configModule.config.getInt("count.increment-by")
  def increment(count: Int): Int = count + incrementBy
}

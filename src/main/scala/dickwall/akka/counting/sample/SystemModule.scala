package dickwall.akka.counting.sample

import dickwall.akka.counting.config.ConfigModule

/**
 * Created by dick on 12/8/14.
 */
trait SystemModule extends CountingModule with AuditModule with ConfigModule

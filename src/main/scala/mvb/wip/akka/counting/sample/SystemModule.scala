package mvb.wip.akka.counting.sample

import mvb.wip.akka.counting.config.ConfigModule

/**
 * Created by dick on 12/8/14.
 */
trait SystemModule extends CountingModule with AuditModule with ConfigModule

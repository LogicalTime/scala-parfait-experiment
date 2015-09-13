package dickwall.akka.counting.sample

import akka.actor.ActorRef
import dickwall.akka.counting.config.ConfigModule

trait AuditModule {
  def auditCompanion: ActorRef
  def auditBus: ActorRef
}

trait StandardAuditModule extends AuditModule { this: ConfigModule =>
  lazy val auditCompanion: ActorRef = actorSystem.actorOf(AuditCompanion.props(this), AuditCompanion.name)
  lazy val auditBus: ActorRef = actorSystem.actorOf(AuditBus.props, AuditBus.name)
}

package mvb.wip.parfait1

/**
 * Created by Mark on 9/5/2015.
 */
//import com.softwaremill.macwire._
trait OverallSystem extends ResolverSystemBP with DBNumerologerBP
trait ResolverSystemBP{ def resolverSystem: ResolverSystem}
trait ResolverSystem extends DbAccessBP with NameResolverBP with SiteAddressPrinterBP

object OverallSystemImpl extends OverallSystem with DBNumerologerBP{
  implicit val resolverSystem = ResolverSystemImpl
  val dbNumerologer: DbNumerologer = new DBNumerologerImpl
}

object ResolverSystemImpl extends ResolverSystem {  //TODO Q: Highest level dependencies go here? (Or make higher level), things that depend on them go at the next level or in this file?
  // TODO A: with DBNumerologer you pass in the whole system and you can keep doing that deeper and deeper (might violate reusable code) where as here you have to explicitly mention deps
  implicit val dbAccess: DbAccess = FakeDbAccess
  implicit val nameResolver: NameResolver = MockAddrNameResolver
  implicit val siteAddressPrinter: SiteAddressPrinter = new SiteAddressPrinterImpl //Could use macwire here instead of everything being implicit but then deps don't keep getting passed down?...
  // maybe use macwire all the way down?
  //TODO Q: Do dependencies that use these go here or at the next lower level? eg class DbAccessUserImpl(implicit val dbAccess: DbAccess)

}



object SystemApp extends App{ // next level is stuff that requires the top level dependencies taking stuff as implicit arguments
  val overallSystem = OverallSystemImpl
  import overallSystem._


  resolverSystem.siteAddressPrinter.printSiteAndAddress(1)
  
  


  assert(dbNumerologer.numerForIndex(1) == 2)
  assert(dbNumerologer.numerForIndex(2) == 8)
}
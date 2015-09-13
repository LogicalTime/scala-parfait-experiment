package mvb.wip.parfait1

/**
 * Created by Mark on 9/5/2015.
 */
trait NameResolverBP { val nameResolver: NameResolver }
trait NameResolver { def addressForName(name: String): Option[String] }
// TODO add classes to this for Address, Sitename how do those play into this?

object InetAddrNameResolver extends NameResolver {
  // used to be actual internet lookup, but was too mutable, so fake slow now.
  def addressForName(name: String): Option[String] = {
    Thread.sleep(2000)
    MockAddrNameResolver.addressForName(name)
  }
}

object MockAddrNameResolver extends NameResolver {
  def addressForName(name: String): Option[String] = name match {
    case "localhost" => Some("127.0.0.1")
    case "www.cnn.com" => Some("157.166.248.10")
    case "www.slashdot.org" => Some("216.34.181.48")
    case _ => None
  }
}

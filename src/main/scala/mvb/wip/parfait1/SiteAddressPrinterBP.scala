package mvb.wip.parfait1

/**
 * Created by Mark on 9/5/2015.
 */
trait SiteAddressPrinterBP{ val siteAddressPrinter: SiteAddressPrinter}

trait SiteAddressPrinter{
  def getSiteAndAddress(index:Int): (String,Option[String])
  def printSiteAndAddress(index:Int): Unit
}

class SiteAddressPrinterImpl( implicit val dbAccess: DbAccess, val nameResolver: NameResolver) extends SiteAddressPrinter{
  def getSiteAndAddress(index:Int): (String,Option[String]) = {
    def siteName = dbAccess.lookupSite(index)
    def address = nameResolver.addressForName(siteName)
    def result = (siteName,address)
    result
  }
  def printSiteAndAddress(index:Int) = 0 to index map getSiteAndAddress foreach println
}

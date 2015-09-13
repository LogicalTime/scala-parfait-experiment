package mvb.wip.parfait1

import scala.annotation.tailrec

/**
 * Created by Mark on 9/5/2015.
 */





trait DbAccessBP { val dbAccess: DbAccess }
trait DbAccess {
  val sites = IndexedSeq("localhost", "www.cnn.com", "www.slashdot.org")
  def lookupSite(i: Int): String
}

object SlowDbAccess extends DbAccess {
  def lookupSite(i: Int) = {
    Thread.sleep(2000)
    sites(i)   // really complex DB operation
  }
}

object FakeDbAccess extends DbAccess {
  def lookupSite(i: Int) = {
    sites(i)   // just like the above, but fast
  }
}




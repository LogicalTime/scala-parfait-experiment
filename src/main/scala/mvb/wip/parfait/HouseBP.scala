package mvb.wip.parfait

/**
 * Created by Mark on 9/4/2015.
 */





trait HouseBP { def house: House}
trait House{ def visit():Unit}

trait TownhouseBPImpl extends HouseBP{

  def house: House = new House {
    override def visit(): Unit = println(s"you have visited a Townhouse")
  }
}

trait SugarShackBPImpl extends HouseBP{

  def house: House = new House {
    override def visit(): Unit = println(s"you have visited the SugarShack")
  }
}
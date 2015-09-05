package mvb.wip.parfait.backyard

/**
 * Created by Mark on 9/4/2015.
 */
trait GardenBP { def garden:Garden }
trait Garden{ def plant(): Unit }

trait GardenBPImpl extends GardenBP{
  def garden = new Garden {
    override def plant(): Unit = println("you have planted tomato seeds")
  }
}

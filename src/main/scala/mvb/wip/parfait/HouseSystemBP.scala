package mvb.wip.parfait

import mvb.wip.parfait.backyard._

/**
 * Created by Mark on 9/4/2015.
 */
trait HouseSystemBP{ def houseSystem: HouseSystem}

trait HouseSystem extends HouseBP with BackYardBP

object TownHouseSystemImpl extends HouseSystem
with TownhouseBPImpl
with GreenBackYardBPImpl
with GardenBPImpl

object SugarShackHouseSystemImpl extends HouseSystem
with SugarShackBPImpl
with BlueBackYardBPImpl
with PondBPImpl

object HouseSystemEnrichments{
  implicit class RichHouseSystem(val houseSystem: HouseSystem) extends AnyVal{
    def doItAll() = houseSystem.house.visit()
  }
}

object HouseSystemApp extends App{
  import HouseSystemEnrichments._

  TownHouseSystemImpl.doItAll()
  SugarShackHouseSystemImpl.doItAll()

}

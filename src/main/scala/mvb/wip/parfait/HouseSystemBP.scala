package mvb.wip.parfait

import mvb.wip.parfait.backyard._

/**
 * Created by Mark on 9/4/2015.
 */
trait HouseSystemBP extends HouseBP with BackYardBP

object TownHouseSystemBPImpl extends HouseSystemBP
with TownhouseBPImpl
with GreenBackYardBPImpl
with GardenBPImpl

object SugarShackHouseSystemBPImpl extends HouseSystemBP
with SugarShackBPImpl
with BlueBackYardBPImpl
with PondBPImpl

class DoItAll( houseSystemBP: HouseSystemBP){
  houseSystemBP.house.visit()
}

object HouseSystemApp extends App{

  new DoItAll(TownHouseSystemBPImpl)
  new DoItAll(SugarShackHouseSystemBPImpl)

}

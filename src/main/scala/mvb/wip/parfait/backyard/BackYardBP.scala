package mvb.wip.parfait.backyard

/**
 * Created by Mark on 9/4/2015.
 */
trait BackYardBP


trait GreenBackYardBPImpl extends BackYardBP{
  this: GardenBP =>
  garden.plant()
}


trait BlueBackYardBPImpl extends BackYardBP{
  this: PondBP =>
  pond.throwSomethingIn()
}

trait GreenAndBlueBackYardBPImpl extends BackYardBP{
  this: PondBP with GardenBP =>
  garden.plant()
  pond.throwSomethingIn()
}
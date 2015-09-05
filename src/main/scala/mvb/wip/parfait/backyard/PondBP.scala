package mvb.wip.parfait.backyard

/**
 * Created by Mark on 9/4/2015.
 */
trait PondBP { def pond:Pond }
trait Pond{ def throwSomethingIn(): Unit }

trait PondBPImpl extends PondBP{
  def pond = new Pond {
    override def throwSomethingIn(): Unit = println("you have thrown a rock into the pond")
  }
}

package mvb.wip.selftypes.nested

/**
 * Created by Mark on 9/2/2015.
 */
object NestedSelfTypes extends App{
//println(EndOfWorld)
}

//object EndOfWorld extends Y with HappyRouteBPImpl
//
//trait HappyRouteBP{
//  def happyRoute: HappyRoute
//}
//
//trait HappyRoute{ def happyPrint():Unit }
//
//trait HappyRouteBPImpl extends HappyRouteBP{
//  val happyRoute = new HappyRoute {
//    override def happyPrint(): Unit = println("printing happy stuff")
//  }
//}
//
//trait Z{
//  this: HappyRouteBP =>
//}
//
//
//
//trait Y{
//  outer: HappyRouteBP =>
//  val outerTemp = outer
//  val z: Z = new Z with HappyRouteBP{
//    import outerTemp._
//  }
//}
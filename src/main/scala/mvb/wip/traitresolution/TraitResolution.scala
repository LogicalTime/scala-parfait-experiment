package mvb.wip.traitresolution

/**
 * Created by Mark on 9/5/2015.
 */
object TraitResolution extends App{
  new C{}
}

trait A{
  def foo: String = "hello from A"
}
trait B
  extends A  //I expect A to be mixed in, it to be a supertype and because of that it's constructor will be run before B's constructor
{
//  this: A =>  //says I expect A to be mixed in, I don't care if it's constructor is run yet
  def bar = foo + " World"
}
trait C extends {
//  override val foo = "Hello early"
} with B
//with A
{
  override val foo = "Hello Unsafe"  //says ignore other references to foo, all references to foo point here even if C's constructor isn't run yet and this foo is null
//  override lazy val foo = "Hello"
  println(bar)
}
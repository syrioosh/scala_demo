import org.scalatest.FunSuite
import myapp._
class ExampleSuite  extends FunSuite {

  test("test 2 expected values are equal") {
    assert(2 === 2)
  }

  test("test meow fun") {
    assert("meow" === MyApp.meow)
  }


}
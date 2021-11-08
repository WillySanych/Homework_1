import org.scalatest._
import org.scalatest.flatspec._
import org.scalatest.matchers._

import java.awt.Rectangle

class PyramidServiceSpec extends AnyFlatSpec with should.Matchers{

  def victim() = new PyramidService

  "PyramidService" should "calculate area for given pyramid data" in {
    val pd = PyramidData(3,4,3)

    victim().volume(pd) should be (12)
  }

  it should "return zero if length is zero" in {
    val pd = PyramidData (0,4,3)

    victim().volume(pd) should be (0)
  }

  it should "return zero if width is zero" in {
    val pd = PyramidData (3,0,3)

    victim().volume(pd) should be (0)
  }

  it should "return zero height is zero" in {
    val pd = PyramidData (3,4,0)

    victim().volume(pd) should be (0)
  }
}

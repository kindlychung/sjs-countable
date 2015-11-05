package vu.co.kaiyin

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

/**
  * Created by kaiyin on 04/11/2015.
  */
package object mathjax {
  @JSName("MathJax")
  @js.native
  object MathJax extends js.Object {
    @js.native
    object Hub extends js.Object {
      def getAllJax(id: String): Jax = js.native
      @js.native
      object queue extends js.Object {
        def Push(p: PushItem): js.Any = js.native
      }
    }

  }


  @ScalaJSDefined
  trait Jax extends js.Object
  @ScalaJSDefined
  trait PushItem extends js.Array[Any]
  object PushItem {
    def apply(pushType: String, jax: Jax, toDisplay: String): PushItem = {
      js.Array[Any](pushType, jax, toDisplay).asInstanceOf[PushItem]
    }
  }

}

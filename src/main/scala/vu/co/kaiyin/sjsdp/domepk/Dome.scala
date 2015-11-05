package vu.co.kaiyin.sjsdp.domepk

import org.querki.jquery.JQuery
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
/**
  * Created by kaiyin on 05/11/2015.
  */
object Dome {


  /**
    * Created by kaiyin on 05/11/2015.
    */

    @JSName("dome")
    @js.native
    object dome extends js.Object {
      def get(selector: String): Dome = js.native
      def get(selector: JQuery): Dome = js.native
    }


    trait Dome extends js.Object {
      def map[A](callback: js.ThisFunction2[Dome, dom.Element, Int, A]): js.Array[A] = js.native
      def forEach(callback: js.ThisFunction2[Dome, dom.Element, Int, js.Any]): this.type = js.native
    }


}

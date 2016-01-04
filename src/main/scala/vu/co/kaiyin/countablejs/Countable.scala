package vu.co.kaiyin.countablejs

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

/**
  * Created by kaiyin on 05/11/2015.
  */
@JSName("Countable")
@js.native
object Countable extends js.Object {
  def live(e: js.Array[dom.Element], callback: js.ThisFunction1[dom.Element, CountResult, _], options: CountOpts): Unit = js.native
  def live(e: js.Array[dom.Element], callback: js.ThisFunction1[dom.Element, CountResult, _]): Unit = js.native
  def live(e: dom.Element, callback: js.ThisFunction1[dom.Element, CountResult, _], options: CountOpts): Unit = js.native
  def live(e: dom.Element, callback: js.ThisFunction1[dom.Element, CountResult, _]): Unit = js.native
  def once(e: js.Array[dom.Element], callback: js.ThisFunction1[dom.Element, CountResult, _], options: CountOpts): this.type = js.native
  def once(e: js.Array[dom.Element], callback: js.ThisFunction1[dom.Element, CountResult, _]): this.type = js.native
  def once(e: dom.Element, callback: js.ThisFunction1[dom.Element, CountResult, _], options: CountOpts): this.type = js.native
  def once(e: dom.Element, callback: js.ThisFunction1[dom.Element, CountResult, _]): this.type = js.native
  def die(e: js.Array[dom.Element]): this.type = js.native
  def enabled(e: dom.Element): Boolean = js.native
}

@ScalaJSDefined
trait CountOpts extends js.Array[Boolean]
object CountOpts {
  def apply(hardReturns: Boolean, stripTags: Boolean, ignoreReturns: Boolean, ignoreZeroWidth: Boolean): CountOpts = {
    js.Array(hardReturns, stripTags, ignoreReturns, ignoreZeroWidth).asInstanceOf[CountOpts]
  }
  def apply(): CountOpts = {
    js.Array(false, false, true, true).asInstanceOf[CountOpts]
  }
}

@js.native
trait CountResult extends js.Object {
  def paragraphs: Int = js.native
  def sentences: Int = js.native
  def words: Int = js.native
  def characters: Int = js.native
  def all: Int = js.native
}




package breeze.linalg.support

/*
 Copyright 2012 David Hall

 Licensed under the Apache License, Version 2.0 (the "License")
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
/**
 *
 * This trait is for multi-dimensional tensors that can logically have one of their
 * dimensions "collapsed", e.g. summing out all columns of a matrix to give a column
 * vector.
 *
 * @author dlwh
 * @tparam From the tensor being collapsed
 * @tparam Axis which axis is being collapsed. Usually a subtype of [[breeze.linalg.Axis.Value]]
 * @tparam ColType the type of the "column" (or row or...) being collapsed.
 */
trait CanTraverseAxis[From, Axis, ColType] {
  def apply[A](from: From, axis: Axis)(f: ColType => A): Unit

}

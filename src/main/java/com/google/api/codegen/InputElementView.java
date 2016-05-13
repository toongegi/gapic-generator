/* Copyright 2016 Google Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.api.codegen;

import com.google.api.tools.framework.model.Model;
import com.google.api.tools.framework.model.ProtoElement;

/**
 * An implementation of InputElementProvider is a strategy object, encapsulating a strategy for
 * retrieving a ProtoElement from a model.
 */
public interface InputElementView<InputElementT extends ProtoElement> {
  public Iterable<InputElementT> getElementIterable(Model model);
}
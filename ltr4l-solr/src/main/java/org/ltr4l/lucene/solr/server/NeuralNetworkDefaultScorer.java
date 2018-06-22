/*
 * Copyright 2018 org.LTR4L
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ltr4l.lucene.solr.server;

import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.lucene.search.DocIdSetIterator;
import org.apache.lucene.search.Weight;
import org.ltr4l.Ranker;

import java.util.List;

public class NeuralNetworkDefaultScorer extends AbstractNeuralNetworkScorer {

  public NeuralNetworkDefaultScorer(Weight luceneWeight, List<FieldFeatureExtractor[]> featuresSpec,
                                    DocIdSetIterator iterator, GenericObjectPool<Ranker> rankerPool){
//                                    DocIdSetIterator iterator, Ranker ranker){
//    super(luceneWeight, featuresSpec, iterator, ranker);
    super(luceneWeight, featuresSpec, iterator, rankerPool);
  }
}

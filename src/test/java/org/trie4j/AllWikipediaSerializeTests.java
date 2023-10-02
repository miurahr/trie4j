/*
 * Copyright 2014 Takao Nakaguchi
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
package org.trie4j;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.trie4j.louds.BytesConstantTimeSelect0TailLOUDSPPTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest;
import org.trie4j.louds.LongsConstantTimeSelect0TailLOUDSPPTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest;
import org.trie4j.louds.LongsTailLOUDSPPTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest;
import org.trie4j.louds.TailLOUDSPPTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    /*
    	HashSetWikipediaSerializeTest.class,
    	TreeSetWikipediaSerializeTest.class,
    	PatriciaTrieWikipediaSerializeTest.class,
    	TailPatriciaTrieWithConcatTailBuilderWikipediaSerializeTest.class,
    	TailPatriciaTrieWithConcatTailBuilderRebuildTrieWikipediaSerializeTest.class,
    	TailPatriciaTrieWithSuffixTrieTailBuilderWikipediaSerializeTest.class,
    	DoubleArrayWikipediaSerializeTest.class,
    	TailDoubleArrayWithConcatTailBuilderWikipediaSerializeTest.class,
    	TailDoubleArrayWithSuffixTrieTailBuilderWikipediaSerializeTest.class,
    	TailDoubleArrayWithSuffixTrieDenseIndexTailArrayBuilderWikipediaSerializeTest.class,
    	TailLOUDSTrieWithConcatTailArrayWikipediaSerializeTest.class,
    	ConstantTimeSelect0TailLOUDSTrieWithConcatTailArrayWikipediaSerializeTest.class,
    	LongsTailLOUDSTrieWithConcatTailArrayWikipediaSerializeTest.class,
    	TailLOUDSTrieWithSBVConcatTailArrayWikipediaSerializeTest.class,
    	TailLOUDSTrieWithSuffixTrieTailArrayWikipediaSerializeTest.class,
    	TailLOUDSTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest.class,
    	TailLOUDSPPTrieWithConcatTailArrayWikipediaSerializeTest.class,
    	TailLOUDSPPTrieWithSBVConcatTailArrayWikipediaSerializeTest.class,
    	TailLOUDSPPTrieWithSuffixTrieTailArrayWikipediaSerializeTest.class,
    */ TailLOUDSPPTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest.class,
    BytesConstantTimeSelect0TailLOUDSPPTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest.class,
    LongsTailLOUDSPPTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest.class,
    LongsConstantTimeSelect0TailLOUDSPPTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest.class,
    // */
    /*
    	MapPatriciaTrieWikipediaSerializeTest.class,
    	MapTailPatriciaTrieWithConcatTailBuilderWikipediaSerializeTest.class,
    	MapTailPatriciaTrieWithSuffixTrieTailBuilderWikipediaSerializeTest.class,
    	MapDoubleArrayWikipediaSerializeTest.class,
    	MapTailDoubleArrayWithConcatTailBuilderWikipediaSerializeTest.class,
    	MapTailDoubleArrayWithSuffixTrieTailBuilderWikipediaSerializeTest.class,
    	MapTailLOUDSTrieWithConcatTailArrayWikipediaSerializeTest.class,
    	MapTailLOUDSTrieWithSBVConcatTailArrayWikipediaSerializeTest.class,
    	MapTailLOUDSTrieWithSuffixTrieTailArrayWikipediaSerializeTest.class,
    	MapTailLOUDSTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest.class,
    	MapTailLOUDSPPTrieWithConcatTailArrayWikipediaSerializeTest.class,
    	MapTailLOUDSPPTrieWithSBVConcatTailArrayWikipediaSerializeTest.class,
    	MapTailLOUDSPPTrieWithSuffixTrieTailArrayWikipediaSerializeTest.class,
    	MapTailLOUDSPPTrieWithSuffixTrieDenseTailArrayWikipediaSerializeTest.class,
    //*/
})
public class AllWikipediaSerializeTests {}

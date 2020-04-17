package com.learning.junit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsEmptyCollection.empty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import static  org.hamcrest.Matchers.hasKey;

public class HamcrestCollectionMatcher {
	
	@Test
	public void collectionIsEmptyTest() {
		List<String> emptyList = new ArrayList<>();
		assertThat(emptyList, empty());
	}
	
	@Test
	public void collectionSizeTest() {
		List<String> items = new ArrayList<>();
		items.add("hamcrest");
		items.add("junit");
		items.add("text");
		assertThat(items, hasSize(3));
	}
	
	@Test
	public void mapHasAKeyTest() {
	    Map<String, String> map = new HashMap<>();
	    map.put("America", "NewYork");
	    assertThat(map, hasKey("America"));
	}

}
